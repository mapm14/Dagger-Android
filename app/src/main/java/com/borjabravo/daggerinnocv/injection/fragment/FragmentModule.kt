package com.borjabravo.daggerinnocv.injection.fragment

import com.borjabravo.daggerinnocv.injection.scopes.PerFragment
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragment
import com.borjabravo.daggerinnocv.presentation.detail.injection.DetailFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [DetailFragmentModule::class])
    abstract fun detailFragmentInjector(): DetailFragment

}