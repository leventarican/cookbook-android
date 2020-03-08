package com.github.leventarican.refresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.github.leventarican.refresh.databinding.FragmentPage3TitleBinding

/**
 * A simple [Fragment] subclass.
 */
class Page3TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPage3TitleBinding>(inflater, R.layout.fragment_page3_title,container,false)
        return binding.root
    }

}
