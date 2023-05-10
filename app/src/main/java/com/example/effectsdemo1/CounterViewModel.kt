package com.example.effectsdemo1

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class CounterViewModel:ViewModel() {
    private val _screenState = mutableStateOf(MainScreenState(
        inputValue = "",
        displayingResult = "Total is 0.0"
    )
    )

    val screenState : State<MainScreenState> = _screenState

    private val _uiEventFlow = MutableSharedFlow<UIEvent>()
    val uiEventFlow = _uiEventFlow.asSharedFlow()


}