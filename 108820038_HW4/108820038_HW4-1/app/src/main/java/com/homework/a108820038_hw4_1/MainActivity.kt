package com.homework.a108820038_hw4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private  lateinit var countTextView: TextView
    private var count: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.textView)

        if (savedInstanceState!=null) {
            count = savedInstanceState.getInt("count")
            countTextView.text = count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("count", count)
        super.onSaveInstanceState(outState)
    }

    fun addCount(view: View) {
        count+=1
        countTextView.text = count.toString()
    }
}