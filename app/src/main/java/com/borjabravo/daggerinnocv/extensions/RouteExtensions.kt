package com.borjabravo.daggerinnocv.extensions

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragment
import com.borjabravo.daggerinnocv.presentation.extended.ExtendedActivity

private fun Activity.showFragment(containerId: Int, fragment: Fragment) {
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(containerId, fragment)
    transaction.addToBackStack(fragment.javaClass.simpleName)
    transaction.commit()
}

fun Activity.showDetailFragment(containerId: Int) {
    showFragment(containerId, DetailFragment.getNewInstance())
}

fun Fragment.goToExtendedActivity() {
    activity.startActivity(Intent(activity, ExtendedActivity::class.java))
}