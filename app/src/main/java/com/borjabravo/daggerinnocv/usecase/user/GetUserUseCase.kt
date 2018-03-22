package com.borjabravo.daggerinnocv.usecase.user

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.usecase.general.UseCase

class GetUserUseCase(private var userManu: User) : UseCase<User> {

    override fun bind(): User = userManu

}