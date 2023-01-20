package hw_while;

import java.util.Scanner;

public class HwWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math = 0;
		boolean b = false;
		do {
			if(b) {
				System.out.println("범위안의 점수를 입력해주세요.");			
			}
			System.out.println("국어 : ");
			kor = sc.nextInt();
			b = true;
		} while(kor<0 || kor >100);
		
		b = false;
		
		do {
			if(b) {
				System.out.println("범위안의 점수를 입력해주세요.");			
			}
			System.out.println("영어 : ");
			eng = sc.nextInt();
			b = true;
		} while(eng<0 || eng >100);
		
		b = false;
		
		do {
			if(b) {
				System.out.println("범위안의 점수를 입력해주세요.");			
			}
			System.out.println("수학 : ");
			math = sc.nextInt();
			b = true;
		}while(math<0 || math >100);
		
		b = false;
		
		int cnt = kor + eng + math;
		System.out.println("총합점 : " + cnt);
		System.out.println("평균점 : " + (cnt)/3.0);
	}
}
