package com.ya.product_catalog.product_catalog

import lombok.AllArgsConstructor
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@AllArgsConstructor
@Component
class DataInitializer(val productRepository: ProductRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val product1 = Product("1", "p1", "p1 desc")
        val product2 = Product("2", "p2", "p2 desc")
        val product3 = Product("3", "p3", "p3 desc")
        productRepository.saveAll(listOf(product1, product2, product3))
    }
}