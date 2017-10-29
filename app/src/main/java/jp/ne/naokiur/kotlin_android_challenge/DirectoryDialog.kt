package jp.ne.naokiur.kotlin_android_challenge

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.DialogInterface
import android.os.Bundle

/**
 * Created by nao-ur on 2017/10/29.
 */
class DirectoryDialog: DialogFragment() {
    private val title = "title"
    private val msg = "message"
    private val okText = "OK"
    private val cancel ="Cancel"

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        builder.setTitle(title)
                .setMessage(msg)
                .setPositiveButton(okText, DialogInterface.OnClickListener { dialog, which ->  })
                .setNegativeButton(cancel, DialogInterface.OnClickListener { dialog, which ->  })
        return builder.create()
    }

    override fun onPause() {
        super.onPause()
        dismiss()
    }
}