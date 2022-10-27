package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_0_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream();  // list�� Stream���� ���� 
		
		intStream.forEach(System.out::print); // forEach() ��������
		// Stream�� 1ȸ��. Stream�� ���� ���������� �����ϸ� stream�� ������.
//		intStream = list.stream(); // list�κ��� Stream����
//		intStream.forEach(System.out::println);
		System.out.println();
		
		Stream<String> strStream = Stream.of(new String[] {"a", "b", "c"});
		strStream.forEach(System.out::println);
	}

}
