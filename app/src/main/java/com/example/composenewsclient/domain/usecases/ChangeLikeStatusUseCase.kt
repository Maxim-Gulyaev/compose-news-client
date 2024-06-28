package com.example.composenewsclient.domain.usecases

import com.example.composenewsclient.domain.entity.FeedPost
import com.example.composenewsclient.domain.repository.NewsFeedRepository

class ChangeLikeStatusUseCase(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}