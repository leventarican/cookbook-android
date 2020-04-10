package com.github.leventarican.refresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 */
class Page3JavaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val args = Page3JavaFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context, "hello: ${args.hello}", Toast.LENGTH_LONG).show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page3_java, container, false)
    }

}
