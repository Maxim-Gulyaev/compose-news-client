package com.example.composenewsclient.di

import androidx.lifecycle.ViewModel
import com.example.composenewsclient.presentation.comments.CommentsViewModel
import com.example.composenewsclient.presentation.main.MainViewModel
import com.example.composenewsclient.presentation.news.NewsFeedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(NewsFeedViewModel::class)
    @Binds
    fun bindNewsFeedViewModel(viewModel: NewsFeedViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel

}