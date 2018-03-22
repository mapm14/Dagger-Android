package com.borjabravo.daggerinnocv.presentation.main

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.presentation.general.BasePresenter

class MainActivityPresenter(private var userPepe: User) : BasePresenter<MainActivityView>() {

    override fun init(view: MainActivityView) {
        super.init(view)
        view.showToast(userPepe.toString())
    }

}