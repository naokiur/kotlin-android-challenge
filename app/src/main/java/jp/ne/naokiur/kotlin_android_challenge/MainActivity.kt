package jp.ne.naokiur.kotlin_android_challenge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connect_network.text = getString(R.string.button_network_label)
        connect_network.setOnClickListener { view ->
            connect_network.text = "After click."

            "https://api.github.com/repos/naokiur/kotlin-android-challenge".httpGet().responseString { request, responce, result ->

                when (result) {
                    is Result.Failure -> {
                        print(result)
                    }

                    is Result.Success -> {
                        network_result.text = result.toString()
                    }
                }
            }
        }



    }
}
