package ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex_14_0_3 {
	public static void main(String[] args) {
//		IntStream intStream = new Random().ints(); // ���� ��Ʈ��
		IntStream intStream = new Random().ints(10, 5, 10); // ���ѽ�Ʈ��
		intStream
//		.limit(10) // 10���� �ڸ���
		.distinct().forEach(System.out::println);
	}
}
