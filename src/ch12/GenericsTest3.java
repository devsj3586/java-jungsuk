package ch12;

import java.util.HashMap;

public class GenericsTest3 {

		public static void main(String[] args) {
			HashMap<String, Student2> map = new HashMap<>(); // JDK1.7���� �����ڿ� Ÿ������ ��������
			map.put("�ڹٿ�", new Student2("�ڹٿ�", 1, 1, 100, 100, 100));
			
			//		public Student get(Object key {
			Student2 s = map.get("�ڹٿ�");
			
			System.out.println(map.get("�ڹٿ�").name);
		}// main
	}


class Student2 {
	String name = "";
	int ban;	// ��
	int no;		// ��ȣ
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}