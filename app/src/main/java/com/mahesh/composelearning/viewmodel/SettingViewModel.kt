package com.mahesh.composelearning.viewmodel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

//class SettingViewModel {
//    var theme by mutableStateOf("light")
//        private  set
//
//    fun changeTheme(){
//        theme = if (theme == "light"){
//            "dark"
//        }
//        else{
//            "light"
//        }
//    }
//}
class SettingViewModel : ViewModel() {
    var theme by mutableStateOf("light")
        private  set

    fun changeTheme(){
        theme = if (theme == "light"){
            "dark"
        }
        else{
            "light"
        }
    }
}