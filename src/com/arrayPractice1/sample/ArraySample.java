package com.arrayPractice1.sample;

import java.util.Scanner;
import java.util.Random;

public class ArraySample {
	public void test1() {
		//test1
//		int ram = (int)(Math.random()*100)+1;
//		int sum = 0;
//		for(int i=1; i<=ram; i++){
//			sum += i;
//			
//		}
//		System.out.println("10개의 정수들의 합: " + sum);
//	}
	
		//test1
	int ar[] = new int[10];
	for(int i=0; i<ar.length; i++) {
		ar[i] = new Random().nextInt(100)+1;
		}
	int sum = 0;
	for(int i=0; i<ar.length; i++) {
		sum += ar[i];
	}
	System.out.println("sumL : " + sum);
	}
	
	 public void test2() {
         int[] iarr = new int[10];
         int max = iarr[0], min = 100;

         for(int i = 0; i < iarr.length; i++) {
                 int random = (int)(Math.random()*100) + 1;
                 iarr[i] = random;
                 System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
         }
         for(int i = 0; i < iarr.length; i++) {
                 max = Math.max(max, iarr[i]);
                 min = Math.min(min, iarr[i]);
         }
         System.out.println("가장 큰 값 : " + max + "\n가장 작은 값 : " + min);
	 }
        
	 public void test3() {
         byte[] barr = new byte[10];

         for(int i = 0; i < barr.length; i++) {
                 int random = (int)(Math.random() * 256) - 128;
                 barr[i] = (byte)(random);
                 System.out.println("iarr[" + i + "]의 값 : " + barr[i]);
         }

         int j = 0, sum = 0;
         while(j < barr.length) {
                 if(barr[j] % 2 == 0) sum += barr[j];
                 j++;
         }
         System.out.println("기록된 10개의 값 중 짝수들의 합계 : " + sum);
 }
	 public void test4() {
		 //test4
//		 Scanner sc = new Scanner(System.in);
//         System.out.print("숫자로 된 문자열 입력 : ");
//         String snum = sc.nextLine();
//
//         String[] sarr = new String[10]; 
//         
//         int num = 0;
//         String sh = "";
//         
//         int sum = 0;
//         for(int i = 0; i < snum.length(); i++) {
//                 sh = snum.substring(i, i + 1);
//                 sarr[i] = sh;
//                 num = Integer.parseInt(sarr[i]);
//                 sum += num;
//         }
//         System.out.println("각 자리의 숫자들의 합 : " + sum);
		 
		 //test4
		 Scanner sc = new Scanner(System.in);
		 int sum = 0;
		 
		 System.out.print("숫자 입력: ");
		 String val = sc.next();
		 
		 for(int i=0; i<val.length(); i++) {
			 String str = val.substring(i, i+1);
			 sum += Integer.parseInt(str);
		 }
		 System.out.println(sum);
 }
	 
	   public void test5() {
		   //test5
//           Scanner sc = new Scanner(System.in);
//           System.out.print("숫자로 된 문자열 입력 : ");
//           String snum = sc.nextLine();
//
//           int[] sarr = new int[10]; 
//           
//           int sum = 0;
//           for(int i = 0; i < snum.length(); i++) {
//                   sarr[i] = snum.charAt(i) -48;      
//                   sum += sarr[i];
//           }
//           System.out.println("각 자리의 숫자들의 합 : " + sum);
		   
		   //test5
		   Scanner sc = new Scanner(System.in);
		   int sum = 0;
		   
		   System.out.print("숫자 입력: ");
		   String val = sc.next();
		   
		   for(int i=0; i<val.length(); i++) {
			   sum += (int)val.charAt(i)-48;
		   }
		   System.out.println("sum: " + sum);
   }
}
