package hw_program;

import java.util.Scanner;

public class HwProgram02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int cnt = 0;
		double sum = 0;
		char grade = ' ';

		while(true) {

			System.out.println("====성적표 출력기====");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("0. 프로그램 종료");

			System.out.println("숫자 입력 : ");
			int input = sc.nextInt();

			switch(input) {
			case 1:
				System.out.println("====성적 입력====");
				System.out.println("이름 입력 : ");
				name = sc.next();
				boolean a = false;
				do {
					if(a) {
						System.out.println("국어점수를 잘못 입력하였습니다.");
					}
					System.out.println("국어 점수 : ");
					kor = sc.nextInt();
					a=true;
				}while(kor>100 || kor<0);
				a = false;
				do {
					if(a) {				
						System.out.println("영어점수를 잘못 입력하였습니다.");
					}
					System.out.println("영어 점수 : ");
					eng = sc.nextInt();
					a = true;
				}while(eng>100 || eng<0);
				a = false;
				do {
					if(a) {
						System.out.println("수학점수를 잘못 입력하였습니다.");
					}
					System.out.println("수학 점수 : ");
					math = sc.nextInt();
					a = true;
				}while(math>100 || math<0);
				
					break;
				case 2:
					if(name==null) {
						System.out.println("입력된 데이터가 없습니다.");
					} else {
					cnt = kor + eng + math;
					sum = cnt / 3.0;
					System.out.println("====성적 출력====");

					if(sum>=90) {
						grade = 'A';
					} else if(sum>=80) {
						grade = 'B';
					} else if(sum>=70) {
						grade = 'C';
					} else if(sum>=60) {
						grade = 'D';
					} else {
						grade = 'F';
					}
					System.out.println("이름 \t총점\t평균\t학점");
					System.out.printf("%s\t%d\t%.2f\t%c\n", name, cnt, sum, grade);
					}
					break;
				case 3:
					sub:while(true) {
					System.out.println("====성적 수정====");
					System.out.println("1. 국어 점수 수정 : ");
					System.out.println("2. 영어 점수 수정 : ");
					System.out.println("3. 수학 점수 수정 : ");
					System.out.println("0. 메뉴로 돌아가기");
					System.out.println("숫자 입력 : ");
					int menu = sc.nextInt();
					
					switch(menu) {
					case 1:
						do {
						System.out.println("국어 점수 입력 : ");
						kor = sc.nextInt();
						}while(kor>100 || kor<0);
						break;
					case 2:
						do {
						System.out.println("영어 점수 입력 : ");
						eng = sc.nextInt();
						}while(eng>100 || eng<0);
						break;
					case 3:
						do {
						System.out.println("수학 점수 입력 : ");
						math = sc.nextInt();
						}while(math>100 || math<0);
						break;
					case 0:
						System.out.println("메뉴로 돌아갑니다.");
						break sub;
					default:
						System.out.println("잘못 입력하셨습니다.");
						}
					}
					break;
				case 4:
					System.out.println("====성적 삭제====");
					System.out.println("성적이 삭제되었습니다.");
					name = null;
					kor=0;
					eng=0;
					math=0;
					break;
				case 0:
					System.out.println("====프로그램 종료====");
					return;
				default :
					System.out.println("잘못 입력하셨습니다.");
				}
				System.out.println();
			}
		}
	}
