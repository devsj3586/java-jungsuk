package ch07;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�.");}
}

interface Fightable { // �������̽��� ��� �޼���� public abstract.
	void move(int x, int y);	//public abstract ����
	void attack(Fightable f);	//public abstract ����
}

class Fighter extends Unit2 implements Fightable {
	// �������̵� ��Ģ : ���󺸴� ���������ڰ� ������ �ȵȴ�.
	public void move(int x, int y) {  
		System.out.println("["+x+","+y+"]�� �̵�");
	}	
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
	
	Fightable getFightable() {
		Fightable f= new Fighter();
		return f;
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
//		Unit2 u = new Fighter();  
//		Fightable f = new Fighter();
//		u.move(100,200);
////		u.attack(new Fighter()); // Unit2���� attack()�� ��� ȣ�� �Ұ� 
//		u.stop();
//		
//		f.move(100,200);
//		f.attack(new Fighter());
//		f.stop();				// Fightable ���� stop�� ��� ȣ�� �Ұ�
	}

}
