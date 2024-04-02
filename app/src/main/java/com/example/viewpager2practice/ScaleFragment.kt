package com.example.viewpager2practice

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2practice.databinding.FragmentScaleBinding
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ScaleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ScaleFragment : Fragment() {

    private var _binding: FragmentScaleBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScaleBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageViewScale.setOnClickListener {
            val factor = if (Random.nextBoolean()) 0.1f else -0.1f
            ObjectAnimator.ofFloat(it, "scaleX", it.scaleX + factor).start()
            ObjectAnimator.ofFloat(it, "scaleY", it.scaleY + factor).start()
        }
    }
}