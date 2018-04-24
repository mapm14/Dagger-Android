package com.borjabravo.daggerinnocv.injection.activity

import com.borjabravo.daggerinnocv.injection.scopes.PerActivity
import com.borjabravo.daggerinnocv.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity

}