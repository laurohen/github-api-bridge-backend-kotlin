package com.desafio.api.features.github.remote

import com.desafio.api.features.github.model.Repos
import com.desafio.api.features.github.model.User
import com.desafio.api.httpclient.ExternalHttpClientImpl
import io.ktor.client.request.*
import org.springframework.stereotype.Component

@Component
class GithubRemoteImpl(private val httpService: ExternalHttpClientImpl) : GithubRemote {
    override suspend fun getUser(username: String): User? {
        try {
            return httpService.getClient().get("https://api.github.com/users/$username")
        } catch (e: Exception) {
            return null
        }
    }

    override suspend fun getRepos(username: String): Repos? {
        try {
            return httpService.getClient().get("https://api.github.com/users/$username/repos")
        } catch (e: Exception) {
            return null
        }
    }
}