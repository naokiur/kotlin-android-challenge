package jp.ne.naokiur.kotlin_android_challenge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connect_network.text = getString(R.string.button_network_label)
        connect_network.setOnClickListener {  }
    }
}
