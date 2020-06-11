package ru.usefulsoft.dashboard.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import ru.usefulsoft.core.di.DashboardQualifier
import ru.usefulsoft.core.domain.ScreenRouter
import ru.usefulsoft.dashboard.domain.DashboardInteractor
import ru.usefulsoft.dashboard.domain.DashboardRouter

@InstallIn(ActivityComponent::class)
@Module
object DashboardModule {
    @Provides
    fun provideDashboardInteractor(): DashboardInteractor {
        return DashboardInteractor()
    }

    @DashboardQualifier
    @Provides
    fun provideDashboardRouter(@ActivityContext context: Context): ScreenRouter {
        return DashboardRouter(context)
    }
}