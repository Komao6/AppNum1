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
        val totalScore = findViewById<TextView>(R.id.total_score)

        var cnt = 0

        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timerM.text = (millisUntilFinished / 1000).toString()
            }
            override fun onFinish() {
                totalScore.text = "Your Score: $cnt"
                totalScore.visibility = View.VISIBLE
                cnt = 0
            }
        }

        score.text = "0"

        clickBt.setOnClickListener{
            score.text = "${++cnt}"

        }

        timer.start()
    }
}