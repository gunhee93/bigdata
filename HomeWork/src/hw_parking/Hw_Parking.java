package hw_parking;

import java.util.Scanner;

public class Hw_Parking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("주차공간 : ");
		int parkAir = sc.nextInt();

		int parking[] = new int[parkAir];


		while(true) {
			System.out.println("== 건희네 주차장 ==");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 주차현황");
			System.out.println("0. 프로그램 종료");
			System.out.println("선택 : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				System.out.println("입 차");
				System.out.println("1 ~ " + parkAir + "중 선택");
				System.out.println("주차장 번호 입력 : ");
				int carAir = sc.nextInt();

				if(carAir > parkAir || carAir<1) {
					System.out.println("주자장 번호가 아닙니다.");
				} else if(parking[carAir-1] == 0) {
					do {
						System.out.println("차량 번호 입력 : ");
						parking[carAir-1] = sc.nextInt();
					}while(parking[carAir-1] > 9999 || parking[carAir-1] < 1000);
					System.out.println("주차가 완료되었습니다");
				} else {
					System.out.println("이미 주차된 차량이 있습니다.");
				}
				break;
			case 2:
				System.out.println("출 차");
				System.out.println("차량번호 입력 : ");
				int carOut = sc.nextInt();

				boolean check = true;
				for(int i=0;i<parkAir;i++) {
					if(carOut == parking[i]) {
						System.out.println(carOut + "번 차량을 출차합니다");
						parking[i] = 0;
						System.out.println("출차되었습니다.");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("해당차량은 없습니다.");
				}
				break;
			case 3:
				System.out.println(" 주 차 현 황 ");
				for(int i=0;i<parking.length;i++) {
					if(parking[i] != 0) {
						System.out.println((i+1) + "번째 자리 : " + parking[i]);
					} else {
						System.out.println((i+1) + "번째 자리 : 주차가능");
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
