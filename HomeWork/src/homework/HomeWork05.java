package homework;

import java.util.Scanner;

public class HomeWork05 {
	public static void main(String[] args) {
		//for�� ���� 9
		Scanner sc = new Scanner(System.in);
		String name = null;
		String num = null;
		int age = 0;
		
		for(;;) {
		System.out.println("1. �Է�");
		System.out.println("2. ���");
		System.out.println("0. ����");
		System.out.println("���� : ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(" ### �Է� ### ");
			System.out.println("�̸� : ");
			name = sc.next();
			System.out.println("���� : ");
			age = sc.nextInt();
			System.out.println("��ȭ��ȣ : ");
			num = sc.next();
			break;
		case 2:
			System.out.println(" ### ��� ### ");
			System.out.println("�̸� : " + name);
			System.out.println("���� : "+ age);
			System.out.println("��ȭ��ȣ : " + num);
			break;
		case 0:
			System.out.println(" ==== ���� ==== ");
			return;
		default :
			System.out.println("�Է¿����Դϴ�.");
			}
		System.out.println();
		}
	}
}
