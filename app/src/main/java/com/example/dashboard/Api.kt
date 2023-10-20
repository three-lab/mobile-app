package com.example.dashboard

import retrofit2.http.GET
interface Api() {
        @GET("users/{user}/repos")
        Call<List<Repo>> listRepos(@Path("user") String user);
    }
}