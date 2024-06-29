package com.example.composenewsclient.domain.usecases

import com.example.composenewsclient.domain.entity.FeedPost
import com.example.composenewsclient.domain.repository.NewsFeedRepository
import javax.inject.Inject

class DeletePostUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.deletePost(feedPost)
    }
}