package com.example.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.widget.TimePicker
import com.example.aisatsuapp.R
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.text = "ボタン"

        button.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        showTimepickerDialog()
    }

    private fun showTimepickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("Aisatsu","$hour:$minute")
                Aisatsu(hour)
            },
            13, 0 , true)
        timePickerDialog.show()
    }

    private fun Aisatsu(setHour: Int){
        when {
            setHour <= 1 -> Log.d("Aisatsu","「こんばんわ」")
            setHour <= 9 -> Log.d("Aisatsu","「おはよう」")
            setHour <= 17 -> Log.d("Aisatsu","「こんにちは」")
            setHour <= 24 -> Log.d("Aisatsu","「こんばんは」")
        }
        Log.d("Aisatsu","$setHour")
    }
}
