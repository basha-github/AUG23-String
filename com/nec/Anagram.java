package com.nec;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Listen";
		String str2 = "silent";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// anagram
		boolean isAnagram = true;
		
		if(str1.length() == str2.length()) {
			char chI;
			//for(int i=0;i<str1.length()  ;i++) {
			for(int i=0;i<str1.length() && isAnagram ==true ;i++) {
				chI = str1.charAt(i);
				char chJ;
				boolean isCharFound = false;
				for(int j=0;j<str2.length();j++) {
					chJ = str2.charAt(j);
					if(chI == chJ) isCharFound = true;
				}
				if(isCharFound == false) {
					isAnagram = false;
					//break;
				}
				
				
			}
			
		}
		else {
			isAnagram = false;
		}
		
		if(isAnagram == true) {
			System.out.println("Yes .It is Anagram");
		}
		else {
			System.out.println("Not");
		}

	}

}
