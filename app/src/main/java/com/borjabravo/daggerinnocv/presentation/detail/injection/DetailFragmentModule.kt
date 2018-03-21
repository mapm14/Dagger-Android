package com.borjabravo.daggerinnocv.presentation.detail.injection

import com.borjabravo.daggerinnocv.presentation.detail.DetailFragmentContract.DetailFragmentPresenter
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragmentPresenterImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DetailFragmentModule {

    @Binds
    abstract fun detailPresenter(detailFragmentPresenterImpl: DetailFragmentPresenterImpl): DetailFragmentPresenter

}