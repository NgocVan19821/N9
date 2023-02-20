package com.example.n9.calculator2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.n9.R
import kotlinx.android.synthetic.main.activity_calculate.*
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculateActivity : AppCompatActivity() {
    var operator = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        eventListener()
    }



    @SuppressLint("SetTextI18n")
    fun eventListener(){
        btnNum1.setOnClickListener {
            setNumber("1")
        }
        btnNum2.setOnClickListener {
            setNumber("2")

        }
        btnNum3.setOnClickListener {
            setNumber("3")

        }
        btnNum4.setOnClickListener {
            setNumber("4")

        }
        btnNum5.setOnClickListener {
            setNumber("5")

        }
        btnNum6.setOnClickListener {
            setNumber("6")

        }
        btnNum7.setOnClickListener {
            setNumber("7")

        }
        btnNum8.setOnClickListener {
            setNumber("8")

        }
        btnNum9.setOnClickListener {
            setNumber("9")

        }
        btnNum0.setOnClickListener {
            setNumber("0")

        }
        btnNumMinus.setOnClickListener {
            setData("-")


        }
        btnTimes.setOnClickListener {
            setData("X")

        }
        btnNumPlus.setOnClickListener {
            setData("+")

        }
        btnNumDevide.setOnClickListener {
            setData("/")
        }
        btnNumE.setOnClickListener {
            val number = tvInput.text.split(operator)
            when (operator){
                "X" -> tvOutPut.text = (number.first().toInt() * number.last().toInt()).toString()
                "+" -> tvOutPut.text = (number.first().toInt() + number.last().toInt()).toString()
                "-" -> tvOutPut.text = (number.first().toInt() - number.last().toInt()).toString()
                else -> if (number.last() != "" || number.last() != "0"){
                    tvOutPut.text = (number.first().toInt() / number.last().toInt()).toString()
                }
            }
        }
        btnDelete.setOnClickListener {
            tvInput.text = tvInput.text.dropLast(1)
            if (tvInput.text.isEmpty()){
                tvInput.text = "0"
            }
        }

        btnDelete.setOnLongClickListener {
            tvInput.text = "0"
            tvOutPut.text = ""
            operator = ""
            true
        }
    }

    fun setData(ope: String){
        if (operator == ""){
            tvInput.text = "${tvInput.text}$ope"

        }else{
            tvInput.text = tvInput.text.toString().replace(operator, ope)
        }
        operator = ope
    }

    fun setNumber(number: String){
        if (tvOutPut.text.isNotEmpty()){
            tvInput.text = "0"
            tvOutPut.text = ""
            operator = ""
        }
        if (tvInput.text == "0"){
            tvInput.text = ""
        }
        tvInput.text = "${tvInput.text}$number"

    }

}