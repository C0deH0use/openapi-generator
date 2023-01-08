/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl


import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class DefaultApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Tests default values
     * Tests default values of different parameters
     * @param pi0  (default to 10)
     * @param pi1 
     * @param pn0  (default to 10.0)
     * @param pn1 
     * @param qi0  (optional, default to 10)
     * @param qi1  (default to 71)
     * @param qi2  (optional)
     * @param qi3 
     * @param qn0  (optional, default to 10.0)
     * @param qn1  (default to 71.0)
     * @param qn2  (optional)
     * @param qn3 
     * @param hi0  (optional, default to 10)
     * @param hi1  (default to 71)
     * @param hi2  (optional)
     * @param hi3 
     * @param hn0  (optional, default to 10.0)
     * @param hn1  (default to 71.0)
     * @param hn2  (optional)
     * @param hn3 
     * @param fi0  (optional, default to 10)
     * @param fi1  (default to 71)
     * @param fi2  (optional)
     * @param fi3 
     * @param fn0  (optional, default to 10.0)
     * @param fn1  (default to 71.0)
     * @param fn2  (optional)
     * @param fn3 
     * @param fn4 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun test(pi0: kotlin.Int = 10, pi1: kotlin.Int, pn0: java.math.BigDecimal = java.math.BigDecimal("10.0"), pn1: java.math.BigDecimal, qi0: kotlin.Int? = 10, qi1: kotlin.Int = 71, qi2: kotlin.Int? = null, qi3: kotlin.Int, qn0: java.math.BigDecimal? = java.math.BigDecimal("10.0"), qn1: java.math.BigDecimal = java.math.BigDecimal("71.0"), qn2: java.math.BigDecimal? = null, qn3: java.math.BigDecimal, hi0: kotlin.Int? = 10, hi1: kotlin.Int = 71, hi2: kotlin.Int? = null, hi3: kotlin.Int, hn0: java.math.BigDecimal? = java.math.BigDecimal("10.0"), hn1: java.math.BigDecimal = java.math.BigDecimal("71.0"), hn2: java.math.BigDecimal? = null, hn3: java.math.BigDecimal, fi0: kotlin.Int? = 10, fi1: kotlin.Int = 71, fi2: kotlin.Int? = null, fi3: kotlin.Int, fn0: java.math.BigDecimal? = java.math.BigDecimal("10.0"), fn1: java.math.BigDecimal = java.math.BigDecimal("71.0"), fn2: java.math.BigDecimal? = null, fn3: java.math.BigDecimal, fn4: kotlin.collections.List<kotlin.String>) : Unit {
        val localVarResponse = testWithHttpInfo(pi0 = pi0, pi1 = pi1, pn0 = pn0, pn1 = pn1, qi0 = qi0, qi1 = qi1, qi2 = qi2, qi3 = qi3, qn0 = qn0, qn1 = qn1, qn2 = qn2, qn3 = qn3, hi0 = hi0, hi1 = hi1, hi2 = hi2, hi3 = hi3, hn0 = hn0, hn1 = hn1, hn2 = hn2, hn3 = hn3, fi0 = fi0, fi1 = fi1, fi2 = fi2, fi3 = fi3, fn0 = fn0, fn1 = fn1, fn2 = fn2, fn3 = fn3, fn4 = fn4)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Tests default values
     * Tests default values of different parameters
     * @param pi0  (default to 10)
     * @param pi1 
     * @param pn0  (default to 10.0)
     * @param pn1 
     * @param qi0  (optional, default to 10)
     * @param qi1  (default to 71)
     * @param qi2  (optional)
     * @param qi3 
     * @param qn0  (optional, default to 10.0)
     * @param qn1  (default to 71.0)
     * @param qn2  (optional)
     * @param qn3 
     * @param hi0  (optional, default to 10)
     * @param hi1  (default to 71)
     * @param hi2  (optional)
     * @param hi3 
     * @param hn0  (optional, default to 10.0)
     * @param hn1  (default to 71.0)
     * @param hn2  (optional)
     * @param hn3 
     * @param fi0  (optional, default to 10)
     * @param fi1  (default to 71)
     * @param fi2  (optional)
     * @param fi3 
     * @param fn0  (optional, default to 10.0)
     * @param fn1  (default to 71.0)
     * @param fn2  (optional)
     * @param fn3 
     * @param fn4 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun testWithHttpInfo(pi0: kotlin.Int, pi1: kotlin.Int, pn0: java.math.BigDecimal, pn1: java.math.BigDecimal, qi0: kotlin.Int?, qi1: kotlin.Int, qi2: kotlin.Int?, qi3: kotlin.Int, qn0: java.math.BigDecimal?, qn1: java.math.BigDecimal, qn2: java.math.BigDecimal?, qn3: java.math.BigDecimal, hi0: kotlin.Int?, hi1: kotlin.Int, hi2: kotlin.Int?, hi3: kotlin.Int, hn0: java.math.BigDecimal?, hn1: java.math.BigDecimal, hn2: java.math.BigDecimal?, hn3: java.math.BigDecimal, fi0: kotlin.Int?, fi1: kotlin.Int, fi2: kotlin.Int?, fi3: kotlin.Int, fn0: java.math.BigDecimal?, fn1: java.math.BigDecimal, fn2: java.math.BigDecimal?, fn3: java.math.BigDecimal, fn4: kotlin.collections.List<kotlin.String>) : ApiResponse<Unit?> {
        val localVariableConfig = testRequestConfig(pi0 = pi0, pi1 = pi1, pn0 = pn0, pn1 = pn1, qi0 = qi0, qi1 = qi1, qi2 = qi2, qi3 = qi3, qn0 = qn0, qn1 = qn1, qn2 = qn2, qn3 = qn3, hi0 = hi0, hi1 = hi1, hi2 = hi2, hi3 = hi3, hn0 = hn0, hn1 = hn1, hn2 = hn2, hn3 = hn3, fi0 = fi0, fi1 = fi1, fi2 = fi2, fi3 = fi3, fn0 = fn0, fn1 = fn1, fn2 = fn2, fn3 = fn3, fn4 = fn4)

        return request<Map<String, PartConfig<*>>, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation test
     *
     * @param pi0  (default to 10)
     * @param pi1 
     * @param pn0  (default to 10.0)
     * @param pn1 
     * @param qi0  (optional, default to 10)
     * @param qi1  (default to 71)
     * @param qi2  (optional)
     * @param qi3 
     * @param qn0  (optional, default to 10.0)
     * @param qn1  (default to 71.0)
     * @param qn2  (optional)
     * @param qn3 
     * @param hi0  (optional, default to 10)
     * @param hi1  (default to 71)
     * @param hi2  (optional)
     * @param hi3 
     * @param hn0  (optional, default to 10.0)
     * @param hn1  (default to 71.0)
     * @param hn2  (optional)
     * @param hn3 
     * @param fi0  (optional, default to 10)
     * @param fi1  (default to 71)
     * @param fi2  (optional)
     * @param fi3 
     * @param fn0  (optional, default to 10.0)
     * @param fn1  (default to 71.0)
     * @param fn2  (optional)
     * @param fn3 
     * @param fn4 
     * @return RequestConfig
     */
    fun testRequestConfig(pi0: kotlin.Int, pi1: kotlin.Int, pn0: java.math.BigDecimal, pn1: java.math.BigDecimal, qi0: kotlin.Int?, qi1: kotlin.Int, qi2: kotlin.Int?, qi3: kotlin.Int, qn0: java.math.BigDecimal?, qn1: java.math.BigDecimal, qn2: java.math.BigDecimal?, qn3: java.math.BigDecimal, hi0: kotlin.Int?, hi1: kotlin.Int, hi2: kotlin.Int?, hi3: kotlin.Int, hn0: java.math.BigDecimal?, hn1: java.math.BigDecimal, hn2: java.math.BigDecimal?, hn3: java.math.BigDecimal, fi0: kotlin.Int?, fi1: kotlin.Int, fi2: kotlin.Int?, fi3: kotlin.Int, fn0: java.math.BigDecimal?, fn1: java.math.BigDecimal, fn2: java.math.BigDecimal?, fn3: java.math.BigDecimal, fn4: kotlin.collections.List<kotlin.String>) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "fi0" to PartConfig(body = fi0, headers = mutableMapOf()),
            "fi1" to PartConfig(body = fi1, headers = mutableMapOf()),
            "fi2" to PartConfig(body = fi2, headers = mutableMapOf()),
            "fi3" to PartConfig(body = fi3, headers = mutableMapOf()),
            "fn0" to PartConfig(body = fn0, headers = mutableMapOf()),
            "fn1" to PartConfig(body = fn1, headers = mutableMapOf()),
            "fn2" to PartConfig(body = fn2, headers = mutableMapOf()),
            "fn3" to PartConfig(body = fn3, headers = mutableMapOf()),
            "fn4" to PartConfig(body = fn4, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (qi0 != null) {
                    put("qi0", listOf(qi0.toString()))
                }
                put("qi1", listOf(qi1.toString()))
                if (qi2 != null) {
                    put("qi2", listOf(qi2.toString()))
                }
                put("qi3", listOf(qi3.toString()))
                if (qn0 != null) {
                    put("qn0", listOf(qn0.toString()))
                }
                put("qn1", listOf(qn1.toString()))
                if (qn2 != null) {
                    put("qn2", listOf(qn2.toString()))
                }
                put("qn3", listOf(qn3.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        hi0?.apply { localVariableHeaders["hi0"] = this.toString() }
        hi1.apply { localVariableHeaders["hi1"] = this.toString() }
        hi2?.apply { localVariableHeaders["hi2"] = this.toString() }
        hi3.apply { localVariableHeaders["hi3"] = this.toString() }
        hn0?.apply { localVariableHeaders["hn0"] = this.toString() }
        hn1.apply { localVariableHeaders["hn1"] = this.toString() }
        hn2?.apply { localVariableHeaders["hn2"] = this.toString() }
        hn3.apply { localVariableHeaders["hn3"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/test".replace("{"+"pi0"+"}", encodeURIComponent(pi0.toString())).replace("{"+"pi1"+"}", encodeURIComponent(pi1.toString())).replace("{"+"pn0"+"}", encodeURIComponent(pn0.toString())).replace("{"+"pn1"+"}", encodeURIComponent(pn1.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
