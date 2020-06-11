package ru.usefulsoft.auth.domain

import android.content.Context
import android.content.Intent
import dagger.hilt.android.qualifiers.ActivityContext
import ru.usefulsoft.core.domain.BaseScreenRouter
import ru.usefulsoft.dashboard.presentation.AuthActivity

class AuthRouter(
    @ActivityContext private val context: Context
) : BaseScreenRouter(context) {
    override fun openScreen() {
        val intent = Intent(context, AuthActivity::class.java)
        context.startActivity(intent)
        closeScreen()
    }
}