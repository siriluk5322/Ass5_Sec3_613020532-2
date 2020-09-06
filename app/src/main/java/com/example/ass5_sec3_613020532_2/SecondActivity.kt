package com.example.ass5_sec3_613020532_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("EmData")
        nameText.text = "Employee Name : ${newEmployee?.EmpName}"
        genderText.text = "Gender : ${newEmployee?.gender}"
        emailText.text = "Email : ${newEmployee?.email}"
        salaryText.text = "Email : ${newEmployee?.salary}"

    }

    fun onClickClose(view: View) {
        finish()
    }
}