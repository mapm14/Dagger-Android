package com.borjabravo.daggerinnocv.presentation.detail

import com.borjabravo.daggerinnocv.presentation.detail.DetailFragmentContract.DetailFragmentPresenter
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragmentContract.DetailFragmentView
import com.borjabravo.daggerinnocv.presentation.general.BasePresenterImpl
import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCase
import javax.inject.Inject

class DetailFragmentPresenterImpl @Inject constructor() : BasePresenterImpl<DetailFragmentView>(), DetailFragmentPresenter {

    @Inject
    lateinit var getUserUseCase: GetUserUseCase

    override fun init(view: DetailFragmentView) {
        super.init(view)
        view.showToast(getUserUseCase.bind().toString())
    }

}