package ch11;

import java.util.*;

class Ex11_13 {
	public static void main(String[] args) {
		Set set = new TreeSet();  // ���� �˻�, ������ ����. �����ʿ����
//		Set set = new HashSet();  // ���� �ʿ�
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);  // set.add(new Integer(num));
		}

		System.out.println(set);
	}
}

//class Test implements Comparable {
//
//	@Override
//	public int compareTo(Object o) {
//		return -1;
//	}
//	
//}
//
