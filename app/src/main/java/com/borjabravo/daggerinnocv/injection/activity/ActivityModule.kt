package com.borjabravo.daggerinnocv.injection.activity

import com.borjabravo.daggerinnocv.injection.scopes.PerActivity
import com.borjabravo.daggerinnocv.presentation.main.MainActivity
import com.borjabravo.daggerinnocv.presentation.main.injection.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivityInjector(): MainActivity

}