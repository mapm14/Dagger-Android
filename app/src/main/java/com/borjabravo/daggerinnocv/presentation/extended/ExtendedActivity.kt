package com.borjabravo.daggerinnocv.presentation.extended

import android.os.Bundle
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.presentation.general.BaseActivity
import dagger.android.support.DaggerAppCompatActivity
import org.jetbrains.anko.toast
import javax.inject.Inject

class ExtendedActivity : BaseActivity(), ExtendedActivityView {

    @Inject
    lateinit var presenter: ExtendedActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extended)
        presenter.init(this)
    }

    override fun showToast(message: String) {
        toast(message)
    }

}
