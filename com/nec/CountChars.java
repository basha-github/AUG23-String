package com.nec;

public class CountChars {
	public static void main(String[] args) {
		String str = "abcsdrasasfsdafsadfsdaf";// 489---3
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		str = str.toUpperCase();// 'A'---65
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);// 1
			// '0' 0
			count[ch - 65]++;// count[1]++
		}
		for (int c = 0; c < 26; c++) {
			if (count[c] > 1)
				System.out.println((char)(c+65) + "--->" + count[c]);
		}

	}

}
