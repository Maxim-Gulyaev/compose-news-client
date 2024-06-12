package com.example.composenewsclient.ui.theme

import com.example.composenewsclient.domain.FeedPost

sealed class NewsFeedScreenState {

    object Initial: NewsFeedScreenState()

    data class Posts(val posts: List<FeedPost>) : NewsFeedScreenState()

}