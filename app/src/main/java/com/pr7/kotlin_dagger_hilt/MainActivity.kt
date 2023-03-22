package com.pr7.kotlin_dagger_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


//@AndroidEntryPoint base class must extend ComponentActivity, (support) Fragment, View, Service, or BroadcastReceiver.
//  [Hilt] Processing did not complete. See error above for details.
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var google: Google
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        google.printinfo()
    }
}