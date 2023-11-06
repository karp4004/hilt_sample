package ru.usefulsoft.auth.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.authapi.di.IAuthInteractor
import dagger.hilt.android.AndroidEntryPoint
import ru.usefulsoft.core.di.DashboardQualifier
import ru.usefulsoft.core.domain.ScreenRouter
import ru.usefulsoft.hiltstub.databinding.ActivityAuthBinding
import javax.inject.Inject

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {

    @Inject
    lateinit var authInteractor: IAuthInteractor

    @DashboardQualifier
    @Inject
    lateinit var dashboardRouter: ScreenRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityAuthBinding.inflate(layoutInflater).run {
            setContentView(root)

            this.authButton.setOnClickListener {
                authInteractor.someRequest()
            }

            this.dashboardButton.setOnClickListener {
                dashboardRouter.openScreen()
            }
        }
    }
}
