package ch14;

public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a: b; // ���ٽ�, �͸�ü
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) {  // �������̵� - ���������ڴ� ���� ���ٲ۴�.
//				return a > b ? a: b;
//			}
//		};
		// ���ٽ�(�͸�ü)�� �ٷ�� ���� ���������� Ÿ���� �Լ��� �������̽��� �Ѵ�.
		MyFunction2 f = (a, b) -> a > b ? a: b; // ���ٽ�, �͸�ü
		
		int value = f.max(3,5);  // �Լ��� �������̽� 
		System.out.println("value = " + value);
	}

}
@FunctionalInterface  // �Լ��� �������̽��� �� �ϳ��� �߻� �޼��常 ������ ��.
 interface MyFunction2 {
//	 public abstract int max(int a, int b);
	 int max(int a, int b);  // public abstract todfir rksmd
 }