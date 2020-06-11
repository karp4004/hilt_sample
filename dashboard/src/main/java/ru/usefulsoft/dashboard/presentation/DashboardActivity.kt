package ru.usefulsoft.dashboard.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_dashboard.*
import ru.usefulsoft.core.di.AuthQualifier
import ru.usefulsoft.core.domain.ScreenRouter
import ru.usefulsoft.dashboard.R
import ru.usefulsoft.dashboard.domain.DashboardInteractor
import javax.inject.Inject

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    private val requestButton get() = request_button
    private val authButton get() = auth_button

    @Inject
    lateinit var dashboardInteractor: DashboardInteractor

    @AuthQualifier
    @Inject
    lateinit var authRouter: ScreenRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        requestButton.setOnClickListener {
            dashboardInteractor.someRequest()
        }

        authButton.setOnClickListener {
            authRouter.openScreen()
        }
    }
}
