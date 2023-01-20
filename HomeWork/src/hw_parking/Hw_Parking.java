package hw_parking;

import java.util.Scanner;

public class Hw_Parking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� : ");
		int parkAir = sc.nextInt();

		int parking[] = new int[parkAir];


		while(true) {
			System.out.println("== ����� ������ ==");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ������Ȳ");
			System.out.println("0. ���α׷� ����");
			System.out.println("���� : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				System.out.println("�� ��");
				System.out.println("1 ~ " + parkAir + "�� ����");
				System.out.println("������ ��ȣ �Է� : ");
				int carAir = sc.nextInt();

				if(carAir > parkAir || carAir<1) {
					System.out.println("������ ��ȣ�� �ƴմϴ�.");
				} else if(parking[carAir-1] == 0) {
					do {
						System.out.println("���� ��ȣ �Է� : ");
						parking[carAir-1] = sc.nextInt();
					}while(parking[carAir-1] > 9999 || parking[carAir-1] < 1000);
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
				} else {
					System.out.println("�̹� ������ ������ �ֽ��ϴ�.");
				}
				break;
			case 2:
				System.out.println("�� ��");
				System.out.println("������ȣ �Է� : ");
				int carOut = sc.nextInt();

				boolean check = true;
				for(int i=0;i<parkAir;i++) {
					if(carOut == parking[i]) {
						System.out.println(carOut + "�� ������ �����մϴ�");
						parking[i] = 0;
						System.out.println("�����Ǿ����ϴ�.");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("�ش������� �����ϴ�.");
				}
				break;
			case 3:
				System.out.println(" �� �� �� Ȳ ");
				for(int i=0;i<parking.length;i++) {
					if(parking[i] != 0) {
						System.out.println((i+1) + "��° �ڸ� : " + parking[i]);
					} else {
						System.out.println((i+1) + "��° �ڸ� : ��������");
					}
				}
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
