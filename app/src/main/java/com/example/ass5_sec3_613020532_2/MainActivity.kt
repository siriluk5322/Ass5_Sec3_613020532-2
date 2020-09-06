package com.example.ass5_sec3_613020532_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sent(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        var radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        var selectedId : Int = radioGroup.checkedRadioButtonId;
        var radioButton : RadioButton = findViewById(selectedId);
        intent.putExtra("EmData", Employee(edit_name.text.toString(), radioButton.text.toString(),edit_email.text.toString(), edit_salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(view: View) {
        edit_name.text.clear()
        radioGroup.clearCheck()
        edit_email.text.clear()
        edit_salary.text.clear()
    }


}