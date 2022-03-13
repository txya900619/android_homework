package com.homework.hello_constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var  mShowCount: TextView
    private lateinit var zeroButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
        zeroButton = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }
    fun countUp(view: View) {
        mCount++

        mShowCount.text = mCount.toString()

        view.setBackgroundColor(ContextCompat.getColor(applicationContext,if (mCount % 2 == 0) R.color.purple_200 else R.color.teal_200))
        zeroButton.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.teal_700))
    }

    fun setZero(view: View) {
        mCount = 0
        mShowCount.text = mCount.toString()
        zeroButton.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.gray))
    }
}