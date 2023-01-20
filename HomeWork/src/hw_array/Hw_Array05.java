package hw_array;

import java.util.Scanner;

public class Hw_Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("호텔 이름 입력 : ");
		String hotelName = sc.next();
		
		System.out.print("객실 수 입력 : ");
		int roomNum = sc.nextInt();
		
		boolean room[] = new boolean[roomNum];
		
		while(true) {
		System.out.println(hotelName + " 호텔");
		System.out.println("1. 입실");
		System.out.println("2. 퇴실");
		System.out.println("3. 방정보(입/퇴실정보)");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("입력 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("입실하기");
			System.out.println("1~"+roomNum+"번 방중 선택");
			System.out.print("입실할 방 번호 입력 : ");
			int chekIn = sc.nextInt();
			if(room[chekIn-1]) {
				System.out.println("먼저 입실한 투숙객이 있습니다");
			} else {
				System.out.println("입실 처리되었습니다.");
				room[chekIn-1] = true;
			}
			break;
		case 2:
			System.out.println("퇴실하기");
			System.out.println("1~"+roomNum+"번 방중 선택");
			System.out.print("퇴실 할 방 번호 입력 : ");
			int chekOut = sc.nextInt();
			if(room[chekOut-1]) {
				System.out.println("최실 처리가 완료되었습니다");
				room[chekOut-1] = false;
			} else {
				System.out.println("이미 퇴실처리 되어있는 방입니다.");
			}
			
			break;
		case 3:
			System.out.println(" 객 실 정 보 ");
			for(int i=0;i<roomNum;i++) {
				if(room[i]) {
					System.out.println((i+1)+"번 방 상태 : 입실 상태");
				} else { 
					System.out.println((i+1)+"번 방 상태 : 퇴실 상태");
				}
			}
			break;
		case 0:
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
			System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
