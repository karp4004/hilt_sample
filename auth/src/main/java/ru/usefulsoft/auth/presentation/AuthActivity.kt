package ru.usefulsoft.dashboard.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_auth.*
import ru.usefulsoft.auth.R
import ru.usefulsoft.core.di.DashboardQualifier
import ru.usefulsoft.core.domain.ScreenRouter
import ru.usefulsoft.dashboard.domain.AuthInteractor
import javax.inject.Inject

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {

    private val requestButton get() = auth_button
    private val dashboardButton get() = dashboard_button

    @Inject
    lateinit var authInteractor: AuthInteractor

    @DashboardQualifier
    @Inject
    lateinit var dashboardRouter: ScreenRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        requestButton.setOnClickListener {
            authInteractor.someRequest()
        }

        dashboardButton.setOnClickListener {
            dashboardRouter.openScreen()
        }
    }
}
