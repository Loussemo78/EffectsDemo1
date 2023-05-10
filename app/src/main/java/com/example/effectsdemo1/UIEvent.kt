package com.example.effectsdemo1

sealed class UIEvent{
  data class ShowMessage(val message:String):UIEvent()
}
