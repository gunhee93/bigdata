package hw_kiosk;

import java.util.Scanner;

public class HwKiosk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String payHow = null;

		int chicken = 0;
		int shirimp = 0;
		int bulgogi = 0;
		int pepsi = 0;
		int sprite = 0;
		int americano = 0;
		
		int chickenAll = 0;
		int shirimpAll = 0;
		int bulgogiAll = 0;
		int pepsiAll = 0;
		int spriteAll = 0;
		int americanoAll = 0;

		int costChi = 4500;
		int costShi = 4000;
		int costBul = 3500;
		int costPep = 2000;
		int costSpr = 2000;
		int costAme = 1500;
		
		
		int costAll = 0;
		int pay = 0;

		int passid = 1234;

		while(true) {
			System.out.println("\n#### �� īƮ  ####");
			if(chicken>0){
				System.out.println("ġŲ ���� " + chicken + "��");
			}
			if(shirimp>0) {
				System.out.println("���� ���� " + shirimp + "��");					
			}
			if(bulgogi>0) {
				System.out.println("�Ұ�� ���� " + bulgogi + "��");					
			}
			if(pepsi>0) {
				System.out.println("����ݶ� " + pepsi + "��");					
			}
			if(sprite>0) {
				System.out.println("��������Ʈ " + sprite + "��");					
			}
			if(americano>0) {
				System.out.println("�Ƹ޸�ī�� " + americano + "��");					
			}
			System.out.println();
			System.out.println("\n=================");
			System.out.println("\n %%%%%%%%%%%%%%%");
			System.out.println("%%%% ����� ���� %%%%");
			System.out.println(" %%%%%%%%%%%%%%%");
			System.out.println("\n====== �� �� ======\n");
			System.out.println("1. �ܹ��� �޴�");
			System.out.println("2. ���� �޴�");
			System.out.println("3. �ֹ� �Ϸ�");

			System.out.println("���� : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				hambug:while(true) {
					System.out.println();
					System.out.println("\n=================");
					System.out.println("==== �ܹ��� �޴� ====");
					System.out.println("1. ġŲ ����");
					System.out.println("2. ���� ����");
					System.out.println("3. �Ұ�� ����");
					System.out.println("5. �ܹ��� ���ÿϷ�");
					System.out.println("��ǰ��ȣ�Է� : ");
					int menu2 = sc.nextInt();

					switch(menu2) {
					case 1:
						System.out.println("�����Է� : ");
						chicken += sc.nextInt();
						System.out.println("ġŲ ���� " + chicken + " ���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						break;
					case 2:
						System.out.println("�����Է� : ");
						shirimp += sc.nextInt();
						System.out.println("���� ���� " + shirimp + " ���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						break;
					case 3:
						System.out.println("�����Է� : ");
						bulgogi += sc.nextInt();
						System.out.println("�Ұ�� ���� " + bulgogi + " ���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						break;
					case 5:
						System.out.println("..���� �޴��� ���ư��ϴ�..");
						break hambug;
					default :
						System.out.println("��ǰ��ȣ��  �߸� �ԷµǾ����ϴ�.");
					}
				}
			break;																														
			case 2:
				drink : while(true) {
					System.out.println();
					System.out.println("\n=================");
					System.out.println("==== ���� �޴� ====");
					System.out.println("1. �ս��ݶ�");
					System.out.println("2. ��������Ʈ");
					System.out.println("3. �Ƹ޸�ī��");
					System.out.println("5. ���� ���ÿϷ�");

					System.out.println("��ǰ��ȣ�Է� : ");
					int menu3 = sc.nextInt();

					switch(menu3) {
					case 1:
						System.out.println("�����Է� : ");
						pepsi += sc.nextInt();
						System.out.println("�ս��ݶ� " + pepsi + " ���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						break;
					case 2:
						System.out.println("�����Է� : ");
						sprite += sc.nextInt();
						System.out.println("��������Ʈ " + sprite + " ���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						break;
					case 3:
						System.out.println("�����Է� : ");
						americano += sc.nextInt();
						System.out.println("�Ƹ޸�ī�� " + americano + " ���� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						break ;
					case 5:
						System.out.println("..���� �޴��� ���ư��ϴ�..");
						break drink;
					default :
						System.out.println("��ǰ��ȣ��  �߸� �ԷµǾ����ϴ�.");
					}
				}
			break;									
			case 3:
				
				costAll += (costChi*chicken);
				costAll += (costShi*shirimp);
				costAll += (costBul*bulgogi);
				costAll += (costPep*pepsi);
				costAll += (costSpr*sprite);
				costAll += (costAme*americano);
				
				chickenAll += chicken;
				shirimpAll += shirimp;
				bulgogiAll += bulgogi;
				pepsiAll += pepsi;
				spriteAll += sprite;
				americanoAll += americano;
				
				System.out.println("===== �����ϱ� =====");
				System.out.println("#### �� īƮ ####");
				if(chicken>0){
					System.out.println("ġŲ ���� " + chicken + "��");
				}
				if(shirimp>0) {
					System.out.println("���� ���� " + shirimp + "��");					
				}
				if(bulgogi>0) {
					System.out.println("�Ұ�� ���� " + bulgogi + "��");					
				}
				if(pepsi>0) {
					System.out.println("����ݶ� " + pepsi + "��");					
				}
				if(sprite>0) {
					System.out.println("��������Ʈ " + sprite + "��");					
				}
				if(americano>0) {
					System.out.println("�Ƹ޸�ī�� " + americano + "��");					
				}
				System.out.println("=================");
				System.out.println("������ �ݾ� : ��" + costAll);
				System.out.println("\n���� �Ͻðڽ��ϱ�?\n");
				System.out.println("1. �����ϱ�");
				System.out.println("2. �߰� �ֹ��ϱ�");
				int menu3 =sc.nextInt();

				switch(menu3) {

				case 1:
					do {

						System.out.println("������ �ݾ� : ��" + costAll);
						System.out.println("\n���� ������ �����ϼ���.\n");
						System.out.println("���� or ī��");
						System.out.println("�ѱ��Է� : ");
						payHow = sc.next();
						System.out.println(payHow + "��(��) �����ϼ̽��ϴ�.");
						System.out.println("\n�����Ͻ� �ݾ��� �Է��� �ּ���.\n");
						System.out.println("�ݾ� : ");
						pay = sc.nextInt();
						costAll = costAll - pay;
					}while(costAll>0);
					chicken = 0;
					shirimp = 0;
					bulgogi = 0;
					pepsi = 0;
					sprite = 0;
					americano = 0;
					costAll = 0;	
					System.out.println("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
				case 2:
					System.out.println("�޴��� ���ư��ϴ�.");
					break;
				default :
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
				}



				break;
			case 9999:
				boolean manager = true;
					managerout : for(int i=0;i<3;i++) {
						System.out.println("������ ��й�ȣ �Է� : ");
						int pass = sc.nextInt();
						
						if(passid == pass) {
							while(manager) {
							System.out.println("\n****** ������ ��� *******");
							System.out.println("1. ��ݼ���");
							System.out.println("2. �Ǹż���");
							System.out.println("3. ����");
							System.out.println("4. ������ ��й�ȣ ����");
							System.out.println("0. �����ڸ�� ����");
							System.out.println("���� : ");
							int select = sc.nextInt();

							switch(select) {
							case 1:
								System.out.println("****** ��ݼ��� ******");
								System.out.println("1. ġŲ���� ��ݼ���");
								System.out.println("2. ������� ��ݼ���");
								System.out.println("3. �Ұ����� ��ݼ���");
								System.out.println("4. �ս��ݶ� ��ݼ���");
								System.out.println("5. ��������Ʈ ��ݼ���");
								System.out.println("6. �Ƹ޸�ī�� ��ݼ���");
								System.out.println("0. ������ �޴���");
								System.out.println("������ �޴����� : ");
								int edit = sc.nextInt();

								switch(edit) {
								case 1:
									System.out.println("ġŲ������ �Ǹſ���� �����մϴ�.");
									System.out.println("�ݾ� �Է�: ");
									costChi = sc.nextInt();
									break;
								case 2:
									System.out.println("��������� �Ǹſ���� �����մϴ�.");
									System.out.println("�ݾ� �Է�: ");
									costShi = sc.nextInt();
									break;
								case 3:
									System.out.println("�Ұ������� �Ǹſ���� �����մϴ�.");
									System.out.println("�ݾ� �Է�: ");
									costBul = sc.nextInt();
									break;
								case 4:
									System.out.println("����ݶ��� �Ǹſ���� �����մϴ�.");
									System.out.println("�ݾ� �Է�: ");
									costPep = sc.nextInt();
									break;
								case 5:
									System.out.println("��������Ʈ�� �Ǹſ���� �����մϴ�.");
									System.out.println("�ݾ� �Է�: ");
									costSpr = sc.nextInt();
									break;
								case 6:
									System.out.println("�Ƹ޸�ī���� �Ǹſ���� �����մϴ�.");
									System.out.println("�ݾ� �Է�: ");
									costAme = sc.nextInt();
									break;
								case 0:
									System.out.println("������ �޴��� ���ư��ϴ�.");
									break;
								default :
									System.out.println("�߸��Է��Ͽ����ϴ�.");
								}
								break;
							case 2:

								System.out.println("****** �Ǹż��� ******");
								System.out.println("ġŲ���� - " + chickenAll);
								System.out.println("������� - " + shirimpAll);
								System.out.println("�Ұ�� ���� - " + bulgogiAll);
								System.out.println("����ݶ� - " + pepsiAll);
								System.out.println("��������Ʈ - " + spriteAll);
								System.out.println("�Ƹ޸�ī�� - " + americanoAll);
								System.out.println("1. ������ �޴��� ");
								int managermenu = sc.nextInt();
								if(1 == managermenu) {
									System.out.println("..������ �޴��� ���ư��ϴ�..");
								}
								break;
							case 3:
								System.out.println("****** ��ǰ�� ������Ȳ ******");
								System.out.println("1. ġŲ���� - ��" + (chickenAll*costChi));
								System.out.println("2. ������� - ��" + (shirimpAll*costShi));
								System.out.println("3. �Ұ����� - ��" + (bulgogiAll*costBul));
								System.out.println("4. ����ݶ� - ��" + (pepsiAll*costPep));
								System.out.println("5. ��������Ʈ - ��" + (spriteAll*costSpr));
								System.out.println("6. �Ƹ޸�ī�� - ��" + (americanoAll*costAme));
								System.out.println("���� �Ѹ���  ��: " + (chickenAll*costChi)
																 + (shirimpAll*costShi)
																 + (bulgogiAll*costBul)
																 + (pepsiAll*costPep)
																 + (spriteAll*costSpr)
																 + (americanoAll*costAme));
								System.out.println("��ü ���� �ʱ�ȭ �ϱ⸦ ���Ͻø� ��й�ȣ�� �Է��� �ּ���.");
								System.out.println("0. ������ ���� ���ư���");
								int managermenu2 = sc.nextInt();
								if(0 == managermenu2) {
									System.out.println("..������ �޴��� ���ư��ϴ�..");
								}
								if (managermenu2 == 1234) {
								chickenAll = 0;
								shirimpAll = 0;
								bulgogiAll = 0;
								pepsiAll = 0;
								spriteAll = 0;
								americanoAll = 0;
								System.out.println("��� ������ �ʱ�ȭ �Ǿ����ϴ�.");
								}
								break;
							case 4:
								System.out.println("******������ ��й�ȣ ���� ******");
								for(int x=0;x<3;x++) {
									System.out.println("���� ��й�ȣ �Է� : ");
									pass = sc.nextInt();
									
									if(passid == pass) {
										System.out.println("���ο� ��й�ȣ �Է� : ");
										int newPass = sc.nextInt();
										System.out.println("���Է� : ");
										int newPass2 = sc.nextInt();
										if(newPass == newPass2) {
											System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
											passid = newPass;
										}else {
											System.out.println("�Է��Ͻ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
										}
										break;
									}else {
										System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
									}
								}
								break;
							case 0:
								System.out.println("..������ ��带 �����մϴ�..");
								break managerout;
							default :
								System.out.println("�߸� �Է��Ͽ����ϴ�.");
							}	
						}
						} else {
						
						}	System.out.println("��й�ȣ�� " + (i+1) + "ȸ Ʋ�Ƚ��ϴ�.");							
					}				
				break;
			default :
				System.out.println("�߸� �ԷµǾ����ϴ�.");
			}
		}
	}
}

