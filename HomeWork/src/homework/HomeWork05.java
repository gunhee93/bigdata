package homework;

import java.util.Scanner;

public class HomeWork05 {
	public static void main(String[] args) {
		//for문 문제 9
		Scanner sc = new Scanner(System.in);
		String name = null;
		String num = null;
		int age = 0;
		
		for(;;) {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 종료");
		System.out.println("선택 : ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(" ### 입력 ### ");
			System.out.println("이름 : ");
			name = sc.next();
			System.out.println("나이 : ");
			age = sc.nextInt();
			System.out.println("전화번호 : ");
			num = sc.next();
			break;
		case 2:
			System.out.println(" ### 출력 ### ");
			System.out.println("이름 : " + name);
			System.out.println("나이 : "+ age);
			System.out.println("전화번호 : " + num);
			break;
		case 0:
			System.out.println(" ==== 종료 ==== ");
			return;
		default :
			System.out.println("입력오류입니다.");
			}
		System.out.println();
		}
	}
}
