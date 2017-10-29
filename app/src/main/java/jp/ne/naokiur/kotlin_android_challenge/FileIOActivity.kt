package jp.ne.naokiur.kotlin_android_challenge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_file_io.*
import java.io.File

class FileIOActivity : AppCompatActivity() {
    // できない
    // https://stackoverflow.com/questions/44637435/how-to-use-fragments-with-kotlin
    // private var fragment: DirectoryTreeFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_io)

        save_file.setOnClickListener {
            val target: String = text_save_target.text.toString() + "\n"

            File(baseContext.filesDir, "sample.txt").appendText(target)
            text_save_target.text.clear()
        }

        read_file.setOnClickListener {
            readFile()
        }

    }

    private fun readFile() {
        val dialog = DirectoryDialog()
        dialog.show(fragmentManager, "tag")
    }
}
