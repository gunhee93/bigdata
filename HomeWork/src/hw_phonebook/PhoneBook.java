package hw_phonebook;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ��ȭ��ȣ �� : ");
		int phoneBook = sc.nextInt();
		
		String name[] = new String[phoneBook];
		String num[] = new String[phoneBook];
		
		int idx = 0;
		
		while(true) {
			System.out.println("### ��ȭ��ȣ�� ###");
			System.out.println("1. ���");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("5. ��ü����");
			System.out.println("0. ���α׷� ����");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("### ��� ###");
				if(idx == phoneBook) {
					System.out.println("��������� �����մϴ�.");
				} else {
					System.out.print("�̸� �Է� : ");
					name[idx] = sc.next();
					System.out.print("��ȭ��ȣ �Է� :");
					num[idx] = sc.next();
					idx++;
				}				
				break;
			case 2:
				System.out.println("### ���� ###");
				System.out.print("��ϵ� �̸��Է� : ");
				String findName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(findName.equals(name[i])) {
						System.out.println("�̸� : " + name[i]);
						System.out.println("��ȭ��ȣ : " + num[i]);
						break;
					} 
				}
					
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("### ��ü���� ###");
				for(int i=0;i<idx;i++) {
					System.out.println("�̸� : "+name[i]);
					System.out.println("��ȭ��ȣ : "+num[i]);
				}
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
}
