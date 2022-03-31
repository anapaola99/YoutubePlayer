package com.example.helloworld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
private val TAG = "MainActivity"
private val Text = "TEXT_CONTENT"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, msg: "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tareaarredondo)

        val userInput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button4)
        val button2: Button = findViewById<Button>(R.id.button5)
        textView = findViewById<TextView>(R.id.textView2)

        textView?.text =""
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListeer(objet :View.OnClickListener{
            override fun onClick(p0: View?){
                Loged(TAG, msg: "onClick")
                textView?.append(userInput.text)
                textView?.append("\n")
                // userInput.setText("")
                userInput.text.clear()
            }
        })

        button2.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?){
                Log.d(TAG, msg: "onClick")
                textView?.text =""
                userInput.text.clear()
            }
        })

        override fun onStar(){
            Log.d(TAG, msg :"onStar")
            super.onStar()
        }

    }
}