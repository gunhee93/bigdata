package hw_while;

import java.util.Scanner;

public class HwWhile04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			int cnt = 0;
			int sum = 0;
			
			while(num!=0) {
				sum += num%10;
				num /= 10;
				cnt++;
			}
			
			System.out.println("�ڸ��� : " + cnt);
			System.out.println("���ϸ� :" + sum);
		}
	}
}
