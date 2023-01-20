package hw_array;

import java.util.Scanner;

public class Hw_array02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("저장공간 : ");
		int space = sc.nextInt();
		
		int arr[] = new int[space];
		
		for(int i=0;i<space;i++) {
			System.out.println((i+1)+"번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<space;i++) {
			System.out.println(arr[i]);
		}
	}
}
