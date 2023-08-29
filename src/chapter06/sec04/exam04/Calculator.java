package chapter06.sec04.exam04;


// 클래스 내부에서 메서드를 호출하는 자바 프로그램 예시입니다.
public class Calculator {

	// 계산기(Calculator)에서 덧셈의 연산 기능을 수행하는 plus() 메서드를 선언해 줍니다.
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;		
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행 결과 = " + result);
	}

	private void println(String message) {
		System.out.println(message);
	}
}
