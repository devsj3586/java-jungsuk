package ch09;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {  // ArrayList �� ��ü�� ���尡��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100)); // list���� ��ü�� �߰�����
		list.add(100);   // JDK1.5 �������� ����
		
//		Integer i = list.get(0); // list�� ����� ù��° ��ü�� ������.
//		int i = list.get(0).intValue(); // intValue()�� Integer�� int�� ��ȯ
		int i = list.get(0); // JDK1.5���� ���� ���� 
		
	}

}
