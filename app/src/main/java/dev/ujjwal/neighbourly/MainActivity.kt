package dev.ujjwal.neighbourly

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_feed.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_gps.setOnClickListener {
            val dialog = Dialog(this)
            val window: Window = dialog.window!!
            val wmLp = window.attributes
            wmLp.gravity = Gravity.TOP
            wmLp.width = WindowManager.LayoutParams.MATCH_PARENT
            wmLp.height = WindowManager.LayoutParams.WRAP_CONTENT
            window.attributes = wmLp
            dialog.setContentView(R.layout.layout_popup)
            dialog.setCancelable(true)
            dialog.setCanceledOnTouchOutside(true)
            dialog.show()
        }

        card_view.setOnClickListener {
            val i = Intent(this, DetailsActivity::class.java)
            startActivity(i)
        }
    }
}
