package com.sreenivaasamu.demoz.j9.modulesdemo;

import java.util.List;
import java.util.Set;

public class MyDemo {

	public static void main(String args[]) {

		List<String> lordNames = List.of("Govinda", "Gopaala", "Keshava");

		System.out.println(lordNames);

		Set<String> myNames = Set.of("Sreenu", "Gopala", "Sainatha");

		System.out.println(myNames);
	}
}