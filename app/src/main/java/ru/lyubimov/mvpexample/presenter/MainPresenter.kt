package ru.lyubimov.mvpexample.presenter

import android.util.Log
import ru.lyubimov.mvpexample.contract.MainContract
import ru.lyubimov.mvpexample.repository.MainRepository

class MainPresenter(val view: MainContract.View, val repository: MainContract.Repository = MainRepository()) : MainContract.Presenter {
    companion object {
        private val TAG = MainPresenter::class.java.simpleName
    }

    override fun onButtonWasClicked() {
        val message = repository.loadMessage();
        view.showText(message);
        Log.d(TAG, "onButtonWasClicked()")
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy()")
    }
}