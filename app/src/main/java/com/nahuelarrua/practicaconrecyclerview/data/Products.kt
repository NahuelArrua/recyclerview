package com.nahuelarrua.practicaconrecyclerview.data

fun getProducts(): List<Product> {
    return listOf(
        Product(
            id = 10001,
            name = "Kayak Boreal",
            imageURL = "",
            price = 20000f,
            description = "descripcion"
        ),
    )
}