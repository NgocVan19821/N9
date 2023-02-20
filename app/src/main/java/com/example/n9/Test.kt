package com.example.n9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Test : AppCompatActivity() {

    var checkNull:String? = null //

    class MyList<T> {
        private val elements = mutableListOf<T>()

        fun add(element: T) {
            elements.add(element)
        }

        fun get(index: Int){
            Log.d("list", "${elements[index]}")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var x: Int? = null//x co the null
        toast(x.toString())// in ra null
        x = null
        toast(x.toString())//

        val list = MyList<String>()
        list.add("apple")
        list.add("banana")
        list.add("orange")
        list.add("lemon")
        list.get(3)

        toast("onCreate")
    }

    override fun onStart() {
        super.onStart()
        toast("onStart")
    }

    override fun onResume() {
        super.onResume()
        toast("onResume")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        toast("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy")
    }

    fun toast(state: String){
        Toast.makeText(this, state, Toast.LENGTH_SHORT).show()
        Log.d("Now: ", state)
    }
}

