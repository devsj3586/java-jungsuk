package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_0_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream();  // list를 Stream으로 생성 
		
		intStream.forEach(System.out::print); // forEach() 최종연산
		// Stream은 1회용. Stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		intStream = list.stream(); // list로부터 Stream생성
//		intStream.forEach(System.out::println);
		System.out.println();
		
		Stream<String> strStream = Stream.of(new String[] {"a", "b", "c"});
		strStream.forEach(System.out::println);
	}

}
