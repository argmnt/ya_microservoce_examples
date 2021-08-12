package com.ya.product_catalog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ProductCatalogApplication

fun main(args: Array<String>) {
	runApplication<ProductCatalogApplication>(*args)
}
