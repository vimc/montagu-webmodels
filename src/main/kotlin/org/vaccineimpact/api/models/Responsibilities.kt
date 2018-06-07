package org.vaccineimpact.api.models

data class ResponsibilitiesAndTouchstoneStatus(
        val responsibilities: Responsibilities,
        val touchstoneStatus: TouchstoneStatus
)

data class Responsibilities(
        val touchstone: String,
        val problems: String,
        val status: ResponsibilitySetStatus?,
        val responsibilities: List<Responsibility>) : Iterable<Responsibility>
{
    override fun iterator() = responsibilities.iterator()
}

data class ResponsibilityAndTouchstone(
        val touchstone: TouchstoneVersion,
        val responsibility: Responsibility
)

data class Responsibility(
        val scenario: Scenario,
        val status: ResponsibilityStatus,
        val problems: List<String>,
        val currentEstimateSet: BurdenEstimateSet?
)

enum class ResponsibilitySetStatus
{
    NOT_APPLICABLE,
    INCOMPLETE,
    SUBMITTED,
    APPROVED
}

enum class ResponsibilityStatus
{
    EMPTY,
    INVALID,
    VALID
}