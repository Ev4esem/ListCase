package com.example.listcase.view.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.example.listcase.MainApp
import com.example.listcase.domain.di.AppComponent

class Factory<T : ViewModel>(
    savedStateRegistryOwner : SavedStateRegistryOwner,
    private val create : (stateHandle : SavedStateHandle) -> T
) : AbstractSavedStateViewModelFactory(savedStateRegistryOwner,null) {

    override fun <T : ViewModel> create(
        key : String,
        modelClass : Class<T>,
        handle : SavedStateHandle
    ) : T {
        return create.invoke(handle) as T
    }

}

inline fun <reified T : ViewModel> Fragment.lazyViewModel(
    noinline create : (stateHandle: SavedStateHandle) -> T
) = viewModels<T> {
    Factory(this,create)
}

fun Fragment.getAppComponent() : AppComponent =
    (requireContext() as MainApp).appComponent