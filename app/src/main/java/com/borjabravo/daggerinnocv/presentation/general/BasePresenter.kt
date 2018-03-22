package com.borjabravo.daggerinnocv.presentation.general

open class BasePresenter<T : BaseView> {

    lateinit var view: T

    open fun init(view: T) {
        this.view = view
    }

}