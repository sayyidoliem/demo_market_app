package com.example.kampusappdemo.module.user.feature.setting.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SettingsViewmodel : ViewModel() {

    var translate = mutableStateOf(false)

    fun isTranslateDialogOpen(){
        translate.value = true
    }

    fun isTranslateDialogClose(){
        translate.value = false
    }
}