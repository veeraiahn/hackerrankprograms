package com.java.dhacker;

public class TESARDLKStringSort {
	
	public static void main(String[] args) throws java.lang.Exception {

		String[] names = { "Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone" };
		String[] names2 = new String[names.length + 1];
		final String str = "TESARDLK";

		char[] charArr = str.toCharArray();
		for (int j = 0; j < charArr.length; j++) {
			for (int i = 0; i < names.length; i++) {
				if (names[i].startsWith(Character.toString(charArr[j]))) {
					String temp = names[i];
					names2[j] = temp;
				}
			}
		}
		System.out.print("Sorted Strings: ");
		for (String s : names2) {
			if (s != null) 
				System.out.print(s + ", ");			
		}
	}
}
