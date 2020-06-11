package ru.usefulsoft.dashboard.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import ru.usefulsoft.auth.domain.AuthRouter
import ru.usefulsoft.core.di.AuthQualifier
import ru.usefulsoft.core.domain.ScreenRouter
import ru.usefulsoft.dashboard.domain.AuthInteractor

@InstallIn(ActivityComponent::class)
@Module
object AuthModule {
    @Provides
    fun provideDashboardInteractor(): AuthInteractor {
        return AuthInteractor()
    }

    @AuthQualifier
    @Provides
    fun provideAuthRouter(@ActivityContext context: Context): ScreenRouter {
        return AuthRouter(context)
    }
}