package ch09;

public class Test {

	public static void main(String[] args) {
//		int i = Integer.parseInt("100");
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10)); // ���� ����
		System.out.println("i="+Integer.parseInt("100",2));
		System.out.println("i="+Integer.parseInt("FF",16));
	}

}
