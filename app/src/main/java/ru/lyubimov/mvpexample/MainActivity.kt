package ru.lyubimov.mvpexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import ru.lyubimov.mvpexample.contract.MainContract
import ru.lyubimov.mvpexample.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var presenter : MainContract.Presenter
    private lateinit var textView : TextView
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(view = this)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button.setOnClickListener {presenter.onButtonWasClicked()}
        Log.d(TAG, "onCreate")
    }

    override fun showText(text: String) {
        textView.setText(text)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
        Log.d(TAG, "onDestroy()")
    }
}
