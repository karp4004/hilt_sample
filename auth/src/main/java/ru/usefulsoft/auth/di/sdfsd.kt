package ru.usefulsoft.auth.di

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent


@DefineComponent(parent = SingletonComponent::class)
internal interface MyCustomComponent