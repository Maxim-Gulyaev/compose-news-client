package com.example.composenewsclient.presentation.news

import com.example.composenewsclient.domain.entity.FeedPost

sealed class NewsFeedScreenState {

    object Initial: NewsFeedScreenState()

    object Loading: NewsFeedScreenState()

    data class Posts(
        val posts: List<FeedPost>,
        val nextDataIsLoading: Boolean = false,
    ) : NewsFeedScreenState()

}