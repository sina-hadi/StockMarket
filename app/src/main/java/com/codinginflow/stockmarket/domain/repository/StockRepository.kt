package com.codinginflow.stockmarket.domain.repository

import com.codinginflow.stockmarket.domain.model.CompanyInfo
import com.codinginflow.stockmarket.domain.model.CompanyListing
import com.codinginflow.stockmarket.domain.model.IntradayInfo
import com.codinginflow.stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}