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
			System.out.println("\n#### 내 카트  ####");
			if(chicken>0){
				System.out.println("치킨 버거 " + chicken + "개");
			}
			if(shirimp>0) {
				System.out.println("새우 버거 " + shirimp + "개");					
			}
			if(bulgogi>0) {
				System.out.println("불고기 버거 " + bulgogi + "개");					
			}
			if(pepsi>0) {
				System.out.println("펨시콜라 " + pepsi + "잔");					
			}
			if(sprite>0) {
				System.out.println("스프라이트 " + sprite + "잔");					
			}
			if(americano>0) {
				System.out.println("아메리카노 " + americano + "잔");					
			}
			System.out.println();
			System.out.println("\n=================");
			System.out.println("\n %%%%%%%%%%%%%%%");
			System.out.println("%%%% 건희네 버거 %%%%");
			System.out.println(" %%%%%%%%%%%%%%%");
			System.out.println("\n====== 메 뉴 ======\n");
			System.out.println("1. 햄버거 메뉴");
			System.out.println("2. 음료 메뉴");
			System.out.println("3. 주문 완료");

			System.out.println("선택 : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				hambug:while(true) {
					System.out.println();
					System.out.println("\n=================");
					System.out.println("==== 햄버거 메뉴 ====");
					System.out.println("1. 치킨 버거");
					System.out.println("2. 새우 버거");
					System.out.println("3. 불고기 버거");
					System.out.println("5. 햄버거 선택완료");
					System.out.println("상품번호입력 : ");
					int menu2 = sc.nextInt();

					switch(menu2) {
					case 1:
						System.out.println("수량입력 : ");
						chicken += sc.nextInt();
						System.out.println("치킨 버거 " + chicken + " 개가 장바구니에 추가되었습니다.");
						break;
					case 2:
						System.out.println("수량입력 : ");
						shirimp += sc.nextInt();
						System.out.println("새우 버거 " + shirimp + " 개가 장바구니에 추가되었습니다.");
						break;
					case 3:
						System.out.println("수량입력 : ");
						bulgogi += sc.nextInt();
						System.out.println("불고기 버거 " + bulgogi + " 개가 장바구니에 추가되었습니다.");
						break;
					case 5:
						System.out.println("..메인 메뉴로 돌아갑니다..");
						break hambug;
					default :
						System.out.println("상품번호가  잘못 입력되었습니다.");
					}
				}
			break;																														
			case 2:
				drink : while(true) {
					System.out.println();
					System.out.println("\n=================");
					System.out.println("==== 음료 메뉴 ====");
					System.out.println("1. 팹시콜라");
					System.out.println("2. 스프라이트");
					System.out.println("3. 아메리카노");
					System.out.println("5. 음료 선택완료");

					System.out.println("상품번호입력 : ");
					int menu3 = sc.nextInt();

					switch(menu3) {
					case 1:
						System.out.println("수량입력 : ");
						pepsi += sc.nextInt();
						System.out.println("팹시콜라 " + pepsi + " 잔이 장바구니에 추가되었습니다.");
						break;
					case 2:
						System.out.println("수량입력 : ");
						sprite += sc.nextInt();
						System.out.println("스프라이트 " + sprite + " 잔이 장바구니에 추가되었습니다.");
						break;
					case 3:
						System.out.println("수량입력 : ");
						americano += sc.nextInt();
						System.out.println("아메리카노 " + americano + " 잔이 장바구니에 추가되었습니다.");
						break ;
					case 5:
						System.out.println("..메인 메뉴로 돌아갑니다..");
						break drink;
					default :
						System.out.println("상품번호가  잘못 입력되었습니다.");
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
				
				System.out.println("===== 결제하기 =====");
				System.out.println("#### 내 카트 ####");
				if(chicken>0){
					System.out.println("치킨 버거 " + chicken + "개");
				}
				if(shirimp>0) {
					System.out.println("새우 버거 " + shirimp + "개");					
				}
				if(bulgogi>0) {
					System.out.println("불고기 버거 " + bulgogi + "개");					
				}
				if(pepsi>0) {
					System.out.println("펨시콜라 " + pepsi + "잔");					
				}
				if(sprite>0) {
					System.out.println("스프라이트 " + sprite + "잔");					
				}
				if(americano>0) {
					System.out.println("아메리카노 " + americano + "잔");					
				}
				System.out.println("=================");
				System.out.println("결제할 금액 : ￦" + costAll);
				System.out.println("\n결제 하시겠습니까?\n");
				System.out.println("1. 결제하기");
				System.out.println("2. 추가 주문하기");
				int menu3 =sc.nextInt();

				switch(menu3) {

				case 1:
					do {

						System.out.println("결제할 금액 : ￦" + costAll);
						System.out.println("\n결제 수단을 선택하세요.\n");
						System.out.println("현금 or 카드");
						System.out.println("한글입력 : ");
						payHow = sc.next();
						System.out.println(payHow + "을(를) 선택하셨습니다.");
						System.out.println("\n결제하실 금액을 입력해 주세요.\n");
						System.out.println("금액 : ");
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
					System.out.println("결제가 완료되었습니다. 감사합니다.");
				case 2:
					System.out.println("메뉴로 돌아갑니다.");
					break;
				default :
					System.out.println("잘못 입력하였습니다.");
				}



				break;
			case 9999:
				boolean manager = true;
					managerout : for(int i=0;i<3;i++) {
						System.out.println("관리자 비밀번호 입력 : ");
						int pass = sc.nextInt();
						
						if(passid == pass) {
							while(manager) {
							System.out.println("\n****** 관리자 모드 *******");
							System.out.println("1. 요금수정");
							System.out.println("2. 판매수량");
							System.out.println("3. 매출");
							System.out.println("4. 관리자 비밀번호 변경");
							System.out.println("0. 관리자모드 종료");
							System.out.println("선택 : ");
							int select = sc.nextInt();

							switch(select) {
							case 1:
								System.out.println("****** 요금수정 ******");
								System.out.println("1. 치킨버거 요금수정");
								System.out.println("2. 새우버거 요금수정");
								System.out.println("3. 불고기버거 요금수정");
								System.out.println("4. 팹시콜라 요금수정");
								System.out.println("5. 스프라이트 요금수정");
								System.out.println("6. 아메리카노 요금수정");
								System.out.println("0. 관리자 메뉴로");
								System.out.println("수정할 메뉴선택 : ");
								int edit = sc.nextInt();

								switch(edit) {
								case 1:
									System.out.println("치킨버거의 판매요금을 수정합니다.");
									System.out.println("금액 입력: ");
									costChi = sc.nextInt();
									break;
								case 2:
									System.out.println("새우버거의 판매요금을 수정합니다.");
									System.out.println("금액 입력: ");
									costShi = sc.nextInt();
									break;
								case 3:
									System.out.println("불고기버거의 판매요금을 수정합니다.");
									System.out.println("금액 입력: ");
									costBul = sc.nextInt();
									break;
								case 4:
									System.out.println("펩시콜라의 판매요금을 수정합니다.");
									System.out.println("금액 입력: ");
									costPep = sc.nextInt();
									break;
								case 5:
									System.out.println("스프라이트의 판매요금을 수정합니다.");
									System.out.println("금액 입력: ");
									costSpr = sc.nextInt();
									break;
								case 6:
									System.out.println("아메리카노의 판매요금을 수정합니다.");
									System.out.println("금액 입력: ");
									costAme = sc.nextInt();
									break;
								case 0:
									System.out.println("관리자 메뉴로 돌아갑니다.");
									break;
								default :
									System.out.println("잘못입력하였습니다.");
								}
								break;
							case 2:

								System.out.println("****** 판매수량 ******");
								System.out.println("치킨버거 - " + chickenAll);
								System.out.println("새우버거 - " + shirimpAll);
								System.out.println("불고기 버거 - " + bulgogiAll);
								System.out.println("펩시콜라 - " + pepsiAll);
								System.out.println("스프라이트 - " + spriteAll);
								System.out.println("아메리카노 - " + americanoAll);
								System.out.println("1. 관리자 메뉴로 ");
								int managermenu = sc.nextInt();
								if(1 == managermenu) {
									System.out.println("..관리자 메뉴로 돌아갑니다..");
								}
								break;
							case 3:
								System.out.println("****** 상품별 매출현황 ******");
								System.out.println("1. 치킨버거 - ￦" + (chickenAll*costChi));
								System.out.println("2. 새우버거 - ￦" + (shirimpAll*costShi));
								System.out.println("3. 불고기버거 - ￦" + (bulgogiAll*costBul));
								System.out.println("4. 펩시콜라 - ￦" + (pepsiAll*costPep));
								System.out.println("5. 스프라이트 - ￦" + (spriteAll*costSpr));
								System.out.println("6. 아메리카노 - ￦" + (americanoAll*costAme));
								System.out.println("일일 총매출  ￦: " + (chickenAll*costChi)
																 + (shirimpAll*costShi)
																 + (bulgogiAll*costBul)
																 + (pepsiAll*costPep)
																 + (spriteAll*costSpr)
																 + (americanoAll*costAme));
								System.out.println("전체 매출 초기화 하기를 원하시면 비밀번호를 입력해 주세요.");
								System.out.println("0. 관리자 모드로 돌아가기");
								int managermenu2 = sc.nextInt();
								if(0 == managermenu2) {
									System.out.println("..관리자 메뉴로 돌아갑니다..");
								}
								if (managermenu2 == 1234) {
								chickenAll = 0;
								shirimpAll = 0;
								bulgogiAll = 0;
								pepsiAll = 0;
								spriteAll = 0;
								americanoAll = 0;
								System.out.println("모든 매출이 초기화 되었습니다.");
								}
								break;
							case 4:
								System.out.println("******관리자 비밀번호 변경 ******");
								for(int x=0;x<3;x++) {
									System.out.println("현재 비밀번호 입력 : ");
									pass = sc.nextInt();
									
									if(passid == pass) {
										System.out.println("새로운 비밀번호 입력 : ");
										int newPass = sc.nextInt();
										System.out.println("재입력 : ");
										int newPass2 = sc.nextInt();
										if(newPass == newPass2) {
											System.out.println("비밀번호가 변경되었습니다.");
											passid = newPass;
										}else {
											System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
										}
										break;
									}else {
										System.out.println("비밀번호가 틀렸습니다.");
									}
								}
								break;
							case 0:
								System.out.println("..관리자 모드를 종료합니다..");
								break managerout;
							default :
								System.out.println("잘못 입력하였습니다.");
							}	
						}
						} else {
						
						}	System.out.println("비밀번호가 " + (i+1) + "회 틀렸습니다.");							
					}				
				break;
			default :
				System.out.println("잘못 입력되었습니다.");
			}
		}
	}
}

