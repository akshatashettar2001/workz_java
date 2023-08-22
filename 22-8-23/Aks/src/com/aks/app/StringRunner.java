package com.aks.app;

public class StringRunner {
	public static void main(String[] args) {

		String data = "Java Applications";

		String data2 = new String();
		data2 = "Web development";

		char ltr = data.charAt(5);
		System.out.println("character at 5 is " + ltr);

		System.out.println("----------------------------------------");

		String[] ary = data.split("v");
		for (int index = 0; index < ary.length; index++) {
			System.out.println("element at index " + index + " is " + ary[index]);
		}

		System.out.println("----------------------------------------");

		String[] ary2 = data.split("i", 2);
		for (int index = 0; index < ary2.length; index++) {
			System.out.println("element at index " + index + " is " + ary2[index]);
		}

		System.out.println("----------------------------------------");

		String data1 = data.concat(" development");
		System.out.println("Modified Data is : " + data1);

		System.out.println("----------------------------------------");

		int cpr = data1.compareTo("JavaScript");
		System.out.println("comparing both Strings " + cpr);

		int cpr1 = data1.compareTo("Java Applications development");
		System.out.println("comparing both Strings " + cpr1);

		System.out.println("----------------------------------------");

		String subString = data1.substring(4);
		System.out.println("Sub String is " + subString);

		String subString1 = data1.substring(2, 7);
		System.out.println("Sub String is " + subString1);

		System.out.println("----------------------------------------");

		boolean empty = data1.isEmpty();
		System.out.println("data1 is empty : " + empty);

		System.out.println("----------------------------------------");

		int len = data1.length();
		System.out.println("length of data1 is : " + len);

		System.out.println("----------------------------------------");

		boolean str = data1.startsWith("J");
		System.out.println("start with : " + str);

		boolean str1 = data1.startsWith("i", 5);
		System.out.println("start with : " + str1);

		System.out.println("----------------------------------------");

		boolean end1 = data1.endsWith("t");
		System.out.println("ends with : " + end1);

		System.out.println("----------------------------------------");

		boolean eql = data2.equalsIgnoreCase("web development");
		System.out.println("Ignoring case Both Strings are equal : " + eql);

		System.out.println("----------------------------------------");

		boolean eql1 = data2.equals("Web Development");
		System.out.println("Both Strings are equal : " + eql1);

		System.out.println("----------------------------------------");

		String upr = data2.toUpperCase();
		System.out.println("Uppercase : " + upr);

		String upr2 = data1.toUpperCase();
		System.out.println("Uppercase : " + upr2);

		System.out.println("----------------------------------------");

		String lwr = data2.toLowerCase();
		System.out.println("Lower case : " + lwr);

		String lwr1 = data1.toLowerCase();
		System.out.println("Lower case : " + lwr1);

		System.out.println("----------------------------------------");

		int index = data2.indexOf('b');
		System.out.println("index of character b is : " + index);

		System.out.println("----------------------------------------");

		String trim = data2.trim();
		System.out.println("Trim : " + trim);

	}
}
