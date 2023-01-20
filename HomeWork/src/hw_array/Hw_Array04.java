package hw_array;

import java.util.Scanner;

public class Hw_Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 입력 : ");
		int people = sc.nextInt();
		
		String name[] = new String[people];
		int kor[] = new int[people];
		int eng[] = new int[people];
		int math[] = new int[people];
		int sum[] = new int[people];
		double avg[] = new double[people];
		
		for(int i=0;i<people;i++) {
		
		System.out.print("이름입력 : ");
		name[i] = sc.next();
		System.out.print("국어점수 입력 :");
		kor[i] = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		eng[i] = sc.nextInt();
		System.out.println("수학점수 입력");
		math[i] = sc.nextInt();
		
		sum[i] = kor[i] + eng[i] + math[i] ;
		avg[i] = sum[i] / 3.0 ;
		}
		System.out.println("\n");
		
		System.out.println("이름\t총점\t평균");
		for(int i=0;i<people;i++) {
			System.out.printf("%s\t%d\t%.2f\n", name[i], sum[i], avg[i]);			
		}
	}
}
