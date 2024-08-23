package com.nec;

public class PrgOne {
	public static void main(String[] args) {
	char ch1 = 'a',ch2='A';
	int d = ch1-ch2;// 32
	
	String str = "Hello Welcome to NIT College";
	char eachChar;
	String newStr = "";
	for(int i=0;i<str.length();i++) {
		
		eachChar = str.charAt(i);
		if( (eachChar >='a') &&(eachChar <='z')) {
			newStr = newStr + (char)(eachChar - d);
		}
		else {
			newStr = newStr + eachChar;
		}
		
	}
	
	System.out.println("final Res---->"+newStr);
	}
}
