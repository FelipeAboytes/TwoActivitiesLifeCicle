package com.example.felipeaboytes.twoactivitiesLifeCicle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.felipeaboytes.twoactivities.R
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.java.simpleName
    private var mReply: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")

        var intent = getIntent()
        var message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        var textView = findViewById(R.id.text_message) as TextView
        if (textView != null) {
            textView!!.setText(message)
    }


    }

    fun returnReply(view: View) {
        // Get the reply message from the edit text.
        val reply = mReply!!.getText().toString()

        // Create a new intent for the reply, add the reply message to it as an extra,
        // set the intent result, and close the activity.
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }

    /**
     * Lifecycle callback for start.
     */

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    /**
     * Lifecycle callback for restart.
     */

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    /**
     * Lifecycle callback for resume.
     */

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    /**
     * Lifecycle callback for pause.
     */

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    /**
     * Lifecycle callback for stop.
     */

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    /**
     * Lifecycle callback for destroy.
     */

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }



    companion object {
        // Unique tag for the intent reply.
        val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    }
}
