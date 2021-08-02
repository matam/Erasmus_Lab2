package edu.zut.wi.erasmus.fragment.ui.randomnumber

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlin.random.Random

class RandomNumberViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Click Button to Randomize number"
    }
    var text: LiveData<String> = _text

    fun generateRandom() {
        _text.postValue(Random.nextInt(0,100).toString());
    }

    }

