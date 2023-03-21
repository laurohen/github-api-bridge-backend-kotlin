package com.desafio.api.features.github.controller

import com.desafio.api.features.github.model.Repos
import com.desafio.api.features.github.model.User
import com.desafio.api.features.github.service.GithubService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://127.0.0.1:5173/"])
@RestController
@RequestMapping("/api/v1/github")
class GithubController(private val service: GithubService) {
    @GetMapping("/{username}")
    suspend fun user(@PathVariable username: String): ResponseEntity<User> {
        return service.getUser(username)
    }

    @GetMapping("/{username}/repos")
    suspend fun repos(@PathVariable username: String): ResponseEntity<Repos> {
        return service.getRepos(username)
    }
}