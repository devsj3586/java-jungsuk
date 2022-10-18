package ch11;

import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		// set의 크기가 6보다 작은동안 1~45사이의 난수를 저장
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
//			set.add(new Integer(num));
			set.add(num);
		}
//		System.out.println(set);  // 1.set의 모든 요소를  list에 저장 2. list를 정렬 3.출력
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list);          // Collections.sort(List list)
		System.out.println(list);
	}
}
