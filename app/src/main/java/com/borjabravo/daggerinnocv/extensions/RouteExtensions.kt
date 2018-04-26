package com.borjabravo.daggerinnocv.extensions

import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.borjabravo.daggerinnocv.presentation.detail.DetailFragment
import com.borjabravo.daggerinnocv.presentation.extended.ExtendedActivity

private fun AppCompatActivity.showFragment(containerId: Int, fragment: Fragment) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(containerId, fragment)
    transaction.addToBackStack(fragment.javaClass.simpleName)
    transaction.commit()
}

fun AppCompatActivity.showDetailFragment(containerId: Int) {
    showFragment(containerId, DetailFragment.getNewInstance())
}

fun Fragment.goToExtendedActivity() {
    activity?.startActivity(Intent(activity, ExtendedActivity::class.java))
}