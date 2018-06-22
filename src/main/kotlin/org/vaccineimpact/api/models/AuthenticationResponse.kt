package org.vaccineimpact.api.models

import java.time.Duration

interface AuthenticationResponse

class SuccessfulAuthentication(accessToken: Compressed, lifeSpan: Duration): AuthenticationResponse
{
    val accessToken = accessToken.raw
    val tokenType = "bearer"
    val expiresIn = lifeSpan.seconds
}

data class FailedAuthentication(val error: String): AuthenticationResponse