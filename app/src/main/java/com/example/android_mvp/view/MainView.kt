package com.example.android_mvp.view

import com.example.android_mvp.model.Post

interface MainView {

    fun onPostListSuccess(posts: ArrayList<Post>?)
    fun onPostListFailure(error: String)

    fun onPostDeleteSuccess(posts: Post?)
    fun onPostDeleteFailure(error:String)

}