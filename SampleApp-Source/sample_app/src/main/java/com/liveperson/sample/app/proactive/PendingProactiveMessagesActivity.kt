package com.liveperson.sample.app.proactive

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.liveperson.sample.app.R

class PendingProactiveMessagesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pending_proactive_messages)
        supportActionBar?.run {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        if (savedInstanceState == null) {
            with(supportFragmentManager.beginTransaction()) {
                replace(R.id.container, PendingProactiveMessagesFragment())
                commit()
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> true.also {
                onBackPressedDispatcher.onBackPressed()
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}