package chapter04.sec02;

import java.util.Scanner;

//Scanner클래스 활용 정수값으로 단(변수명:dan)을 입력 받아서,
//for문을 활용하여, 해당 단(변수명: dan)의 구구만단 화면으로 출력하는
//자바 프로그램을 제작하시기 바랍니다.
public class Practice04_input_dan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구하고 싶은 단을 입력하세요==>");
		int dan = scan.nextInt();
		

		for (int times = 1; times <= 9; times++) {
			System.out.printf("%d X %d = %2d \n", dan, times, dan*times);
		}
	}
}
//구하고 싶은 단을 입력하세요==>5
//5 X 1 =  5 
//5 X 2 = 10 
//5 X 3 = 15 
//5 X 4 = 20 
//5 X 5 = 25 
//5 X 6 = 30 
//5 X 7 = 35 
//5 X 8 = 40 
//5 X 9 = 45 