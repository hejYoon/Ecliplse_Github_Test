import java.util.Scanner;

//Q7. for문을 사용하여, 1부터 Scanner 클래스 활용 입력값(예시 : 20)까지
//     양의 정수 중에서 다음의 실행 결과와 같이
//     3의 배수만 출력하는 자바 프로그램을 제작해 봅니다.
//     실행 결과 : 3 6 9 12 15 18

public class Coding_Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계산할 정수를 입력하세요 =>");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 3 ==0) {
				int sum = i;
				System.out.print(sum+","); //3,6,9,12,15,18,
			}
		}
		
		//선생님 풀이
		Scanner scan2 = new Scanner(System.in);
		System.out.print("3의 배수값 알고싶은 입력값을 입력해 주세요 =>");
		int inputInt = scan2.nextInt();
		
		for (int i = 1; i <= inputInt; i++) {
			if (i %3 !=0) {  //만약(if) 3의 배수값이 아닌경우( i % 3 != 0 )에는
				continue;	//continue문을 활용햇거 건너띄기 (제외하기) 계속 이어서 처리합니다.
			}
			System.out.print(i+","); //3,6,9,12,15,18,
		}


	}
}










