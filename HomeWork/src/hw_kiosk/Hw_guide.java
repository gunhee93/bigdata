package hw_kiosk;

import java.util.Scanner;

public class Hw_guide {
	public static void main(String[] args) {
		// �Է� ��ü ����
		Scanner sc = new Scanner(System.in);

		// �� �ܹ��� ����
		int chicken = 4500;
		int shrimp = 4000;
		int bulgogi = 3500;
		// �� ���� ����
		int cola = 2000;
		int sider = 2000;
		int coffee = 1500;
		// �����ݾ��� �����ϴ� ����
		int sum = 0;
		// ������ �����ϴ� ����
		int chAcc = 0;
		int shAcc = 0;
		int bulAcc = 0;
		int coAcc = 0;
		int siAcc = 0;
		int ffAcc = 0;

		// ������ ��й�ȣ ���� ����
		int adminPass = 1234;

		// �� �Ǹ� ������ ���� ����
		int chickenAll = 0;
		int shrimpAll = 0;
		int bulgogiAll = 0;
		int colaAll = 0;
		int siderAll = 0;
		int coffeeAll = 0;
		
		while(true) {
			System.out.println("####################");
			System.out.println("##### ������ �ܹ��� #####");
			System.out.println("####################");
			System.out.println();
			if(chAcc > 0) {
				System.out.println("ġŲ���� : " + chAcc);
			}
			if(shAcc > 0) {
				System.out.println("������� : " + shAcc);
			}
			if(bulAcc > 0) {
				System.out.println("�Ұ����� : " + bulAcc);
			}
			if(coAcc > 0) {
				System.out.println("�ݶ� : " + coAcc);
			}
			if(siAcc > 0) {
				System.out.println("���̴� : " + siAcc);
			}
			if(ffAcc > 0) {
				System.out.println("Ŀ�� : " + ffAcc);
			}
			System.out.println();
			System.out.println("1. �ܹ���");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ��ü���");
			System.out.print("���� : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				boolean burger = true;
				while(burger) {
					System.out.println();
					if(chAcc > 0) {
						System.out.println("ġŲ���� : " + chAcc);
					}
					if(shAcc > 0) {
						System.out.println("������� : " + shAcc);
					}
					if(bulAcc > 0) {
						System.out.println("�Ұ����� : " + bulAcc);
					}
					if(coAcc > 0) {
						System.out.println("�ݶ� : " + coAcc);
					}
					if(siAcc > 0) {
						System.out.println("���̴� : " + siAcc);
					}
					if(ffAcc > 0) {
						System.out.println("Ŀ�� : " + ffAcc);
					}
					System.out.println("\n###### �ܹ��� #####");
					System.out.println("1. ġŲ����");
					System.out.println("2. �������");
					System.out.println("3. �Ұ�����");
					System.out.println("4. �ܹ��� ���� ���");
					System.out.println("5. �޴��� �̵�");
					System.out.print("���� : ");
					int select = sc.nextInt();

					switch(select) {
					case 1:
						System.out.println("ġŲ���Ÿ� �߰��մϴ�.");
						System.out.print("���� �Է� : ");
						chAcc += sc.nextInt();
						break;
					case 2:
						System.out.println("������Ÿ� �߰��մϴ�.");
						System.out.print("���� �Է� : ");
						shAcc += sc.nextInt();
						break;
					case 3:
						System.out.println("�Ұ����Ÿ� �߰��մϴ�.");
						System.out.print("���� �Է� : ");
						bulAcc += sc.nextInt();
						break;
					case 4:
						System.out.println("�ܹ��� ���� ����մϴ�.");
						chAcc = 0;
						shAcc = 0;
						bulAcc = 0;
						break;
					case 5:
						System.out.println("�޴��� �̵��մϴ�.");
						burger = false;
						break;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
				break;
			case 2:
				boolean drink = true;
				while(drink) {
					System.out.println();
					if(chAcc > 0) {
						System.out.println("ġŲ���� : " + chAcc);
					}
					if(shAcc > 0) {
						System.out.println("������� : " + shAcc);
					}
					if(bulAcc > 0) {
						System.out.println("�Ұ����� : " + bulAcc);
					}
					if(coAcc > 0) {
						System.out.println("�ݶ� : " + coAcc);
					}
					if(siAcc > 0) {
						System.out.println("���̴� : " + siAcc);
					}
					if(ffAcc > 0) {
						System.out.println("Ŀ�� : " + ffAcc);
					}
					System.out.println("\n###### ���� #####");
					System.out.println("1. �ݶ�");
					System.out.println("2. ���̴�");
					System.out.println("3. Ŀ��");
					System.out.println("4. ���� ���� ���");
					System.out.println("5. �޴��� �̵�");
					System.out.print("���� : ");
					int select = sc.nextInt();

					switch(select) {
					case 1:
						System.out.println("�ݶ� �߰��մϴ�.");
						System.out.print("���� �Է� : ");
						coAcc += sc.nextInt();
						break;
					case 2:
						System.out.println("���̴ٸ� �߰��մϴ�.");
						System.out.print("���� �Է� : ");
						siAcc += sc.nextInt();
						break;
					case 3:
						System.out.println("Ŀ�Ǹ� �߰��մϴ�.");
						System.out.print("���� �Է� : ");
						ffAcc += sc.nextInt();
						break;
					case 4:
						System.out.println("���� ������ ����մϴ�.");
						coAcc =0;
						siAcc = 0;
						ffAcc = 0;
						break;
					case 5:
						System.out.println("�޴��� �̵��մϴ�.");
						drink = false;
						break;
					default:
						System.out.println("���õ� �޴��� �����ϴ�.");
					}
				}
				break;
			case 3:
				sum += (chAcc * chicken);
				sum += (shAcc * shrimp);
				sum += (bulAcc * bulgogi);
				sum += (coAcc * cola);
				sum += (siAcc * sider);
				sum += (ffAcc * coffee);
				System.out.println("##### ���� #####");
				System.out.println("�����Ͻ� �ݾ� : " + sum);
				System.out.println("ī��� ���� �մϴ�.");
				System.out.println("���� �Ϸ� �߽��ϴ�.");
				
				chickenAll += chAcc;
				shrimpAll += shAcc;
				bulgogiAll += bulAcc;
				colaAll += coAcc;
				siderAll += siAcc;
				coffeeAll += ffAcc;
				
				sum = 0;
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				coAcc = 0;
				siAcc = 0;
				ffAcc = 0;
				break;
			case 4:
				System.out.println("##### ��ü ��� #####");
				System.out.println("üũ �� ��� ��ǰ�� ��� �Ǿ����ϴ�.");
				chAcc = 0;
				shAcc = 0;
				bulAcc = 0;
				coAcc = 0;
				siAcc = 0;
				ffAcc = 0;
				break;
			case 9999:
				admin:for(int i=0;i<3;i++) {
					System.out.print("������ ��й�ȣ �Է� : ");
					int check = sc.nextInt();
	
					if(adminPass == check) {
						while(true) {
							System.out.println("##### ������ ��� #####");
							System.out.println("1. ��� ����");
							System.out.println("2. �Ǹż�������");
							System.out.println("3. �Ǹűݾ׺���");
							System.out.println("4. ���ϸ��⺸��");
							System.out.println("5. �����ʱ�ȭ");
							System.out.println("6. �����ں�й�ȣ����");
							System.out.println("7. ���θ޴��� �̵�");
							System.out.println("0. ���α׷� ����");
							System.out.print("���� : ");
							menu = sc.nextInt();
	
							switch(menu) {
							case 1:
								System.out.println("##### ��� ���� #####");
								System.out.println("1. ġŲ����");
								System.out.println("2. �������");
								System.out.println("3. �Ұ�����");
								System.out.println("4. �ݶ�");
								System.out.println("5. ���̴�");
								System.out.println("6. Ŀ��");
								System.out.print("���� : ");
								int select = sc.nextInt();
								
								switch(select) {
								case 1:
									System.out.print("ġŲ���� ���� ��� �Է� : ");
									chicken = sc.nextInt();
									break;
								case 2:
									System.out.print("������� ���� ��� �Է� : ");
									shrimp = sc.nextInt();
									break;
								case 3:
									System.out.print("�Ұ����� ���� ��� �Է� : ");
									bulgogi = sc.nextInt();	
									break;
								case 4:
									System.out.print("�ݶ� ���� ��� �Է� : ");
									cola = sc.nextInt();
									break;
								case 5:
									System.out.print("���̴� ���� ��� �Է� : ");
									sider = sc.nextInt();
									break;
								case 6:
									System.out.print("Ŀ�� ���� ��� �Է� : ");
									coffee = sc.nextInt();
									break;
								default:
									System.out.println("���õ� �޴��� �����ϴ�.");
								}
								break;
							case 2:
								System.out.println("##### �Ǹ� ���� #####");
								System.out.println("ġŲ ���� : " + chickenAll);
								System.out.println("���� ���� : " + shrimpAll);
								System.out.println("�Ұ�� ���� : " + bulgogiAll);
								System.out.println("�ݶ� : " + colaAll);
								System.out.println("���̴� : " + siderAll);
								System.out.println("Ŀ�� : " + coffeeAll);
								break;
							case 3:
								System.out.println("##### �Ǹ� �ݾ� #####");
								System.out.println("ġŲ ���� : " + (chickenAll * chicken));
								System.out.println("���� ���� : " + (shrimpAll * shrimp));
								System.out.println("�Ұ�� ���� : " + (bulgogiAll * bulgogi));
								System.out.println("�ݶ� : " + (colaAll * cola));
								System.out.println("���̴� : " + (siderAll * sider));
								System.out.println("Ŀ�� : " + (coffeeAll * coffee));
								break;
							case 4:
								System.out.println("##### ���� ���� ���� #####");
								System.out.println("�� ���� : " + ((chickenAll * chicken) +
								(shrimpAll * shrimp) +
								(bulgogiAll * bulgogi) +
								(colaAll * cola) +
								 (siderAll * sider)+
								 (coffeeAll * coffee)));
								break;
							case 5:
								System.out.println("##### ���� �ʱ�ȭ #####");
								System.out.println("������ �ʱ�ȭ �߽��ϴ�.");
								chickenAll = 0;
								shrimpAll = 0;
								bulgogiAll = 0;
								colaAll = 0;
								siderAll = 0;
								coffeeAll = 0;
								break;
							case 6:
								System.out.println("##### ������ ��й�ȣ ���� #####");
								for(int x=0;x<3;x++) {
									System.out.print("���� ��й�ȣ �Է� : ");
									check  = sc.nextInt();
									
									if(adminPass == check) {
										System.out.print("���ο� ��й�ȣ �Է� : ");
										int pass1 = sc.nextInt();
										System.out.print("���ο� ��й�ȣ Ȯ�� : ");
										int pass2 = sc.nextInt();
										if(pass1 == pass2) {
											System.out.println("��й�ȣ�� �����մϴ�.");
											adminPass = pass1;
										} else {
											System.out.println("��й�ȣ�� Ȯ���� �ٽ� �����ϼ���");
										}
										break;
									} else {
										System.out.println( (x+1) + " ȸ Ʋ�Ƚ��ϴ�.");
									}
								}
								break;
							case 7:
								System.out.println("���� �޴��� �̵��մϴ�.");
								break admin;
							case 0:
								System.out.println("���α׷� ����");
								return;
							default:
								System.out.println("���õ� �޴��� �����ϴ�.");
							}
							System.out.println();
						}
					} else {
						System.out.println((i+1)+"ȸ ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
				}
				break;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}

	}
}

