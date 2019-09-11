package com.example.week3weekendapi.model.datasource.remote.retrofit

import com.example.week3weekendapi.model.profile.Profile
import com.example.week3weekendapi.model.repos.Repository
import io.reactivex.Observable
import retrofit2.http.GET

interface GithubService {

    companion object{
        fun createService() : GithubService = RetrofitHelper().getRetrofitInstance().create(GithubService::class.java)
    }

    @GET("josecatalasan")
    fun getProfile() : Observable<Profile>

    @GET("josecatalasan/repos")
    fun getRepos() : Observable<List<Repository>>
}