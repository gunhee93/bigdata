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

			System.out.println("====����ǥ ��±�====");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("0. ���α׷� ����");

			System.out.println("���� �Է� : ");
			int input = sc.nextInt();

			switch(input) {
			case 1:
				System.out.println("====���� �Է�====");
				System.out.println("�̸� �Է� : ");
				name = sc.next();
				boolean a = false;
				do {
					if(a) {
						System.out.println("���������� �߸� �Է��Ͽ����ϴ�.");
					}
					System.out.println("���� ���� : ");
					kor = sc.nextInt();
					a=true;
				}while(kor>100 || kor<0);
				a = false;
				do {
					if(a) {				
						System.out.println("���������� �߸� �Է��Ͽ����ϴ�.");
					}
					System.out.println("���� ���� : ");
					eng = sc.nextInt();
					a = true;
				}while(eng>100 || eng<0);
				a = false;
				do {
					if(a) {
						System.out.println("���������� �߸� �Է��Ͽ����ϴ�.");
					}
					System.out.println("���� ���� : ");
					math = sc.nextInt();
					a = true;
				}while(math>100 || math<0);
				
					break;
				case 2:
					if(name==null) {
						System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
					} else {
					cnt = kor + eng + math;
					sum = cnt / 3.0;
					System.out.println("====���� ���====");

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
					System.out.println("�̸� \t����\t���\t����");
					System.out.printf("%s\t%d\t%.2f\t%c\n", name, cnt, sum, grade);
					}
					break;
				case 3:
					sub:while(true) {
					System.out.println("====���� ����====");
					System.out.println("1. ���� ���� ���� : ");
					System.out.println("2. ���� ���� ���� : ");
					System.out.println("3. ���� ���� ���� : ");
					System.out.println("0. �޴��� ���ư���");
					System.out.println("���� �Է� : ");
					int menu = sc.nextInt();
					
					switch(menu) {
					case 1:
						do {
						System.out.println("���� ���� �Է� : ");
						kor = sc.nextInt();
						}while(kor>100 || kor<0);
						break;
					case 2:
						do {
						System.out.println("���� ���� �Է� : ");
						eng = sc.nextInt();
						}while(eng>100 || eng<0);
						break;
					case 3:
						do {
						System.out.println("���� ���� �Է� : ");
						math = sc.nextInt();
						}while(math>100 || math<0);
						break;
					case 0:
						System.out.println("�޴��� ���ư��ϴ�.");
						break sub;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
					break;
				case 4:
					System.out.println("====���� ����====");
					System.out.println("������ �����Ǿ����ϴ�.");
					name = null;
					kor=0;
					eng=0;
					math=0;
					break;
				case 0:
					System.out.println("====���α׷� ����====");
					return;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				System.out.println();
			}
		}
	}
