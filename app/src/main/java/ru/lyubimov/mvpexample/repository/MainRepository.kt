package ru.lyubimov.mvpexample.repository

import android.util.Log
import ru.lyubimov.mvpexample.contract.MainContract

class MainRepository : MainContract.Repository{
    companion object {
        private val TAG = MainRepository::class.java.simpleName
    }

    override fun loadMessage(): String {
        Log.d(TAG, "loadMessage()")
        return "Сосисочная у Лехи"
    }
}