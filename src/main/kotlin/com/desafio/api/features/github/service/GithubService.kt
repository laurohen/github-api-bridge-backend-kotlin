package com.desafio.api.features.github.service

import com.desafio.api.features.github.model.Repos
import com.desafio.api.features.github.model.User
import org.springframework.http.ResponseEntity

interface GithubService {
    suspend fun getUser(username: String): ResponseEntity<User>
    suspend fun getRepos(username: String): ResponseEntity<Repos>
}