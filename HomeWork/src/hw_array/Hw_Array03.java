package hw_array;

import java.util.Scanner;

public class Hw_Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 : ");
		int member = sc.nextInt();
		
		String name[] = new String[member];
		
		for(int i=0;i<member;i++) {
			System.out.println("이름 입력 : ");
			name[i] = sc.next();
		}
		for(int i=0;i<member;i++) {
			System.out.println("이름 : " + name[i]);
		}
	}
}
