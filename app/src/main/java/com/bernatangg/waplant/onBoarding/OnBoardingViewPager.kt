package com.bernatangg.waplant.onBoarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class OnBoardingViewPager(private val mLayoutInflater: LayoutInflater, private val mLayouts: Array<Int>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view: View = mLayoutInflater.inflate(mLayouts[position], container, false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

    override fun getCount(): Int {
        return mLayouts.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

}