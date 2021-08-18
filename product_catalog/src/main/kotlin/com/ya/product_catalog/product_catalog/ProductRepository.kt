package com.ya.product_catalog.product_catalog

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepository: MongoRepository<Product, Long> {

}
