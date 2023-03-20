package com.desafio.api.features.github.controller

import com.desafio.api.features.github.model.UserRepos
import com.desafio.api.features.github.service.GithubService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/github")
class GithubController(private val service: GithubService) {
    @GetMapping("/{username}")
    suspend fun user(@PathVariable username: String): ResponseEntity<UserRepos> {
        return service.getUserRepos(username)
    }
}