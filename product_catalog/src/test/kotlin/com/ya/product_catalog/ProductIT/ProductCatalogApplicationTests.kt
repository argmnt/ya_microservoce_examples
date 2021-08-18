package com.ya.product_catalog.ProductIT

import com.mongodb.assertions.Assertions
import com.ya.product_catalog.product_catalog.Product
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod


@SpringBootTest
class ProductCatalogApplicationTests(@Value("\${app.url}") val baseURL: String) {

	private val testRestTemplate: TestRestTemplate = TestRestTemplate();
	private val productsResourceUrl: String = "/products";

	@Test
	fun contextLoads() {
	}

	@Test
	fun getProducts() {
		val products = testRestTemplate.exchange(
			baseURL + productsResourceUrl,
			HttpMethod.GET,
			null,
			object : ParameterizedTypeReference<List<Product?>?>() {})

		Assertions.assertTrue(!products.body.isNullOrEmpty())
	}
}
