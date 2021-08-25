package com.ya.product_catalog.product_catalog

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductCatalogController(private val productService: ProductService) {


    @GetMapping("/products", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProducts(): List<Product> {
        return productService.getProducts();
    }



}