package ru.usefulsoft.auth.di

import android.content.Context
import com.example.authapi.di.AuthComponent
import com.example.authapi.di.IAuthInteractor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import ru.usefulsoft.auth.domain.AuthInteractor
import ru.usefulsoft.auth.domain.AuthRouter
import ru.usefulsoft.core.di.AuthQualifier
import ru.usefulsoft.core.domain.ScreenRouter

@InstallIn(ActivityComponent::class, AuthComponent::class)
@Module
object AuthModule {
    @Provides
    fun provideDashboardInteractor(): IAuthInteractor {
        return AuthInteractor()
    }

    @AuthQualifier
    @Provides
    fun provideAuthRouter(@ActivityContext context: Context): ScreenRouter {
        return AuthRouter(context)
    }
}