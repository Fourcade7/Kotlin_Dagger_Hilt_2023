package com.pr7.kotlin_dagger_hilt.di

import android.content.Context
import android.widget.Toast
import com.pr7.kotlin_dagger_hilt.Google
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class GoogleModule {

    @Singleton
    @Provides
    fun provideGoogle():Google= Google()


    @Singleton
    @Provides
    @Named("string")
    fun provdeTestString()="This is PR"
    @Singleton
    @Provides
    @Named("string2")
    fun provdeTestString2()="This is PR2"



    @Singleton
    @Provides
    @Named("toast")
    fun showtoast(@ApplicationContext context: Context):String{
        Toast.makeText(context,"Axaxax",Toast.LENGTH_SHORT).show()
        return "Aeobe AE"
    }
}