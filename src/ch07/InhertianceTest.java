package ch07;

class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint {
//	int r;
//}

class Circle {
	MyPoint p = new MyPoint (); // �����������ʱ�ȭ
	int r;
}


public class InhertianceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); // Ŭ���� �̸� @ ��ü�ּҰ��� ���
		Circle c2 = new Circle();
		System.out.println(c2.toString()); // Ŭ���� �̸� @ ��ü�ּҰ��� ���
	}

}
