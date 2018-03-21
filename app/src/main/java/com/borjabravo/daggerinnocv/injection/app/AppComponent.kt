package com.borjabravo.daggerinnocv.injection.app

import com.borjabravo.daggerinnocv.App
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent : AndroidInjector<App>