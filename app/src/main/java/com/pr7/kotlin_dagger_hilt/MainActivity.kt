package com.pr7.kotlin_dagger_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


//@AndroidEntryPoint base class must extend ComponentActivity, (support) Fragment, View, Service, or BroadcastReceiver.
//  [Hilt] Processing did not complete. See error above for details.
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var google: Google
    private  val TAG = "PR77777"

    @Inject
    @Named("string2")
    lateinit var teststring:String

//    @Inject
//    @Named("toast")
//    lateinit var showtoast:String

    val viewmodel:TestViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        google.printinfo()
        Log.d(TAG, "onCreate: $teststring")

        viewmodel
    }
}