package com.codingawesometeam.android.vfs

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    private lateinit var intentToThanks: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intentToThanks = Intent(this, ThanksScreen::class.java)

        val buttonVote = findViewById<Button>(R.id.button_cast_vote)

        val clickListener = View.OnClickListener { _ ->
            saveAnswear()
        }
        buttonVote.setOnClickListener(clickListener)

        radioGroupError.visibility = INVISIBLE

        questionBGroup.setOnCheckedChangeListener { _, _ ->
            radioGroupError.visibility = INVISIBLE
        }

    }

    private fun saveAnswear() {
        if (checkIfFilled()) {
            startActivity(intentToThanks)
        } else {
            if (!userNickName.text.isNotEmpty()) {
                userNickName.error = "Username is required"
            }
            if (questionBGroup.checkedRadioButtonId == -1) {
                radioGroupError.visibility = VISIBLE
                toast("Choose the answear")
            }
        }
    }

    private fun checkIfFilled(): Boolean {
        return userNickName.text.isNotEmpty() && questionBGroup.checkedRadioButtonId != -1
    }
}
