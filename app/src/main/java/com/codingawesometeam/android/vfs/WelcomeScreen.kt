package com.codingawesometeam.android.vfs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class WelcomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)


    }
  //  override fun onBackPressed() {
  //      alert(getString(R.string.close_app_info), getString(R.string.close_app)) {
   //         yesButton { finishAffinity() }
  //          noButton { }
   //         isCancelable = false
  //      }.show()
   // }
}
