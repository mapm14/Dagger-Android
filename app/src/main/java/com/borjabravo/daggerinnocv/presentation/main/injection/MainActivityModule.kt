package com.borjabravo.daggerinnocv.presentation.main.injection

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.presentation.main.MainActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainActivityModule {

    @Provides
    fun mainPresenter(@Named("Pepe") userPepe: User) = MainActivityPresenter(userPepe)

}