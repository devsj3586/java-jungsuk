package ch07;

class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint {
//	int r;
//}

class Circle {
	MyPoint p = new MyPoint (); // 참조변수의초기화
	int r;
}


public class InhertianceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); // 클래스 이름 @ 객체주소값을 출력
		Circle c2 = new Circle();
		System.out.println(c2.toString()); // 클래스 이름 @ 객체주소값을 출력
	}

}
