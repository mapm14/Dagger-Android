package com.borjabravo.daggerinnocv.presentation.main.injection

import com.borjabravo.daggerinnocv.presentation.main.MainActivityContract.MainActivityPresenter
import com.borjabravo.daggerinnocv.presentation.main.MainActivityPresenterImpl
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun mainPresenter(mainActivityPresenterImpl: MainActivityPresenterImpl): MainActivityPresenter

}