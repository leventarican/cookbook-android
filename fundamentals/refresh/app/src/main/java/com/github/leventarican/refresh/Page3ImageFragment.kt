package com.github.leventarican.refresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.github.leventarican.refresh.databinding.FragmentPage3ImageBinding
import com.github.leventarican.refresh.databinding.FragmentPage3TitleBinding

/**
 * by pressing the button in [Page3TitleFragment] the view is navigated ot [Page3ImageFragment]
 */
class Page3ImageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPage3ImageBinding>(inflater, R.layout.fragment_page3_image,container,false)
        return binding.root
    }

}
