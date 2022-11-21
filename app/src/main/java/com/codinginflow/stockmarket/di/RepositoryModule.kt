package com.codinginflow.stockmarket.di

import com.codinginflow.stockmarket.data.csv.CSVParser
import com.codinginflow.stockmarket.data.csv.CompanyListingsParser
import com.codinginflow.stockmarket.data.csv.IntradayInfoParser
import com.codinginflow.stockmarket.data.repository.StockRepositoryImpl
import com.codinginflow.stockmarket.domain.model.CompanyListing
import com.codinginflow.stockmarket.domain.model.IntradayInfo
import com.codinginflow.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}