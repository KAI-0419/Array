package com.test01;

public class ArrayTest02 {
	
	public void shallowCopy() {
		
		int[] oArr = {1,2,3,4,5};
		int[] cArr = oArr;
		
		
		String str = "";
		
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("1.aArr: "+str);
		
		str = "";
		
		for(int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr: "+str);
		
		oArr[0] = 99;
		
		str = "";
		
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("3.aArr: "+str);
		
		str = "";
		
		for(int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("4.cArr: "+str);
		
		System.out.println("oArr의 hashcode: " + oArr.hashCode());
		System.out.println("cArr의 hashcode: " + cArr.hashCode());
	}
	
	public void deepCopy1() {
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[oArr.length];
		
		for(int i=0; i<oArr.length; i++) {
			cArr[i] = oArr[i];
		}
		String str = "";
		
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("1.oArr: "+str);
		
		str = "";
		
		for(int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr: "+str);
		
		oArr[0] = 99;
		
		str = "";
		
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("3.oArr: "+str);
		
		str = "";
		
		for(int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("4.cArr: "+str);
		
		System.out.println("oArr hashcode: " + oArr.hashCode());
		System.out.println("cArr hashcode: " + cArr.hashCode());
	}
	
	public void deepCopy2() {
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
				
//		System.arraycopy(oArr,0,cArr,3,oArr.length);
		
//		cArr = oArr.clone();
		
		System.out.println("준비된 배열 주소: "+cArr.hashCode());
		cArr = oArr.clone();
		System.out.println("준비된 배열 주소: "+cArr.hashCode());
		String str = "";
		
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("1.aArr: "+str);
		
		str = "";
		
		for(int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr: "+str);
	}
}
