package ch11;

import java.util.*;

class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");  // �ߺ��̶� ����ȵ�
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		System.out.println(set);
	}
}
// equals()�� hashCode() �������̵��ؾ� HashSet�� �ٸ��� ����.

class Person {
	@Override
	public int hashCode() {
		// int hash(Object ... values);   // ��������
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		// ���ڽ�(this)�� �̸��� ���ϸ� p�� �� 
		return this.name.equals(p.name) && this.age == p.age;
	}

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name +":"+ age;
	}
}