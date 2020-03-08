package com.github.leventarican.refresh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.github.leventarican.refresh.databinding.FragmentPage3TitleBinding

/**
 * this fragment has a connection to [Page3ImageFragment] which is defined in navigation.xml (action_page3TitleFragment_to_page3ImageFragment)
 */
class Page3TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPage3TitleBinding>(inflater, R.layout.fragment_page3_title,container,false)

        // navigation.xml for the connection between the fragments Page3TitleFragment -> Pag3ImageFragment
        binding.btPage3Fragment.setOnClickListener {
            view!!.findNavController().navigate(R.id.action_page3TitleFragment_to_page3ImageFragment)
        }

        return binding.root
    }
}