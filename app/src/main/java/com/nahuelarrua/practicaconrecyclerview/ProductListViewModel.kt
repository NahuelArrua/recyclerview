package com.nahuelarrua.practicaconrecyclerview

import androidx.lifecycle.ViewModel
import com.nahuelarrua.practicaconrecyclerview.data.Product
import com.nahuelarrua.practicaconrecyclerview.data.getProducts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProductListViewModel: ViewModel(){
    private var _productList = MutableStateFlow<List<Product>>(emptyList())
    val productList: StateFlow<List<Product>> = _productList

    init {
        _productList.value = getProducts()
    }
}