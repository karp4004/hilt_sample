package ru.usefulsoft.core.domain

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.qualifiers.ActivityContext

abstract class BaseScreenRouter(
    @ActivityContext private val context: Context
) : ScreenRouter {
    override fun closeScreen() {
        if (context is AppCompatActivity) {
            context.finish()
        }
    }
}