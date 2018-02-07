package org.vaccineimpact.api.models.validation

annotation class CanBeBlank
annotation class AllowedFormat(val pattern: String, val example: String)
annotation class MinimumLength(val length: Int)

// functionName should be the name of a Boolean returning method on the model
// dependentProperties are the names of any class properties the function references
annotation class RequiredWhen(val functionName: String, vararg val dependentProperties: String)