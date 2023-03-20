package com.desafio.api.features.github.service

import com.desafio.api.features.github.model.UserRepos
import org.springframework.http.ResponseEntity

interface GithubService {
    suspend fun getUserRepos(username: String): ResponseEntity<UserRepos>
}