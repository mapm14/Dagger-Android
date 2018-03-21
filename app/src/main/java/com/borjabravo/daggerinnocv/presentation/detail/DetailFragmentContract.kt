package com.borjabravo.daggerinnocv.presentation.detail

import com.borjabravo.daggerinnocv.presentation.general.BasePresenter
import com.borjabravo.daggerinnocv.presentation.general.BaseView

interface DetailFragmentContract {

    interface DetailFragmentView : BaseView {
    }

    interface DetailFragmentPresenter : BasePresenter<DetailFragmentView> {
    }

}