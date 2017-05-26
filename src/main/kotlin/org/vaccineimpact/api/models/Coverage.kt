package org.vaccineimpact.api.models

import java.math.BigDecimal

data class CoverageSet(
        override val id: Int,
        val touchstone: String,
        val name: String,
        val vaccine: String,
        val gaviSupportLevel: GAVISupportLevel,
        val activityType: ActivityType
): HasKey<Int>

data class ScenarioAndCoverageSets(
        val scenario: Scenario,
        val coverageSets: List<CoverageSet>
)

data class ScenarioTouchstoneAndCoverageSets(
        val touchstone: Touchstone,
        val scenario: Scenario,
        val coverageSets: List<CoverageSet>
)

data class CoverageRow(
        val scenario: String,   //This is the scenario description ID
        val setId: Int,
        val setOrder: Int,
        val setName: String,
        val vaccine: String,
        val gaviSupportLevel: GAVISupportLevel,
        val activityType: ActivityType,
        val country: String,
        val year: Int,
        val ageFrom: BigDecimal?,
        val ageTo: BigDecimal?,
        val ageRangeVerbatim: String?,
        val target: BigDecimal?,
        val coverage: BigDecimal?
)