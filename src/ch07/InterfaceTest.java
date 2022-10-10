package ch07;

class A {
//	public void method(B b) {   // �������̽� I�� ������ �͸� ���Ͷ� 
	public void method(I i) {   // �������̽� I�� ������ �͸� ���Ͷ� 
		i.method();
	}
}
// B Ŭ������ ����� ������ �и� 
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {  // C�� ����� A��  ����ǰ� �ȴ� .
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // A�� B�� ���(����)
	}

}
