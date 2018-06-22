package org.vaccineimpact.api.models

data class Compressed(val raw: String)

fun String.markAsCompressed() = Compressed(this)