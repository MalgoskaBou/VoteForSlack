package com.codingawesometeam.android.vfs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentToThanks = Intent(this, ThanksScreen::class.java)
        val buttonVote = findViewById<Button> (R.id.button_cast_vote)

        val clickListener = View.OnClickListener { _ ->
            startActivity(intentToThanks)
        }
        buttonVote.setOnClickListener(clickListener)
    }
}
