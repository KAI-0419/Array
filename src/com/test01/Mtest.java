package com.test01;

public class Mtest {

	public static void main(String[] args) {
		ArrayTest01 test = new ArrayTest01();
//		test.testArray();
//		test.testArray2();
//		test.testArray3();

		ArrayTest02 test2 = new ArrayTest02();
		test2.shallowCopy();
		test2.deepCopy1();
		test2.deepCopy2();
	}

}
