package ch12;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();	// JDK1.5 ����
		ArrayList<Integer> list = new ArrayList<Integer>(); // JDK1.5���� 
		list.add(10);	// list.add(new Integer(10));
		list.add(20);
		list.add(30); 	// Ÿ�� üũ�� ��ȭ��. ���׸��� ���п�
		
//		Integer i = (Integer)list.get(2); // ������ OK
		Integer i = list.get(2); // ����ȯ ��������
		
		System.out.println(list);
		
	}

}
