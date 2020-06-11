package ru.usefulsoft.dashboard.domain

import android.content.Context
import android.content.Intent
import dagger.hilt.android.qualifiers.ActivityContext
import ru.usefulsoft.core.domain.BaseScreenRouter
import ru.usefulsoft.dashboard.presentation.DashboardActivity

class DashboardRouter(
    @ActivityContext private val context: Context
) : BaseScreenRouter(context) {
    override fun openScreen() {
        val intent = Intent(context, DashboardActivity::class.java)
        context.startActivity(intent)
        closeScreen()
    }
}