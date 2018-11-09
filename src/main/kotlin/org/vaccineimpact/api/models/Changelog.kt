package org.vaccineimpact.api.models

import java.beans.ConstructorProperties

data class Changelog
@ConstructorProperties("report_version", "label", "value", "fromFile")
constructor(val report_version: String,
            val label: String,
            val value: String,
            val fromFile: Boolean)