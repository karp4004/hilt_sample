package ru.usefulsoft.auth.domain

import android.content.Context
import android.content.Intent
import dagger.hilt.android.qualifiers.ActivityContext
import ru.usefulsoft.auth.presentation.AuthActivity
import ru.usefulsoft.core.domain.BaseScreenRouter

class AuthRouter(
    @ActivityContext private val context: Context
) : BaseScreenRouter(context) {
    override fun openScreen() {
        val intent = Intent(context, AuthActivity::class.java)
        context.startActivity(intent)
        closeScreen()
    }
}