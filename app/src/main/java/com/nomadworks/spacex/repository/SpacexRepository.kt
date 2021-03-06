package com.nomadworks.spacex.repository

import com.nomadworks.spacex.api.model.launch.Launch
import com.nomadworks.spacex.api.model.error.ApiError
import com.nomadworks.spacex.types.Result

interface SpacexRepository {
    suspend fun fetchLatestLaunchResult(): Result<Launch, ApiError>
    suspend fun fetchLatestLaunch(): Launch
}