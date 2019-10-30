package com.chsltutorials.monitoramentometrolondres.model.service

import com.chsltutorials.monitoramentometrolondres.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url()

        val url = originalHttpUrl.newBuilder()
            .addQueryParameter("app_id", BuildConfig.AppID)
            .addQueryParameter("app_key", BuildConfig.ApiKey)
            .build()

        val requestBuilder = original.newBuilder()
            .url(url)

        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}
