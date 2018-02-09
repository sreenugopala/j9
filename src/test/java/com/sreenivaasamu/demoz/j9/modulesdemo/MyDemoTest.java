package com.sreenivaasamu.demoz.j9.modulesdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MyDemoTest {

	@Test
	public void testImmutableCollections() {

		List<String> fruits = List.of("Mangosteen", "Durian fruit", "Longan");

		assertThrows(UnsupportedOperationException.class, () -> {
			fruits.add("Mango");
			fruits.remove(1);
		});

		assertEquals(3, fruits.size());

	}
}
