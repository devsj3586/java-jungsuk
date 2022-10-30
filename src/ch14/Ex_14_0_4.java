package ch14;

import java.util.stream.Stream;

public class Ex_14_0_4 {
	public static void main(String[] args) {
		// iterate(T seed, UnaryOperator f) 단항 연산자
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		// generate(Supplier s ) : 주기만하는 것 입력X, 출력 O
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(10).forEach(System.out::println);
	}
}
