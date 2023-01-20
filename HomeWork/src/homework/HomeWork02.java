package homework;

import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		//for문 문제 6
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.printf("☆");
			}
		}
		System.out.println();
	}
}
