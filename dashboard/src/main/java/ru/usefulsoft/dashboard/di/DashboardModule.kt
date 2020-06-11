package ru.usefulsoft.dashboard.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import ru.usefulsoft.dashboard.domain.DashboardInteractor

@InstallIn(ActivityComponent::class)
@Module
object DashboardModule {
    @Provides
    fun provideDashboardInteractor(): DashboardInteractor {
        return DashboardInteractor()
    }
}