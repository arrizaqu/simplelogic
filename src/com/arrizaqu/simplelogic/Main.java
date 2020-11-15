package com.arrizaqu.simplelogic;

import java.util.Arrays;

import com.arrizaqu.simplelogic.utils.MyUtils;


public class Main {

	public static void main(String[] args) {
		int length = 10;
		
		//get even / odd
		int[] result = MyUtils.getEvenOrOdd(length);
		System.out.println(Arrays.toString(result));
		
		//get data fibonachi
		int[] fibRs = MyUtils.getFibonachi(length);
		System.out.println(Arrays.toString(fibRs));
		
		//convert data char to code ascii
		char[] mychars = new char[] {'S', 'E', 'P', 'U', 'T','I','H',' ','B','A','N','Y','A','K'};
		int[] charRs = MyUtils.getCodeAsciiFromChar(mychars);
		System.out.println(Arrays.toString(charRs));
		
		//convert data ascii to char
		int[] dataInt = new int[] {83, 69, 80, 85, 84, 73, 72, 32, 66, 65, 78, 89, 65, 75};
		char[] charRs2 = MyUtils.getCharFromCodeAscii(dataInt);
		System.out.println(Arrays.toString(charRs2));
		
		//sorting data with bubble sort
		int[] mydata = new int[] {1,3,4,2,1,7,3,8};
		int[] sortRs = MyUtils.getBubbleSort(mydata);
		System.out.println(Arrays.toString(sortRs));
	}
	
}
