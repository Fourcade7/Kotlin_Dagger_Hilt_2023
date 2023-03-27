package com.pr7.kotlin_dagger_hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewmodel @Inject  constructor(
    @Named("toast")
    val toast:String
):ViewModel() {

    init {
        toast
    }

}