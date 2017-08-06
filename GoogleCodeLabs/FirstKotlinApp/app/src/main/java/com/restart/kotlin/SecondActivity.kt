package com.restart.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        // Get the count from the intent extras
        val currentCount = intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate the random number
        val random = Random().nextInt(currentCount + 1)

        // Display the random number.
        textview_random.text = Integer.toString(random)

        // Update the heading
        textview_label.text = getString(R.string.random_heading, currentCount)
    }
}
