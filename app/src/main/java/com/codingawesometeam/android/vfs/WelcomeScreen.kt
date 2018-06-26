package com.codingawesometeam.android.vfs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class WelcomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val intentToMain = Intent(this, MainActivity::class.java)
        val buttonGoVote = findViewById<Button> (R.id.button_go_to_vote)
        
        val clickListener = View.OnClickListener { v ->
            startActivity(intentToMain)
            }
        buttonGoVote.setOnClickListener(clickListener)
    }
  //  override fun onBackPressed() {
  //      alert(getString(R.string.close_app_info), getString(R.string.close_app)) {
   //         yesButton { finishAffinity() }
  //          noButton { }
   //         isCancelable = false
  //      }.show()
   // }
}

private fun Int.setOnClickListener(clickListener: View.OnClickListener) {

}
