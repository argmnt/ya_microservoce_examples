package com.ya.product_catalog.ProductIT

import com.ya.product_catalog.product_catalog.Product
import com.ya.product_catalog.product_catalog.ProductClient
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.assertj.core.api.Assertions
import org.springframework.beans.factory.annotation.Autowired


@SpringBootTest
class ProductCatalogApplicationTests(@Autowired var productClient : ProductClient) {

	private val testRestTemplate: TestRestTemplate = TestRestTemplate();
	private val productsResourceUrl: String = "/products";

	@Value("\${app.security.jwt.keystore-location}")
	private val baseURL: String? = null

	@Test
	fun contextLoads() {
	}

	@Test
	fun getProducts() {
		val products = productClient.getProducts();
	}

}
