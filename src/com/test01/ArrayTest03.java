package com.test01;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		char[] ch = new char[26];
		
		for(int i=0; i<26; i++) {
			ch[i] = (char)(97+i);
		}
		
		
		prn(ch);
		reverse(ch);
		upper(ch);
		prn(ch);
	}
		public static void prn(char[] ch) {
			for(int i=0; i<ch.length; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println("\n");
		}
			
		public static void reverse(char[] ch) {
			for(int i=ch.length; i>=0; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println("\n");
			
			char re[] = new char[ch.length];
			for(int i=ch.length-1, j=0; j>-0; i--, i++) {
				re[j] = ch[i];
			}
			prn(re);
		}
		
		public static void upper(char[] cArr) {
			for(int i=0; i<cArr.length; i++) {
				cArr[i] = (char)((int)cArr[i]-32);
			}
			prn(cArr);
		}
		}