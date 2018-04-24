package com.borjabravo.daggerinnocv.usecase.user

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.usecase.general.UseCase
import javax.inject.Inject
import javax.inject.Named

class GetUserUseCase @Inject constructor(@Named("Manu") private var userManu: User) : UseCase<User> {

    override fun bind(): User = userManu

}