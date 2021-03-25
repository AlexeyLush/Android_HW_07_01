package kz.step.android_hw_07_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ViewActivity : AppCompatActivity() {

    var firstName: TextView? = null
    var lastName: TextView? = null
    var email: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        initializeViews()
    }


    fun initializeViews(){
        firstName = findViewById(R.id.textview_firstname)
        lastName = findViewById(R.id.textview_lastname)
        email = findViewById(R.id.textview_email)


        firstName?.text = intent.getStringExtra("firstName")
        lastName?.text = intent.getStringExtra("lastName")
        email?.text = intent.getStringExtra("email")

    }

}