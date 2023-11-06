package com.example.authapi.di

import dagger.hilt.EntryPoints
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton


@Singleton
class AuthComponentProvider @Inject constructor(
    private val authComponentProvider: Provider<AuthComponentBuilder>
) {
    private val authComponent: AuthComponent = authComponentProvider.get().build()

    fun authInteractor(): IAuthInteractor {
        return EntryPoints
            .get(authComponent, AuthEntryPoint::class.java)
            .authInteractor()
    }
}
