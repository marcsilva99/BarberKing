package com.example.barberking

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val premiof = findViewById(R.id.iv_trophy) as ImageView
        premiof.let {
            premio()
        }

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."

        btn_finish.setOnClickListener {
            val intent = Intent(this@ResultActivity, MainnActivity::class.java)
            intent.flags =
                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(
                    Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }


    private fun premio() {
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        if (correctAnswers > 9) {
            val premio1: ImageView = findViewById(R.id.iv_trophy)
            premio1.setImageResource(R.drawable.ic_trophy)
        } else {
            val premio2: ImageView = findViewById(R.id.iv_trophy)
            premio2.setImageResource(R.drawable.ic_trophy2)
        }

    }
}

