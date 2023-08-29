package chapter04.sec02;

import java.util.Scanner;

//사용자의 이름(변수명 : name), 아이디(변수명 : id), 비밀번호(변수명 : pwd)를 입력 받고, 
//id가 jangnara이고, 비밀번호가 1234이면, 사용자 이름의 환영 메시지를 표현하고,
//그렇지 않을 경우, "아이디 혹은 비밀번호가 정확하지 않습니다!"라는 메시지가 나타나도록
//자바 프로그램을 코딩하시기 바랍니다.
public class Practice02_Question_if_else_ID_Pwd {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("회원님의 성함을 입력해 주세요 ==>");
//		String name1 = scan.next();
//		
//		System.out.print(name1 +"님의 아이디를 입력해 주세요 ==>");
//		String id = scan.next();
//
//		System.out.print(name1 +"님의 비밀번호 4자리를 입력해 주세요 ==>");
//		int pwd = scan.nextInt();
//		
//		if ((id.equals("jangnara"))&&(pwd == 1234)) {
//			System.out.println(name1 +"님의 방문을 환영합니다!");
//		}else {
//			System.out.println("아이디 혹은 비밀번호가 정확하지 않습니다!");			
//		}
		
		//선생님풀이
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자의 이름을 입력해 주시기 바랍니다 ==>");
		String name = scan.next();
		System.out.print("사용자의 아이디를 입력해 주시기 바랍니다 ==>");
		String id = scan.next();
		System.out.print("사용자의 비밀번호를 입력해 주시기 바랍니다 ==>");
		String pwd = scan.next();
		
		if (id.equals("jangnara")&&pwd.equals("1234")) {
			System.out.println(name + "님 환영합니다!");
		}else {
			System.out.println("아이디 혹은 비밀번호가 정확하지 않습니다!");			
		}
	}
	//사용자의 이름을 입력해 주시기 바랍니다 ==>장나라
//	사용자의 아이디를 입력해 주시기 바랍니다 ==>jangnara
//			사용자의 비밀번호를 입력해 주시기 바랍니다 ==>1234
//			장나라님 환영합니다!
}

