package com.example.appnum1

import android.content.IntentSender.OnFinished
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val score = findViewById<TextView>(R.id.counter)
        val clickBt = findViewById<Button>(R.id.click_bt)
        val timerM = findViewById<TextView>(R.id.timer)

        score.text = "0"
        var cnt = 0
        clickBt.setOnClickListener{
            score.text = "${++cnt}"
        }
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {}
        }
        timer.start()
        timerM.text = "${timer}"
    }
}