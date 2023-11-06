package com.example.authapi.di

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@InstallIn(AuthComponent::class)
@EntryPoint
interface AuthEntryPoint {
    fun authInteractor(): IAuthInteractor
}
