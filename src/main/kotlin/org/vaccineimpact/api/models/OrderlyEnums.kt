package org.vaccineimpact.api.models

enum class FilePurpose
{
    SOURCE,
    SCRIPT,
    RESOURCE,
    ORDERLY_YML,
    GLOBAL;

    override fun toString(): String {
        return this.name.toLowerCase()
    }
}

enum class ArtefactFormat
{
    STATICGRAPH,
    INTERACTIVEGRAPH,
    DATA,
    REPORT,
    INTERACTIVEHTML;

    override fun toString(): String {
        return this.name.toLowerCase()
    }
}
