package com.github.chelovekdrakon.ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById<TextView>(R.id.title)

        textView.setOnClickListener {
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        val intent: Intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
