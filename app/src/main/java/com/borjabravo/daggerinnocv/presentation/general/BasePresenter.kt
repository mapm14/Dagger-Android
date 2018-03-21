package com.borjabravo.daggerinnocv.presentation.general

interface BasePresenter<in T : BaseView> {

    fun init(view: T)

}