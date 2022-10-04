package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
//	public void testArray() {
		
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
//		int num5 = 50;
//		
//		int sum = 0;
//		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
		
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+5;
//		}
//		
//		int sum = 0;
//		
//		for(int i=1; i<=arr.length; i++) {
//			sum += arr[i-1];
//		}
//		
//		System.out.println("sum: " + sum);
//	}
	
//	public void testArray2() {
//		int[] iarr;
//		char carr[];
//		
//		iarr = new int[5];
//		carr = new char[10];
		
//		int[] iarr = new int[5];
//		char carr[] = new char[10];
//		
//		System.out.println(iarr);
//		System.out.println("carr의 hashcode: " + carr.hashCode());
//		System.out.println("carr의 hashcode: " + iarr.hashCode());
//		
//		System.out.println("iarr의 길이: " + iarr.length);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 길이 입력: ");
//		int size = sc.nextInt();
//		
//		double[] darr = new double[size];
//		
//		System.out.println(darr.hashCode());
//		System.out.println(darr.length);
//		
//		darr = new double[30];
//		System.out.println(darr.hashCode());
//		System.out.println(darr.length);
//		
//		darr = null;
//		
//		System.out.println(darr.length);
//	}
	
	public void testArray3() {
		char[] iarr = new char[5];
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println("iarr{"+i+"]의 값: "+iarr[i]);
		}
		
		int[] iarr2 = {11,22,33,44,55};
		int[] iarr3 = new int[] {11,22,33}; //선 공간 만들기
		
		System.out.println(iarr2.length);
		System.out.println(iarr3.length);

		String[] sarr = {"apple","banana"};
		
		for(int i=0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
		}
 		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
