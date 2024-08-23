package com.nec;
public class DupCountStrg2 {
	public static void main(String[] args) {
		String str = "19122284000555";// 489---3
		// 489
		//0125
		//jaysree.21kh1A0470
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		//System.out.println((int)'0');
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);// 1
			// '0' 0
			count[ch-48]++;//count[1]++
		}
		for(int c=0;c<10;c++) {
			if(count[c] > 1)
			System.out.println(c+"--->"+count[c]);
		}
		
				
	}

}
