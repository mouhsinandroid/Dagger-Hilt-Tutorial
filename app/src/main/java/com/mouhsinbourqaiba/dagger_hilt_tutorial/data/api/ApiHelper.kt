package com.mouhsinbourqaiba.dagger_hilt_tutorial.data.api

import com.mouhsinbourqaiba.dagger_hilt_tutorial.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>

}