package com.example.composenewsclient.domain.usecases

import com.example.composenewsclient.domain.entity.FeedPost
import com.example.composenewsclient.domain.entity.PostComment
import com.example.composenewsclient.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    operator fun invoke(feedPost: FeedPost): StateFlow<List<PostComment>> {
        return repository.getComments(feedPost)
    }
}