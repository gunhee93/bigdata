package hw_while;

import java.util.Scanner;

public class HwWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math = 0;
		boolean b = false;
		do {
			if(b) {
				System.out.println("�������� ������ �Է����ּ���.");			
			}
			System.out.println("���� : ");
			kor = sc.nextInt();
			b = true;
		} while(kor<0 || kor >100);
		
		b = false;
		
		do {
			if(b) {
				System.out.println("�������� ������ �Է����ּ���.");			
			}
			System.out.println("���� : ");
			eng = sc.nextInt();
			b = true;
		} while(eng<0 || eng >100);
		
		b = false;
		
		do {
			if(b) {
				System.out.println("�������� ������ �Է����ּ���.");			
			}
			System.out.println("���� : ");
			math = sc.nextInt();
			b = true;
		}while(math<0 || math >100);
		
		b = false;
		
		int cnt = kor + eng + math;
		System.out.println("������ : " + cnt);
		System.out.println("����� : " + (cnt)/3.0);
	}
}
