package ch08;

class Ex8_4 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);  // 예외발생 
			System.out.println(4); 	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException"); // 여기서 예외가 처리되기 때문에 다음 catch부분 실행 X 
		} catch (Exception e){ 			// Exception 모든 예외 최고 조상이기때문에 모든 예외 처리가능  타입은 일치하는게 좋음 
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝 
} 