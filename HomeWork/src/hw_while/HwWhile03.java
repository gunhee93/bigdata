package hw_while;

import java.util.Scanner;

public class HwWhile03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null;
		String num = null;
		int age = 0;
		
		while(true) {
		System.out.println("1. �Է�  ");
		System.out.println("2. ���  ");
		System.out.println("0. ���� ");
		System.out.println("���� : ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("### �Է� ###");
			System.out.println("�̸� : ");
			name = sc.next();
			System.out.println("���� : ");
			age = sc.nextInt();
			System.out.println("��ȭ��ȣ : ");
			num = sc.next();
			break;
		case 2:
			System.out.println("### ��� ###");
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + age);
			System.out.println("��ȭ��ȣ : " + num);
			break;
		case 0:
			System.out.println("==== �� �� ====");
			return;
		default :
			System.out.println("!!!!! ���� !!!!!!");
			}
		}
	}
}
