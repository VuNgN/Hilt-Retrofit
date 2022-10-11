package com.vungn.hilt.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.vungn.hilt.databinding.FragmentMainBinding
import com.vungn.hilt.ui.main.contract.MainViewModel
import com.vungn.hilt.ui.main.contract.impl.MainViewModelImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private val vm: MainViewModel by viewModels<MainViewModelImpl>()
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentMainBinding.inflate(inflater, container, false).also {
        binding = it
        binding.vm = vm
        binding.lifecycleOwner = this.viewLifecycleOwner
    }.root
}