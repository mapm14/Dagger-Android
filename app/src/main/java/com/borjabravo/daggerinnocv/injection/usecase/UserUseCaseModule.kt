package com.borjabravo.daggerinnocv.injection.usecase

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.usecase.user.GetUserUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserUseCaseModule {

    @Provides
    fun getUserUseCase(@Named("Manu") userManu: User) = GetUserUseCase(userManu)

}