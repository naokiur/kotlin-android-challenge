package jp.ne.naokiur.kotlin_android_challenge

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connect_network.setOnClickListener { view ->
            val intent = Intent(baseContext, NetworkActivity::class.java)
            startActivity(intent)
        }

        file_io.setOnClickListener { view ->
            val intent = Intent(baseContext, FileIOActivity::class.java)
            startActivity(intent)
        }
    }
}
