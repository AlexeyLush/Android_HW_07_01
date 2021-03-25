package kz.step.android_hw_07_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    var firstName: EditText? = null
    var lastName: EditText? = null
    var email: EditText? = null
    var buttonSend: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initializeViews()
        initializeListeners()
    }

    fun initializeViews(){
        firstName = findViewById(R.id.editText_firstname)
        lastName = findViewById(R.id.editText_lastname)
        email = findViewById(R.id.editText_email)
        buttonSend = findViewById(R.id.button_send)
    }


    fun initializeListeners(){
        buttonSend?.setOnClickListener{

            val firstNameText: String = firstName?.text.toString()
            val lastNameText: String = lastName?.text.toString()
            val emailText: String = email?.text.toString()

            val intent: Intent = Intent(this, ViewActivity::class.java).apply {
                putExtra("firstName", "Имя: $firstNameText")
                putExtra("lastName", "Фамилия: $lastNameText")
                putExtra("email", "E-mail: $emailText")

            }

            startActivity(intent)

        }
    }


}