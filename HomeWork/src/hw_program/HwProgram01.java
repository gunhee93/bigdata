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

			System.out.println("==== ���Ǳ� �޴� ====");
			System.out.println("1. ��ũĿ�� ");
			System.out.println("2. ����Ŀ�� ");
			System.out.println("3. ��Ŀ�� ");
			System.out.println("4. ���ھ�");

			int coin = 0;
			boolean a = false;
			do {
				if(a) {
					System.out.println("�ܾ� : " + coin);
					System.out.println("�ܾ��� �����մϴ�.\n");
					
//					System.out.println("1. �ܾ� ��ȯ");
//					System.out.println("2. �߰� �ݾ� ����");
//					System.out.println("��ȣ�Է� : ");
//					
//					int menu = sc.nextInt();
				}
				

				System.out.println("\n��� ���� : ");
				coin += sc.nextInt();

				a = true;
			}while(coin<300);

			while(coin != 0) { //coin�� 0���� �ƴϸ� �ٽ� ��������� ���� �ʰ� �޴��������� �ٷ� �Ѿ��.

				System.out.println("==== ���Ǳ� �޴� ====");
				if(coin>=500 && milkAcc>0) {
					System.out.println("1. ��ũĿ�� ");
				} else if(coin>=500 && milkAcc==0){
					System.out.println("1. sold out");
				}
				if(coin>=400 && sugarAcc>0) {
					System.out.println("2. ����Ŀ�� ");
				} else if(coin>=400 && sugarAcc==0){
					System.out.println("2. sold out");
				}
				if(coin>=300 && blackAcc>0) {
					System.out.println("3. ��Ŀ�� ");
				} else if(coin>=300 && blackAcc==0) {
					System.out.println("3. sold out");
				}
				if(coin>=350 && cocoaAcc>0) {
					System.out.println("4. ���ھ�");
				} else if(coin>=350 && cocoaAcc==0) {
					System.out.println("4. sold out");
				}
				if(coin<300 && coin>0) {
					System.out.println("\n�ݾ��� �����մϴ�.\n");
				}
				if(coin>0) {
					System.out.println("5. �ܵ� ��ȯ");
				}
					System.out.println("6. �߰� ��� ����");
				
			
				System.out.println("\n�޴� ����(�����Է�) : ");
				int select = sc.nextInt();

				switch(select) {

				case 1:
					if(coin<500) {
						System.out.println("�ݾ��� �����մϴ�.");
					} else {
						System.out.println("��ũĿ�ǰ� �غ�Ǿ����ϴ�.");
						coin -= milk;
						milkAcc--;
						System.out.println("���� ��ũĿ�� : " + milkAcc);
					}
					break;
				case 2:
					if(coin<400) {
						System.out.println("�ݾ��� �����մϴ�.");
					} else {
						System.out.println("����Ŀ�ǰ� �غ�Ǿ����ϴ�.");
						coin -= sugar;
						sugarAcc--;
						System.out.println("���� ����Ŀ�� : " + sugarAcc);
					}
					break;
				case 3:
					if(coin<300) {
						System.out.println("�ݾ��� �����մϴ�.");
					} else {
						System.out.println("��Ŀ�ǰ� �غ�Ǿ����ϴ�.");
						coin -= black;
						blackAcc--;
						System.out.println("���� ��Ŀ�� : " + blackAcc);
					}
					break;
				case 4:
					if(coin<350) {
						System.out.println("�ݾ��� �����մϴ�.");
					} else {
						System.out.println("���ھư� �غ�Ǿ����ϴ�.");
						coin -= cocoa;
						cocoaAcc--;
						System.out.println("���� ���ھ� : " + cocoaAcc);
					}
					break;
				case 5:
					System.out.println("�ܵ��� ��������.");
					coin = 0;
					break;
				case 6:
					System.out.println("�߰��� �ݾ� : ");
					coin += sc.nextInt();
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				System.out.println("\n�ܾ� : " + coin);
				System.out.println();
			}
		}
	}
}

