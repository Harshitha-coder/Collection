package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTester {

	public static void main(String[] args) {

		ProductDTO product1 = new ProductDTO("Toothpaste", "Patanjali", 130, 100D);
		ProductDTO product2 = new ProductDTO("IceCream", "Amul", 160, 1L);
		ProductDTO product3 = new ProductDTO("Salt", "Tata", 20, 1000D);
		ProductDTO product4 = new ProductDTO("WaterBottle", "Bisleri", 10, 0.5D);
		ProductDTO product5 = new ProductDTO("Detergent", "Nirma", 150, 1000D);

		List<ProductDTO> list = new ArrayList<ProductDTO>();
		list.add(product4);
		list.add(product2);
		list.add(product3);
		list.add(product5);
		list.add(product1);

		Collections.sort(list);
		for (ProductDTO product : list) {
			System.out.println(product);
			System.out.println(product.getPrice());

	}

}
}