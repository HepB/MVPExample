package ru.lyubimov.mvpexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.lyubimov.mvpexample.contract.MainContract

class MainActivity : AppCompatActivity(), MainContract.View {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showText(text: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
