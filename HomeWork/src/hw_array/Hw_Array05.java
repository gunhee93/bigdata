package hw_array;

import java.util.Scanner;

public class Hw_Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ȣ�� �̸� �Է� : ");
		String hotelName = sc.next();
		
		System.out.print("���� �� �Է� : ");
		int roomNum = sc.nextInt();
		
		boolean room[] = new boolean[roomNum];
		
		while(true) {
		System.out.println(hotelName + " ȣ��");
		System.out.println("1. �Խ�");
		System.out.println("2. ���");
		System.out.println("3. ������(��/�������)");
		System.out.println("0. ���α׷� ����");
		
		System.out.print("�Է� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("�Խ��ϱ�");
			System.out.println("1~"+roomNum+"�� ���� ����");
			System.out.print("�Խ��� �� ��ȣ �Է� : ");
			int chekIn = sc.nextInt();
			if(room[chekIn-1]) {
				System.out.println("���� �Խ��� �������� �ֽ��ϴ�");
			} else {
				System.out.println("�Խ� ó���Ǿ����ϴ�.");
				room[chekIn-1] = true;
			}
			break;
		case 2:
			System.out.println("����ϱ�");
			System.out.println("1~"+roomNum+"�� ���� ����");
			System.out.print("��� �� �� ��ȣ �Է� : ");
			int chekOut = sc.nextInt();
			if(room[chekOut-1]) {
				System.out.println("�ֽ� ó���� �Ϸ�Ǿ����ϴ�");
				room[chekOut-1] = false;
			} else {
				System.out.println("�̹� ���ó�� �Ǿ��ִ� ���Դϴ�.");
			}
			
			break;
		case 3:
			System.out.println(" �� �� �� �� ");
			for(int i=0;i<roomNum;i++) {
				if(room[i]) {
					System.out.println((i+1)+"�� �� ���� : �Խ� ����");
				} else { 
					System.out.println((i+1)+"�� �� ���� : ��� ����");
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
