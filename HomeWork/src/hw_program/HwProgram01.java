package hw_program;

import java.util.Scanner;

public class HwProgram01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int milk = 500;
		int sugar = 400;
		int black = 300;
		int cocoa = 350;

		int milkAcc = 3;
		int sugarAcc = 3;
		int blackAcc = 3;
		int cocoaAcc = 3;
		
		while(true) {

			System.out.println("==== 자판기 메뉴 ====");
			System.out.println("1. 밀크커피 ");
			System.out.println("2. 설탕커피 ");
			System.out.println("3. 블랙커피 ");
			System.out.println("4. 코코아");

			int coin = 0;
			boolean a = false;
			do {
				if(a) {
					System.out.println("잔액 : " + coin);
					System.out.println("잔액이 부족합니다.\n");
					
//					System.out.println("1. 잔액 반환");
//					System.out.println("2. 추가 금액 투입");
//					System.out.println("번호입력 : ");
//					
//					int menu = sc.nextInt();
				}
				

				System.out.println("\n요금 투입 : ");
				coin += sc.nextInt();

				a = true;
			}while(coin<300);

			while(coin != 0) { //coin이 0원이 아니면 다시 요금투입을 하지 않고 메뉴선택으로 바로 넘어간다.

				System.out.println("==== 자판기 메뉴 ====");
				if(coin>=500 && milkAcc>0) {
					System.out.println("1. 밀크커피 ");
				} else if(coin>=500 && milkAcc==0){
					System.out.println("1. sold out");
				}
				if(coin>=400 && sugarAcc>0) {
					System.out.println("2. 설탕커피 ");
				} else if(coin>=400 && sugarAcc==0){
					System.out.println("2. sold out");
				}
				if(coin>=300 && blackAcc>0) {
					System.out.println("3. 블랙커피 ");
				} else if(coin>=300 && blackAcc==0) {
					System.out.println("3. sold out");
				}
				if(coin>=350 && cocoaAcc>0) {
					System.out.println("4. 코코아");
				} else if(coin>=350 && cocoaAcc==0) {
					System.out.println("4. sold out");
				}
				if(coin<300 && coin>0) {
					System.out.println("\n금액이 부족합니다.\n");
				}
				if(coin>0) {
					System.out.println("5. 잔돈 반환");
				}
					System.out.println("6. 추가 요금 투입");
				
			
				System.out.println("\n메뉴 선택(숫자입력) : ");
				int select = sc.nextInt();

				switch(select) {

				case 1:
					if(coin<500) {
						System.out.println("금액이 부족합니다.");
					} else {
						System.out.println("밀크커피가 준비되었습니다.");
						coin -= milk;
						milkAcc--;
						System.out.println("남은 밀크커피 : " + milkAcc);
					}
					break;
				case 2:
					if(coin<400) {
						System.out.println("금액이 부족합니다.");
					} else {
						System.out.println("설탕커피가 준비되었습니다.");
						coin -= sugar;
						sugarAcc--;
						System.out.println("남은 설탕커피 : " + sugarAcc);
					}
					break;
				case 3:
					if(coin<300) {
						System.out.println("금액이 부족합니다.");
					} else {
						System.out.println("블랙커피가 준비되었습니다.");
						coin -= black;
						blackAcc--;
						System.out.println("남은 블랙커피 : " + blackAcc);
					}
					break;
				case 4:
					if(coin<350) {
						System.out.println("금액이 부족합니다.");
					} else {
						System.out.println("코코아가 준비되었습니다.");
						coin -= cocoa;
						cocoaAcc--;
						System.out.println("남은 코코아 : " + cocoaAcc);
					}
					break;
				case 5:
					System.out.println("잔돈을 받으세요.");
					coin = 0;
					break;
				case 6:
					System.out.println("추가할 금액 : ");
					coin += sc.nextInt();
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
				}
				System.out.println("\n잔액 : " + coin);
				System.out.println();
			}
		}
	}
}

