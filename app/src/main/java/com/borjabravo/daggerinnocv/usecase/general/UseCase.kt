package com.borjabravo.daggerinnocv.usecase.general

interface UseCase<out T> {

    fun bind(): T

}