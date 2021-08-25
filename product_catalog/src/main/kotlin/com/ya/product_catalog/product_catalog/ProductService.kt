package com.ya.product_catalog.product_catalog

import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun getProducts(): List<Product> {
        return this.productRepository.findAll();
    }

    fun findProduct(id: String): Product = this.productRepository.findById(id).orElseThrow { RuntimeException("Company with id $id not found") }

}
