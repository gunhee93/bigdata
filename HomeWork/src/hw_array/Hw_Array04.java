package hw_array;

import java.util.Scanner;

public class Hw_Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �Է� : ");
		int people = sc.nextInt();
		
		String name[] = new String[people];
		int kor[] = new int[people];
		int eng[] = new int[people];
		int math[] = new int[people];
		int sum[] = new int[people];
		double avg[] = new double[people];
		
		for(int i=0;i<people;i++) {
		
		System.out.print("�̸��Է� : ");
		name[i] = sc.next();
		System.out.print("�������� �Է� :");
		kor[i] = sc.nextInt();
		System.out.println("�������� �Է� : ");
		eng[i] = sc.nextInt();
		System.out.println("�������� �Է�");
		math[i] = sc.nextInt();
		
		sum[i] = kor[i] + eng[i] + math[i] ;
		avg[i] = sum[i] / 3.0 ;
		}
		System.out.println("\n");
		
		System.out.println("�̸�\t����\t���");
		for(int i=0;i<people;i++) {
			System.out.printf("%s\t%d\t%.2f\n", name[i], sum[i], avg[i]);			
		}
	}
}
