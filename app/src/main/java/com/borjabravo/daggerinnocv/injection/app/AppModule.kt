package com.borjabravo.daggerinnocv.injection.app

import com.borjabravo.daggerinnocv.domain.User
import com.borjabravo.daggerinnocv.injection.activity.ActivityModule
import com.borjabravo.daggerinnocv.injection.fragment.FragmentModule
import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named

@Module(includes = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    FragmentModule::class])
class AppModule {

    @Provides
    @Named("Manu")
    fun userManu() = User("Manuel", "Perera")

    @Provides
    @Named("Pepe")
    fun userPepe() = User("Pepe", "Gomez")

}