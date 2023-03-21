package com.desafio.api.features.github.service

import com.desafio.api.features.github.model.Repos
import com.desafio.api.features.github.model.User
import com.desafio.api.features.github.remote.GithubRemote
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class GithubServiceImpl(private val remote: GithubRemote) : GithubService {
    override suspend fun getUser(username: String): ResponseEntity<User> {
        val user = remote.getUser(username) ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok().body(user)
    }

    override suspend fun getRepos(username: String): ResponseEntity<Repos> {
        return ResponseEntity.ok().body(remote.getRepos(username))
    }
}