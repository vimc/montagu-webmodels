package org.vaccineimpact.api.models

import org.vaccineimpact.api.models.helpers.FlexibleProperty
import java.math.BigDecimal

data class CoverageSet(
        override val id: Int,
        val touchstone: String,
        val name: String,
        val vaccine: String,
        val gaviSupport: GAVISupportLevel,
        val activityType: ActivityType
) : HasKey<Int>

data class ScenarioAndCoverageSets(
        val scenario: Scenario,
        val coverageSets: List<CoverageSet>
)

data class ScenarioTouchstoneAndCoverageSets(
        val touchstone: Touchstone,
        val scenario: Scenario,
        val coverageSets: List<CoverageSet>
)

data class LongCoverageRow(
        val scenario: String, //This is the scenario description ID
        val setName: String,
        val vaccine: String,
        val gaviSupport: GAVISupportLevel,
        val activityType: ActivityType,
        val countryCode: String,
        val country: String,
        val year: Int,
        val ageFirst: BigDecimal?,
        val ageLast: BigDecimal?,
        val ageRangeVerbatim: String?,
        val target: BigDecimal?,
        val coverage: BigDecimal?
) : CoverageRow

data class WideCoverageRow(
        val scenario: String, //This is the scenario description ID
        val setName: String,
        val vaccine: String,
        val gaviSupport: GAVISupportLevel,
        val activityType: ActivityType,
        val countryCode: String,
        val country: String,
        val ageFirst: BigDecimal?,
        val ageLast: BigDecimal?,
        val ageRangeVerbatim: String?,
        @FlexibleProperty
        val coverageAndTargetPerYear: Map<String, BigDecimal?>
) : CoverageRow

interface CoverageRow