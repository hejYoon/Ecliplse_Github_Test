package chapter04.sec02;

import java.util.Scanner;

//수험생의 이름(변수명:name), 영어점수(변수명:eng), 면접점수(변수명:itv) 입력 받아서
//이 때, 영어점수가 70이상이고, 면접점수가70점 이상이고,
//평균점수(변수명:avg)가 80점 이상이면 합격 메시지를 화면으로 출력하고,
//그렇지 않을 경우, 불합격 메시지를 화면으로 출력하는 차바 프로그램을 소스 코딩
//난이도 D...

public class Practice01_Question_If_else_Average {
	public static void main(String[] args) {
//		Scanner scan1 = new Scanner(System.in);
//		System.out.print("이름을 입력하세요:");
//		String name = scan1.next();
//
//		Scanner scan2 = new Scanner(System.in);
//		System.out.print("영어점수를 입력하세요:");
//		int eng = scan2.nextInt();
//		
//		Scanner scan3 = new Scanner(System.in);
//		System.out.print("면접점수를 입력하세요:");
//		int itv = scan3.nextInt();
//		
//		int avg = (eng + itv)/2 ;
//		System.out.println("평균점수는 " + avg + "입니다");
//		
//		if ((eng >= 70)&(itv >= 70)& (avg >= 80)) {
//			System.out.println("합격입니다!");
//		}else {
//			System.out.println("불합격입니다!");
//		}
		
		
		//선생님 풀이
		Scanner scan = new Scanner(System.in);
		System.out.print("수험생의 이름을 입력해주세요 =>");
		String name = scan.next();
		
		System.out.print("수험생" + name + "님의 영어점수를 입력해주세요==>");
		int eng = scan.nextInt();

		System.out.print("수험생" + name + "님의 면접점수를 입력해주세요==>");
		int itv = scan.nextInt();
		
		double avg = (eng + itv)/ 2.00;
		if ((eng >= 70)&&(itv >= 70)&&(avg>=80.00)) {
			System.out.println("수험생" + name + "님은" + avg + "점으로 합격하셨습니다!");
		}else {
			System.out.println("수험생" + name + "님은" + avg + "점으로 불합격하셨습니다!");			
		}
	}
}

//실행결과
//수험생의 이름을 입력해주세요 =>장나라
//수험생장나라님의 영어점수를 입력해주세요==>70
//수험생장나라님의 면접점수를 입력해주세요==>80
//수험생장나라님은75.0점으로 불합격하셨습니다!
