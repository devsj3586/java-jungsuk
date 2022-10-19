package ch12;

class Parent {
	void parentMethod() { }
}


class Child extends Parent { 
	@Override 
	@Deprecated
	void parentMethod() { // 조상 메서드의 이름을 잘못 적었음
	} 
}
	
class Ex12_7 { 
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // deprecated된 메서드 사용 
	}
}