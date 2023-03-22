package com.pr7.kotlin_dagger_hilt.di

import com.pr7.kotlin_dagger_hilt.Google
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class GoogleModule {

    @Singleton
    @Provides
    fun provideGoogle():Google= Google()
}