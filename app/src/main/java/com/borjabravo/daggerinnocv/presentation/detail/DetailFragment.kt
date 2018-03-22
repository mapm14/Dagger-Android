package com.borjabravo.daggerinnocv.presentation.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.borjabravo.daggerinnocv.R
import dagger.android.DaggerFragment
import org.jetbrains.anko.toast
import javax.inject.Inject

class DetailFragment : DaggerFragment(), DetailFragmentView {

    @Inject
    lateinit var presenter: DetailFragmentPresenter

    companion object {
        fun getNewInstance(): DetailFragment =
                DetailFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        presenter.init(this)
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun showToast(message: String) {
        toast(message)
    }

}
