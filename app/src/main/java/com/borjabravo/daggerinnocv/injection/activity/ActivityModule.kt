package com.borjabravo.daggerinnocv.injection.activity

import com.borjabravo.daggerinnocv.injection.scopes.ViewScope
import com.borjabravo.daggerinnocv.presentation.extended.ExtendedActivity
import com.borjabravo.daggerinnocv.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ViewScope
    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity

    @ViewScope
    @ContributesAndroidInjector
    abstract fun extendedActivityInjector(): ExtendedActivity

}