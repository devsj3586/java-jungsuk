package ch11;

import java.util.*;

class Ex11_5 {
	public static void main(String[] args) {
		Collection c = new TreeSet();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");

		Iterator it = c.iterator();
		//Iterator 는 1회용이라 다 쓰고나면 다시 얻어와야한다 
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
//		for(int i = 0; i<c.size(); i++) {
//			Object obj = c.get(i);
//			System.out.println(obj);
//		}
	}
}