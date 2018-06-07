package org.vaccineimpact.api.models

data class TouchstoneVersion(
        override val id: String,
        val name: String,
        val version: Int,
        val description: String,
        val status: TouchstoneStatus
) : HasKey<String>

enum class TouchstoneStatus
{
    IN_PREPARATION,
    OPEN,
    FINISHED
}