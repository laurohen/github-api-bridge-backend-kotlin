package com.desafio.api.httpclient

import io.ktor.client.*

interface ExternalHttpClient {
    fun getClient(): HttpClient
}