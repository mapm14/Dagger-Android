package com.borjabravo.daggerinnocv.presentation.general

abstract class BasePresenterImpl<T : BaseView> : BasePresenter<T> {

    lateinit var view: T

    override fun init(view: T) {
        this.view = view
    }

}