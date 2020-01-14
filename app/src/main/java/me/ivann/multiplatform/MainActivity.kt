package me.ivann.multiplatform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.movies.mobile.createApplicationMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_text.text = createApplicationMessage()
    }
}
