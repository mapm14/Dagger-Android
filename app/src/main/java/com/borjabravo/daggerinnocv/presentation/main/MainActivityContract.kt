package com.borjabravo.daggerinnocv.presentation.main

import com.borjabravo.daggerinnocv.presentation.general.BasePresenter
import com.borjabravo.daggerinnocv.presentation.general.BaseView

interface MainActivityContract {

    interface MainActivityView : BaseView {
    }

    interface MainActivityPresenter : BasePresenter<MainActivityView> {
    }

}