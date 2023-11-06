package ru.usefulsoft.dashboard.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import ru.usefulsoft.core.di.AuthQualifier
import ru.usefulsoft.core.domain.ScreenRouter
import ru.usefulsoft.dashboard.domain.DashboardInteractor
import ru.usefulsoft.hiltstub.databinding.ActivityDashboardBinding
import javax.inject.Inject

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    @Inject
    lateinit var dashboardInteractor: DashboardInteractor

    @AuthQualifier
    @Inject
    lateinit var authRouter: ScreenRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityDashboardBinding.inflate(layoutInflater).run {
            setContentView(root)

            this.authButton.setOnClickListener {
                dashboardInteractor.someRequest()
            }
        }
    }
}
