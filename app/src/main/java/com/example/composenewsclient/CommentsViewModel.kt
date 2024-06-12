package com.example.composenewsclient

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composenewsclient.domain.FeedPost
import com.example.composenewsclient.domain.PostComment
import com.example.composenewsclient.ui.theme.CommentsScreenState

class CommentsViewModel: ViewModel() {

    private val _screenState = MutableLiveData<CommentsScreenState>(CommentsScreenState.Initial)
    val screenState: LiveData<CommentsScreenState> = _screenState

    init {
        loadComments(FeedPost())
    }

    fun loadComments(
        feedPost: FeedPost
    ) {
        val comments = mutableListOf<PostComment>().apply {
            repeat(10) {
                add(PostComment(id = it))
            }
        }
        _screenState.value = CommentsScreenState.Comments(
            feedPost = feedPost,
            comments = comments
        )
    }
}