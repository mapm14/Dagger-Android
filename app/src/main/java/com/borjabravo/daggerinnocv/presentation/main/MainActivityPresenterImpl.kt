package com.borjabravo.daggerinnocv.presentation.main

import com.borjabravo.daggerinnocv.presentation.general.BasePresenterImpl
import com.borjabravo.daggerinnocv.presentation.main.MainActivityContract.MainActivityPresenter
import com.borjabravo.daggerinnocv.presentation.main.MainActivityContract.MainActivityView
import javax.inject.Inject

class MainActivityPresenterImpl @Inject constructor() : BasePresenterImpl<MainActivityView>(), MainActivityPresenter {

    override fun init(view: MainActivityView) {
        super.init(view)
        view.showToast("Activity")
    }

}