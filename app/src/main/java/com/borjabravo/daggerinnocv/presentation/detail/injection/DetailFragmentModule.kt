package com.borjabravo.daggerinnocv.presentation.detail.injection

import com.borjabravo.daggerinnocv.presentation.detail.DetailFragmentPresenter
import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCase
import dagger.Module
import dagger.Provides

@Module
class DetailFragmentModule {

    @Provides
    fun detailPresenter(getUserUseCase: GetUserUseCase) = DetailFragmentPresenter(getUserUseCase)

}