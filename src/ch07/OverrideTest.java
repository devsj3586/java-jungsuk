package ch07;

class MyPoint3 {
	int x;
	int y;
	
	MyPoint3(int x, int y){ // �����ڷ� �ʱ�ȭ
		this.x = x;
		this.y = y;
	}
	// Object Ŭ������ toString() �������̵�
	public String toString() {
		return "x:"+x+",y:"+y;
	}
}


public class OverrideTest {

	public static void main(String[] args) {
			MyPoint3 p = new MyPoint3(3,5);
//			p.x = 3;
//			p.y = 5;
		System.out.println(p);
//			System.out.println(p.toString());
//			System.out.println("p.x="+p.x);
//			System.out.println("p.y="+p.y);
	}
}
