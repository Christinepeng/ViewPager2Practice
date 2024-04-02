package com.example.viewpager2practice

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2practice.databinding.FragmentScaleBinding
import com.example.viewpager2practice.databinding.FragmentTranslateBinding
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TranslateFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TranslateFragment : Fragment() {
    private var _binding: FragmentTranslateBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTranslateBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageViewTranslate.setOnClickListener {
            ObjectAnimator.ofFloat(it, "translationX", it.translationX + Random.nextInt(-100, 100)).start()
            ObjectAnimator.ofFloat(it, "translationY", it.translationY + Random.nextInt(-100, 100)).start()
        }
    }
}