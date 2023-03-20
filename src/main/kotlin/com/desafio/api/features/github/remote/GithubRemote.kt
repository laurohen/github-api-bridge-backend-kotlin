package com.desafio.api.features.github.remote

import com.desafio.api.features.github.model.Repos
import com.desafio.api.features.github.model.User

interface GithubRemote {
    suspend fun getUser(username: String): User?
    suspend fun getRepos(username: String): Repos?
}