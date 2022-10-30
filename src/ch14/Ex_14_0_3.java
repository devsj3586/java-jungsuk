package ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex_14_0_3 {
	public static void main(String[] args) {
//		IntStream intStream = new Random().ints(); // 무한 스트림
		IntStream intStream = new Random().ints(10, 5, 10); // 무한스트림
		intStream
//		.limit(10) // 10개만 자르기
		.distinct().forEach(System.out::println);
	}
}
