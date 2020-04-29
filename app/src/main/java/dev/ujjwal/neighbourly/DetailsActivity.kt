package dev.ujjwal.neighbourly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.layout_feed_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        type_ans.setOnClickListener {
            type_ans.visibility = View.GONE
            type_et.visibility = View.VISIBLE
            type_mic.visibility = View.VISIBLE

            type_send.visibility = View.GONE
            type_location.visibility = View.GONE
            type_user.visibility = View.VISIBLE
        }

        type_et.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s?.length == 0) {
                    type_send.visibility = View.GONE
                    type_location.visibility = View.GONE
                    type_user.visibility = View.VISIBLE
                } else {
                    type_send.visibility = View.VISIBLE
                    type_location.visibility = View.VISIBLE
                    type_user.visibility = View.GONE
                }
            }
        })
    }
}
