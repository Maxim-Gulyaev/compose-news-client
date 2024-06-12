package com.example.composenewsclient.ui.theme

import com.example.composenewsclient.domain.FeedPost
import com.example.composenewsclient.domain.PostComment

sealed class CommentsScreenState {

    object Initial: CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>,
    ) : CommentsScreenState()

}