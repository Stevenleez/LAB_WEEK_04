package com.example.lab_week_04

import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(parentFragment: CafeFragment) : FragmentStateAdapter(parentFragment) {

    // Build the tab contents from string resources via the fragment
    private val contents = listOf(
        parentFragment.getString(R.string.starbucks_desc),
        parentFragment.getString(R.string.janjijiwa_desc),
        parentFragment.getString(R.string.kopikenangan_desc),
    )

    override fun getItemCount(): Int = contents.size

    override fun createFragment(position: Int) =
        CafeDetailFragment.newInstance(contents[position])
}