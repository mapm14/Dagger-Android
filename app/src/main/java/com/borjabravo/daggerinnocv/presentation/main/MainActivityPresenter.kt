package com.borjabravo.daggerinnocv.presentation.main

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.presentation.general.BasePresenter
import javax.inject.Inject
import javax.inject.Named

class MainActivityPresenter @Inject constructor(@Named("Pepe") private var userPepe: User) : BasePresenter<MainActivityView>() {

    override fun init(view: MainActivityView) {
        super.init(view)
        view.showToast(userPepe.toString())
    }

}