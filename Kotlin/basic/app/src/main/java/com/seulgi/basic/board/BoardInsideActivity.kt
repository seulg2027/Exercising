package com.seulgi.basic.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.seulgi.basic.R

class BoardInsideActivity : AppCompatActivity() {
    private val TAG = BoardInsideActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_inside)

        val title = intent.getStringExtra("title").toString()
        val content =intent.getStringExtra("content").toString()
        val time = intent.getStringExtra("time").toString()

        Log.d(TAG, title)
    }
}