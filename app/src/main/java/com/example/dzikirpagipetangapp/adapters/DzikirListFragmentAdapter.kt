package com.example.dzikirpagipetangapp.adapters

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.annotation.NonNull
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dzikirpagipetangapp.fragment.FragmentPagi
import com.example.dzikirpagipetangapp.fragment.FragmentPetang


class DzikirListFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val screenFragmentList = arrayListOf<Fragment>(
//        FragmentPagi(),
//        FragmentPetang()
    )

    override fun getItemCount(): Int {
        return screenFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return screenFragmentList[position]
    }

    fun addFragment(fragment: Fragment) {
        Log.d("SAMPE_KE_ADAPTER: ","CARI_FRAGMENT" + fragment )
        screenFragmentList.add(fragment)
    }

}