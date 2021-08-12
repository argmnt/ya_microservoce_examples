package com.ya.product_catalog.product_catalog

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "product-client", url = "http://localhost:8080")
interface ProductClient {

    @GetMapping("/products")
    fun getProducts(): List<Product>;
}