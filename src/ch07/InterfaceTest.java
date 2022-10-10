package ch07;

class A {
//	public void method(B b) {   // 인터페이스 I를 구현한 것만 들어와라 
	public void method(I i) {   // 인터페이스 I를 구현한 것만 들어와라 
		i.method();
	}
}
// B 클래스의 선언과 구현을 분리 
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {  // C가 생기면 A도  변경되게 된다 .
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // A가 B를 사용(의존)
	}

}
