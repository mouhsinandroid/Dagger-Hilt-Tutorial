package com.mouhsinbourqaiba.dagger_hilt_tutorial.data.repository

import com.mouhsinbourqaiba.dagger_hilt_tutorial.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val helper: ApiHelper) {

    suspend fun getUsers() = helper.getUsers()

}