package hw_array;

import java.util.Scanner;

public class Hw_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �� �Է� : ");
		int space = sc.nextInt();
		
		int arr[] = new int[space];
		
		for(int i=0;i<space;i++) {
			System.out.println((i+1) + "��° �����Է� : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<space;i++) {
			System.out.println(arr[i]);
		}
	}
}
