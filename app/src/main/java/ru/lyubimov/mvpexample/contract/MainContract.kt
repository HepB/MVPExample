package ru.lyubimov.mvpexample.contract

interface MainContract {

    interface View {
        fun showText(text: String)
    }

    interface Presenter {
        fun onButtonWasClicked()
        fun onDestroy()
    }

    interface Repository {
        fun loadMessage() : String
    }
}