package com.ya.product_catalog.product_catalog

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable

@Document(collection = "products")
data class Product(@Id val id: String, val name: String, val description: String) : Serializable