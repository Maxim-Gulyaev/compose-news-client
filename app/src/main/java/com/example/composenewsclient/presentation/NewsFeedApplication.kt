package com.example.composenewsclient.presentation

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.composenewsclient.di.ApplicationComponent
import com.example.composenewsclient.di.DaggerApplicationComponent
import com.example.composenewsclient.domain.entity.FeedPost

class NewsFeedApplication: Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}

@Composable
fun getApplicationComponent(): ApplicationComponent =
    (LocalContext.current.applicationContext as NewsFeedApplication).component