package com.gutinicolas.publisher.ink.exceptions

import graphql.ErrorType


open class DataException(
    errorMessage: String? = "",
    private val parameters: Map<String, Any>? = mutableMapOf()
) : ApiException(errorMessage) {

    override val message: String?
        get() = super.message

    override fun getExtensions(): MutableMap<String, Any> {
        return mutableMapOf("parameters" to (parameters ?: mutableMapOf()))
    }

    override fun getErrorType(): ErrorType {
        return ErrorType.DataFetchingException
    }
}