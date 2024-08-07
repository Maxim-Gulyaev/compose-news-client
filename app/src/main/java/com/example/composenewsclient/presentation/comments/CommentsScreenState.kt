package com.example.composenewsclient.presentation.comments

import com.example.composenewsclient.domain.entity.FeedPost
import com.example.composenewsclient.domain.entity.PostComment

sealed class CommentsScreenState {

    object Initial: CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>,
    ) : CommentsScreenState()

}