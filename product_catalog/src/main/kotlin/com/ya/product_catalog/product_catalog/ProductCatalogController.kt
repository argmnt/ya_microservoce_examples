package com.ya.product_catalog.product_catalog

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductCatalogController(private val productService: ProductService) {


    @GetMapping("/products", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProducts(): List<Product> = productService.getProducts()

    @GetMapping("/products/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProduct(@PathVariable id : String) : Product = productService.findProduct(id)

}