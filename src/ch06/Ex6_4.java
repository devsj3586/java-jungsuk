package ch06;

class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		
		
		long result = mm.max(5L , 3L);			// �� �߿� ū ���� ��ȯ�ϴ� �޼���
		long result1 = mm.add(5L, 3L);			// add �޼��� ȣ�� 
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.min(5L, 3L);
		mm.printGugudan(6);
	
		
		System.out.println("max(5l, 3L) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("min(5L, 3L) = " + result5);
	}
 }

 class MyMath {
	 void printGugudan(int dan) {
		 if(!(2 <= dan && dan <=9))
			 return;			// �Է¹��� ��(dan)�� 2~9�� �ƴϸ�, �޼��� �����ϰ� ���ư���
		 for(int i=1; i <= 9; i++) {
			 System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		 }
//		 return;				�������� 
	 }
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	// �� ���� �޾Ƽ� ���߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	long max(long a, long b) {
		if(a > b)
			return a;		// ���ǽ��� ���϶��� ����
		else
			return b;		// ���ǽ��� ������ �� ���� 
	}
	long min(long a, long b) {
		long result = a < b ? a : b;
		return result;
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
