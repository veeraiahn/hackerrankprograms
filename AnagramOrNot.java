package com.java.dhacker;

import java.util.Arrays;

public class AnagramOrNot {
	
	public static void main(String[] args) {
		isAnagram("STOP", "TOPS");
		isAnagram("DORMITORY", "DIRTY ROOM");
		isAnagram("STOP", "POSE");
	}
	
	public static void isAnagram(String str1, String str2) {
		String copyOfstr1 = str1.replaceAll("\\s", "");
		String copyOfstr2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (copyOfstr1.length() != copyOfstr2.length()) {
			status = false;
		} else {
			char[] s1Array = copyOfstr1.toLowerCase().toCharArray();
			char[] s2Array = copyOfstr2.toLowerCase().toCharArray();

			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array, s2Array);
		}

		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}
	}

}
