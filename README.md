# Kotlin_Dagger_Hilt_2023

              id 'kotlin-kapt'
              id 'com.google.dagger.hilt.android'
              
              
              
              
              
              
              
                         //Dagger Hilt
              implementation "com.google.dagger:hilt-android:2.44"
              kapt "com.google.dagger:hilt-compiler:2.44"

          //    implementation 'androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03'
          //    kapt'androidx.hilt:hilt-compiler:1.0.0'

              //Activity KTX for Viewmodel
              implementation "androidx.activity:activity-ktx:1.4.0"
              
              
            plugins {
            id 'com.android.application' version '7.4.1' apply false
            id 'com.android.library' version '7.4.1' apply false
            id 'org.jetbrains.kotlin.android' version '1.8.0' apply false
            //dagger
            id 'com.google.dagger.hilt.android' version '2.44' apply false
        }
