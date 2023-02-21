package com.nahuelarrua.practicaconrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.nahuelarrua.practicaconrecyclerview.data.Product
import com.nahuelarrua.practicaconrecyclerview.databinding.LayoutProductItemBinding


class ProductListAdapter(
    private var items: List<Product>
) : RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    fun submitList(productList: List<Product>) {
        items = productList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutProductItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = items[position]
        holder.bind(product)
    }

    class ProductViewHolder(
        itemBinding: LayoutProductItemBinding
    ) : RecyclerView.ViewHolder(itemBinding.root) {

        private val image = itemBinding.imageViewProduct
        private val name = itemBinding.textViewProductName
        private val price = itemBinding.textViewProductPrice

        fun bind(product: Product) {
            name.text = product.name
            price.text = "$${product.price} MXN"

            image.load(product.imageURL)


        }

    }

}