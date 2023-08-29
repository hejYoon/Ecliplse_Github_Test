package chapter04.sec02;

//for문과 if문을 활영하여, 1부터 100까지의 숫자중에서 3의 배수값을 출력하고
//3의 배수합도 출력하는 자바 프로그램을 제작하시기 바랍니다.
public class Practice03_for_if_multiple_of_3 {
	public static void main(String[] args) {
		
//		int nice = 0;
//		int sum =0;
//		
//		for (int i = 1; i <= 100; i++) {
//			nice = i % 3;
//			sum += i;
//			if (nice == 0) {
//				System.out.println("3의 배수값은 " +i);
//				System.out.println("--------");
//				System.out.println("3의 배수합은" +sum);
//			}
//		}
		
		
		//선생님 풀이
		//정수형 3의 배수합 변수 thbh를 선언하고 0으로 초기화(초기값 셋팅) 처리 합니다.
		int thbh = 0 ;
		
		//for문으로 1부터 100까지 정수를 반복해서 처리해줍니다.
		for (int i = 1; i <= 100; i++) {
//			System.out.println(i); 1~100 출력해보기 중간중간 sys.out으로 출력하기
			if (i%3 == 0) { //i%3 == 0 i를 3으로 나눴을 때 나머지값이0 = 3의 배수 
				System.out.print(i + ""); //3의배수 출력하기
				thbh += i; //thbh = thbh + i;
			}
		}
		System.out.println("\n 3의 배수 합계 값 =" + thbh);
	}
}
//369121518212427303336394245485154576063666972757881848790939699
//3의 배수 합계 값 =1683
