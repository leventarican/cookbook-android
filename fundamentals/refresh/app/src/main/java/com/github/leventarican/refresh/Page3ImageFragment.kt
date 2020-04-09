package com.github.leventarican.refresh

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.github.leventarican.refresh.databinding.FragmentPage3ImageBinding

/**
 * by pressing the button in [Page3TitleFragment] the view is navigated ot [Page3ImageFragment]
 * from here (this fragment) it will conditionally navigate
 */
class Page3ImageFragment : Fragment() {

    val options = Pair("java", "kotlin")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPage3ImageBinding>(inflater, R.layout.fragment_page3_image,container,false)

        // bind this fragment class to the layout
        binding.instance = this

        binding.btPage3FragmentNext.setOnClickListener {
            val userDecision = binding.rgOptions.checkedRadioButtonId
            if (userDecision != -1) {
                when (userDecision) {
//                    R.id.rb_first_answer -> view!!.findNavController().navigate(R.id.action_page3ImageFragment_to_page3JavaFragment)
//                    R.id.rb_second_answer -> view!!.findNavController().navigate(R.id.action_page3ImageFragment_to_page3KotlinFragment)

                    // when using Safe Args: navigation-safe-args-gradle-plugin
                    R.id.rb_first_answer -> view!!.findNavController().navigate(Page3ImageFragmentDirections.actionPage3ImageFragmentToPage3JavaFragment())
                    R.id.rb_second_answer -> view!!.findNavController().navigate(Page3ImageFragmentDirections.actionPage3ImageFragmentToPage3KotlinFragment())
                }
            }
        }

        return binding.root
    }

}
