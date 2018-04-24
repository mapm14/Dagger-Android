package com.borjabravo.daggerinnocv.presentation.extended

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.presentation.general.BasePresenter
import javax.inject.Inject
import javax.inject.Named

class ExtendedActivityPresenter @Inject constructor(@Named("Pepe") private var userPepe: User) : BasePresenter<ExtendedActivityView>() {

    override fun init(view: ExtendedActivityView) {
        super.init(view)
        view.showToast(userPepe.toString())
    }

}