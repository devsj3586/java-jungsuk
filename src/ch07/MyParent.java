package ch07;

public class MyParent{				// ���������ڰ� default > public����
	private 	int prv;	// ���� Ŭ����
				int dft;	// ���� ��Ű��
	protected 	int prt;	// ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public 		int pub;	// �������� ����.
	
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
//		System.out.println(p.prv);	// ����
		System.out.println(p.dft);	// OK	
		System.out.println(p.prt);	// OK
		System.out.println(p.pub);	// OK
	}

}
