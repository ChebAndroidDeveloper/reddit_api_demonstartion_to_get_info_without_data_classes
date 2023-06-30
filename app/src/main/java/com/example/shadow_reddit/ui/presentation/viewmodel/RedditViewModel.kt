package com.example.shadow_reddit.ui.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shadow_reddit.data.source.RedditApi
import dagger.hilt.android.lifecycle.HiltViewModel
import okhttp3.ResponseBody
import javax.inject.Inject

@HiltViewModel
class RedditViewModel @Inject constructor(
    private val api: RedditApi
) : ViewModel() {
    private val response = MutableLiveData<ResponseBody>()

    suspend fun getPosts() {
        val result = api.getPopularPosts()
        response.value = result
    }
}
