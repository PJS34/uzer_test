package com.example.uzer_test

import adapters.BaseRecyclerAdapter
import adapters.GlobalRecyclerAdapter
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uzer_test.databinding.HomePageFragmentBinding
import createBaseDataset

class HomePageFragment : Fragment() {

    companion object {
        fun newInstance() = HomePageFragment()
    }

    private lateinit var viewModel: HomePageViewModel
    private lateinit var binding: HomePageFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.home_page_fragment,
            container,
            false
        )

        viewModel = ViewModelProvider(this).get(HomePageViewModel::class.java)
        /*
        val adapter = BaseRecyclerAdapter(createBaseDataset())
        binding.baseRecyclerView.adapter = adapter
        binding.baseRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        */
        val globalAdapter = context?.let { GlobalRecyclerAdapter(it) }
        binding.baseRecyclerView.adapter = globalAdapter
        binding.baseRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return binding.root

    }




}