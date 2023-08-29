
//다음의 [실행 결과값]과 같이 출력되도록
//if문과 break, continue, for문을 이용해서
//자바 프로그램을 제작하시기 바랍니다.
//
//[실행 결과값]
//0, 2, 4, 6, 8, 10

public class Coding_Test08 {

	public static void main(String[] args) {


		for (int i = 0; ; i++) { //i <=10이라는 조건을 생략
			if (i %2 == 1) { //만약에 홀수일경우 (i%2==1)
				continue; //건너띄고(제외하고)다시 for문으로 이어서 처리
			}
			if (i > 10) { //만약에 if i값이 10을 넘어간다면
				break; //break문으로 처리를 중지합니다.
			}
			System.out.print(i + "");
		}
	
	}
}
