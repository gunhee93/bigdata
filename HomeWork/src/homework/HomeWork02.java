package homework;

import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		//for�� ���� 6
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.printf("��");
			}
		}
		System.out.println();
	}
}
