package com.borjabravo.daggerinnocv.extensions

import android.app.Activity
import android.app.Fragment
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragment

private fun Activity.showFragment(containerId: Int, fragment: Fragment) {
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(containerId, fragment)
    transaction.addToBackStack(fragment.javaClass.simpleName)
    transaction.commit()
}

fun Activity.showDetailFragment(containerId: Int) {
    showFragment(containerId, DetailFragment.getNewInstance())
}