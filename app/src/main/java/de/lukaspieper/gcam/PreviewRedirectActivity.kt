package de.lukaspieper.gcam

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.content.Intent

class PreviewRedirectActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(javaClass.simpleName, intent.toString())

        if (intent.`package` == packageName) {
            intent.data?.let { uri ->
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        }

        finish()
    }
}
