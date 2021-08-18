package com.ya.product_catalog.product_catalog

import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun getProducts(): List<Product> {
        return this.productRepository.findAll();
    }


}
