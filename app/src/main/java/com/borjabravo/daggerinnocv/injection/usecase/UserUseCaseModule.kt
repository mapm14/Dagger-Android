package com.borjabravo.daggerinnocv.injection.usecase

import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCase
import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class UserUseCaseModule {

    @Binds
    abstract fun getUser(getUserUseCaseImpl: GetUserUseCaseImpl): GetUserUseCase

}