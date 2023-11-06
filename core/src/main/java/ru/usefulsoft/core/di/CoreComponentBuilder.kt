package ru.usefulsoft.core.di

import dagger.hilt.DefineComponent

@DefineComponent.Builder
internal interface CoreComponentBuilder {
    fun build(): CoreComponent?
}