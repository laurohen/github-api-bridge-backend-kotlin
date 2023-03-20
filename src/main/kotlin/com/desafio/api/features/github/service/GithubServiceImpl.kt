package com.desafio.api.features.github.service

import com.desafio.api.features.github.model.UserRepos
import com.desafio.api.features.github.remote.GithubRemote
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class GithubServiceImpl(private val remote: GithubRemote) : GithubService {
    override suspend fun getUserRepos(username: String): ResponseEntity<UserRepos> {
        val user = remote.getUser(username) ?: return ResponseEntity.notFound().build()
        val repos = remote.getRepos(username)
        return ResponseEntity.ok().body(UserRepos(user, repos))
    }
}