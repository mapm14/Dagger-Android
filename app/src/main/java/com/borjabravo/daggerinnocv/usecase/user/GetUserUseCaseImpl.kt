package com.borjabravo.daggerinnocv.usecase.user

import com.borjabravo.daggerinnocv.domain.User
import javax.inject.Inject
import javax.inject.Named

class GetUserUseCaseImpl @Inject constructor() : GetUserUseCase {

    @Inject
    @field:Named("Manu")
    lateinit var userManu: User

    @Inject
    @field:Named("Pepe")
    lateinit var userPepe: User

    override fun bind(): User = userManu

}