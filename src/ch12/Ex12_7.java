package ch12;

class Parent {
	void parentMethod() { }
}


class Child extends Parent { 
	@Override 
	@Deprecated
	void parentMethod() { // ���� �޼����� �̸��� �߸� ������
	} 
}
	
class Ex12_7 { 
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // deprecated�� �޼��� ��� 
	}
}