package com.perlera.claseviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.google.android.material.textfield.TextInputLayout
import com.perlera.claseviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel:MainViewModel by viewModels()



    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.actionSearch.setOnClickListener {
        viewModel.onSearch()
        }
    }

}