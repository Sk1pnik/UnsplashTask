package com.skipnik.unsplashtask.presentation.galleryfragment

import androidx.lifecycle.*
import androidx.paging.cachedIn
import com.skipnik.unsplashtask.data.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository,
) : ViewModel() {

    val photos = repository.getResults().cachedIn(viewModelScope)

}