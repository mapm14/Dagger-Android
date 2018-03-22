package com.borjabravo.daggerinnocv.presentation.detail

import com.borjabravo.daggerinnocv.presentation.general.BasePresenter
import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCase

class DetailFragmentPresenter(private val getUserUseCase: GetUserUseCase) : BasePresenter<DetailFragmentView>() {

    override fun init(view: DetailFragmentView) {
        super.init(view)
        view.showToast(getUserUseCase.bind().toString())
    }

}