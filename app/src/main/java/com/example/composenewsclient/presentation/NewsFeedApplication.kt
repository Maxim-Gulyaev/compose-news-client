package com.example.composenewsclient.presentation

import android.app.Application
import com.example.composenewsclient.di.ApplicationComponent
import com.example.composenewsclient.di.DaggerApplicationComponent
import com.example.composenewsclient.domain.entity.FeedPost

class NewsFeedApplication: Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}