package hw_phonebook;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 전화번호 수 : ");
		int phoneBook = sc.nextInt();
		
		String name[] = new String[phoneBook];
		String num[] = new String[phoneBook];
		
		int idx = 0;
		
		while(true) {
			System.out.println("### 전화번호부 ###");
			System.out.println("1. 등록");
			System.out.println("2. 보기");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 전체보기");
			System.out.println("0. 프로그램 종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("### 등록 ###");
				if(idx == phoneBook) {
					System.out.println("저장공간이 부족합니다.");
				} else {
					System.out.print("이름 입력 : ");
					name[idx] = sc.next();
					System.out.print("전화번호 입력 :");
					num[idx] = sc.next();
					idx++;
				}				
				break;
			case 2:
				System.out.println("### 보기 ###");
				System.out.print("등록된 이름입력 : ");
				String findName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(findName.equals(name[i])) {
						System.out.println("이름 : " + name[i]);
						System.out.println("전화번호 : " + num[i]);
						break;
					} 
				}
					
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("### 전체보기 ###");
				for(int i=0;i<idx;i++) {
					System.out.println("이름 : "+name[i]);
					System.out.println("전화번호 : "+num[i]);
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
