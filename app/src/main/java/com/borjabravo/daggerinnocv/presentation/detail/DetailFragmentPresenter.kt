package com.borjabravo.daggerinnocv.presentation.detail

import com.borjabravo.daggerinnocv.presentation.general.BasePresenter
import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCase
import javax.inject.Inject

class DetailFragmentPresenter @Inject constructor(private val getUserUseCase: GetUserUseCase) : BasePresenter<DetailFragmentView>() {

    override fun init(view: DetailFragmentView) {
        super.init(view)
        view.showToast(getUserUseCase.bind().toString())
    }

}