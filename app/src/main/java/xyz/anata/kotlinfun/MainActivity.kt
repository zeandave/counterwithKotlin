package xyz.anata.kotlinfun
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count =0
        var textView = findViewById<TextView>(R.id.numShow)
        buttonPlus.setOnClickListener(){
            count++
            textView.text=count.toString()
        }
        button2.setOnClickListener(){
            textView.text="0"
            count=0
        }
    }
}
