package com.borjabravo.daggerinnocv.usecase.user

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.usecase.general.UseCase

interface GetUserUseCase : UseCase<User> {

    override fun bind(): User =
            User("Manuel", "Perera")

}