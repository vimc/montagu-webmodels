package org.vaccineimpact.api.models.responsibilities

data class ResponsibilitySet(
        val touchstoneVersion: String,
        val modellingGroupId: String,
        val status: ResponsibilitySetStatus?,
        val responsibilities: List<Responsibility>
) : Iterable<Responsibility>
{
    override fun iterator() = responsibilities.iterator()
}

data class ResponsibilitySetWithComments(
        val touchstoneVersion: String,
        val modellingGroupId: String,
        val comment: ResponsibilityComment?,
        val responsibilities: List<ResponsibilityWithComment>
)
