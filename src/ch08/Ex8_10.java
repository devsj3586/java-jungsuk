package ch08;

import java.io.*;

class Ex8_10 { 
	public static void main(String[] args) {
			File f = createFile("");  // ���ܹ߻�
			System.out.println( f.getName()+"������ ���������� �����Ǿ����ϴ�.");
	}	// main�޼����� ��

	static File createFile(String fileName) { // throws Exception {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			
		}catch(Exception e) {
			fileName = "�������.txt";
		}
		File f = new File(fileName);		//  FileŬ������ ��ü�� �����.
     	// File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;		// ������ ��ü�� ������ ��ȯ�Ѵ�.
	}	// createFile�޼����� ��
}	// Ŭ������ ��