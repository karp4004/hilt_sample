package ru.usefulsoft.dashboard.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import ru.usefulsoft.dashboard.R
import ru.usefulsoft.dashboard.domain.DashboardInteractor
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val requestButton get() = request_button

    @Inject
    lateinit var dashboardInteractor: DashboardInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestButton.setOnClickListener {
            dashboardInteractor.someRequest()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
