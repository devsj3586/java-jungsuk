package ch07;

public class MyParent{				// 접근제어자가 default > public변경
	private 	int prv;	// 같은 클래스
				int dft;	// 같은 패키지
	protected 	int prt;	// 같은 패키지 + 자손(다른 패키지)
	public 		int pub;	// 접근제한 없음.
	
	public void printMember() {
		System.out.println(prv);	// OK
		System.out.println(dft);	// OK
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
	}
}

class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러
		System.out.println(p.dft);	// OK	
		System.out.println(p.prt);	// OK
		System.out.println(p.pub);	// OK
	}

}
