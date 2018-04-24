package com.borjabravo.daggerinnocv.injection.fragment

import com.borjabravo.daggerinnocv.injection.scopes.ViewScope
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ViewScope
    @ContributesAndroidInjector
    abstract fun detailFragmentInjector(): DetailFragment

}