package com.borjabravo.daggerinnocv.injection.fragment

import com.borjabravo.daggerinnocv.injection.scopes.PerFragment
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @PerFragment
    @ContributesAndroidInjector
    abstract fun detailFragmentInjector(): DetailFragment

}