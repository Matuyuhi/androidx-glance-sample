package com.matuyuhi.sample.glance.data

import com.matuyuhi.sample.glance.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.KoinApplication
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module


private val androidModule = module {
    viewModel<MainViewModel> { MainViewModel() }
}


fun KoinApplication.androidModule() {
    modules(androidModule)
}