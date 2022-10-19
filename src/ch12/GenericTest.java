package ch12;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();	// JDK1.5 이전
		ArrayList<Integer> list = new ArrayList<Integer>(); // JDK1.5이후 
		list.add(10);	// list.add(new Integer(10));
		list.add(20);
		list.add(30); 	// 타입 체크가 강화됨. 제네릭스 덕분에
		
//		Integer i = (Integer)list.get(2); // 컴파일 OK
		Integer i = list.get(2); // 형변환 생략가능
		
		System.out.println(list);
		
	}

}
