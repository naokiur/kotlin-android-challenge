package jp.ne.naokiur.kotlin_android_challenge

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import java.io.File


/**
 * Created by nao-ur on 2017/10/29.
 */
class DirectoryDialog: DialogFragment() {
    private val title = "Directory List"

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return activity.layoutInflater.inflate(R.layout.directory_fragment_layout, null)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val list = File(activity.filesDir, "").walkTopDown().toList()

        val adapter: ArrayAdapter<File> = ArrayAdapter(activity, android.R.layout.select_dialog_item, list)

        val builder = AlertDialog.Builder(activity)
        builder.setView(activity.layoutInflater.inflate(R.layout.directory_fragment_layout, null))
                .setTitle(title)
                .setAdapter(adapter, DialogInterface.OnClickListener { dialog, which ->
                })

        return builder.create()
    }

    override fun onPause() {
        super.onPause()
        dismiss()
    }
}