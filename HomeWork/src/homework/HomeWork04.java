package homework;

import java.util.Scanner;

public class HomeWork04 {
	public static void main(String[] args) {
		//for문 문제 8
		Scanner sc = new Scanner(System.in);
		
		System.out.println("별 입력 : ");
		int star = sc.nextInt();
		int sum = star;
		for(int i=0;i<star;i++) {
			System.out.println();
			for(int j=0;j<sum;j++) {
				System.out.print("☆");
			}
			sum--;
		}
	}
}
