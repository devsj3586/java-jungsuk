package ch08;

class Ex8_7 {
	public static void main(String[] args) {
		try {  // Exception�� �� �ڼյ��� �ݵ�� ���� ó����  ����� �Ѵ�.(�ʼ�)
			throw new Exception();// Exception�� ���Ƿ� �߻���Ų��.
		}catch(Exception e ) {}
		
		// RuntimeException�� �� �ڼ��� ����ó���� ������ �ʾƵ� �������� �ȴ�.(����)
		throw new RuntimeException();
	}
}