package org.vaccineimpact.api.models.reports

import java.beans.ConstructorProperties
import java.time.Instant

data class Report
@ConstructorProperties("name", "displayname", "latestVersion", "published", "updatedOn", "author",
        "requester")
constructor(val name: String,
            val displayName: String?,
            val latestVersion: String,
            val published: Boolean,
            val updatedOn: Instant,
            val author: String,
            val requester: String)

data class ReportVersion
@ConstructorProperties("name", "displayname", "id", "latestVersion", "published", "updatedOn", "author",
        "requester")
constructor(val name: String,
            val displayName: String?,
            val id: String,
            val latestVersion: String,
            val published: Boolean,
            val updatedOn: Instant,
            val author: String,
            val requester: String)