package hw_array;

import java.util.Scanner;

public class Hw_Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο� �� : ");
		int member = sc.nextInt();
		
		String name[] = new String[member];
		
		for(int i=0;i<member;i++) {
			System.out.println("�̸� �Է� : ");
			name[i] = sc.next();
		}
		for(int i=0;i<member;i++) {
			System.out.println("�̸� : " + name[i]);
		}
	}
}
