package ch07_2;

import ch07.MyParent;

class MyChild extends MyParent {
	public void printMember() {
//		System.out.println(prv);	// 에러
//		System.out.println(dft);	// 에러
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
	}
}
public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러
//		System.out.println(p.dft);	// 에러
//		System.out.println(p.prt);	// 에러
		System.out.println(p.pub);	// OK
	}
}