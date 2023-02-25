package com.example.checkin_checkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increment=findViewById<Button>(R.id.check_in)
        val counter=findViewById<TextView>(R.id.counter)
        val decrement=findViewById<Button>(R.id.Check_out)
        val reset=findViewById<Button>(R.id.reset)

        increment.setOnClickListener {

            //counter.text=getString(R.string.count)
            val countvalue=counter.text.toString()
            var num=countvalue.toInt()
            num += 1
            counter.text=num.toString()



        }

        decrement.setOnClickListener {
            val countvalue=counter.text.toString()
            var num=countvalue.toInt()

            if(num==0){
                Toast.makeText(this,"Counter Already 0!!", Toast.LENGTH_LONG).show()
            }
            else{
                num -= 1
                counter.text=num.toString()
            }



        }

        reset.setOnClickListener {
            counter.text="0"
        }
    }


}