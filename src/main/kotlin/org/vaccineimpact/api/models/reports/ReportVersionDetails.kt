package org.vaccineimpact.api.models.reports

import java.time.Instant

data class ReportVersionDetails(
        val name: String,
        val displayName: String?,
        val id: String,
        val date: Instant,
        val published: Boolean,
        // Maps from keys (e.g. minimal_coverage) to a hash of the data referenced by that key
        val hashData: Map<String, String>,
        // Parameter names and their values
        val parameters: Map<String, String>,
        // List of resource file names
        val resources: List<String>,
        // Maps from artefact type (e.g. staticgraph) to artefact details
        val artefacts: Map<String, Artefact>
)

data class Artefact(val description: String, val filenames: List<String>)