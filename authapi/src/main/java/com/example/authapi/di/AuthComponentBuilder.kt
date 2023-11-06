package com.example.authapi.di

import dagger.hilt.DefineComponent

@DefineComponent.Builder
interface AuthComponentBuilder {
    fun build(): AuthComponent
}