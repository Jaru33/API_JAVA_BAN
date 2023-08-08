package blackandwhite2;

import java.util.Scanner;

public class PlayGame {
	boolean checkNum = false;
	Scanner scan = new Scanner(System.in);
	Message ms = new Message();

	public PlayGame() {
		super();
		ms.startMessage();// 게임시작메서드
		setGame();
	}

	public void setGame() {
		do {
			ms.setMessage(0);// 게임타입설정메시지
			String str = scan.nextLine();
			if (str.equals("1")) {
				ms.setMessage(1);// 게임타입1선택했을경우메시지
				ms.setMessage(11); // 게임시작메서드
				Player player = new Player();
				Computer com = new Computer();
				playGame(player, com);
				break;
			} else if (str.equals("2")) {
				ms.setMessage(2);// 게임타입2선택했을경우메시지
				String name = scan.nextLine();
				ms.setMessage(21);// 게임타입2선택했을경우2번째 메시지
				String name2 = scan.nextLine();
				Player player1 = new Player(name);
				Player player2 = new Player(name2);
				ms.setMessage(22);
				playGame(player1, player2);
				break;
			} else if (str.equals("3")) {
				ms.setMessage(3);// 게임타입3 게임종료선택했을경우 메시지
				break;
			} else {
				ms.setMessage(4);// 게임타입 오류메시지
//				System.out.println("잘못 입력하였습니다.");
//				System.out.println("다시입력해주세요.");
				continue;
			}
		} while (true);
	}
	// 문자를입력할때 오류.

	public void playGame(Player player, Computer com) {
		int comScore = 0;
		int playerScore = 0;
		int count = 9;
		int i = 0;
		for (i = 0; i < 9; i++) {
			com.setComPickNum(com.getComputerNumberList().get(i));
//			System.out.println("임시 테스트 컴퓨터 카드번호" + com.getComPickNum());
			if (com.getComPickNum() % 2 == 0) {
				ms.playMessage(11);// 컴퓨터가 짝수카드제시
			} else {
				ms.playMessage(12);// 컴퓨터가 홀수카드제시
			}
			do {
				Scanner scan = new Scanner(System.in);
				try {
					System.out.println("상대방과 겨룰 번호를 선택하세요");
					int c1 = player.getPlayerNumberList().get(0);
					int c2 = player.getPlayerNumberList().get(1);
					int c3 = player.getPlayerNumberList().get(2);
					int c4 = player.getPlayerNumberList().get(3);
					int c5 = player.getPlayerNumberList().get(4);
					int c6 = player.getPlayerNumberList().get(5);
					int c7 = player.getPlayerNumberList().get(6);
					int c8 = player.getPlayerNumberList().get(7);
					int c9 = player.getPlayerNumberList().get(8);

					if (count == 9) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
						System.out.println("┃ 1 ┃ ┃ 2 ┃ ┃ 3 ┃ ┃ 4 ┃ ┃ 5 ┃ ┃ 6 ┃ ┃ 7 ┃ ┃ 8 ┃ ┃ 9 ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 8) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
						System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5
								+ " ┃ ┃ " + c6 + " ┃ ┃ " + c7 + " ┃ ┃ " + c8 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 7) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
						System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5
								+ " ┃ ┃ " + c6 + " ┃ ┃ " + c7 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 6) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
						System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5
								+ " ┃ ┃ " + c6 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 5) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
						System.out
								.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 4) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ");
						System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ");
						count--;
					} else if (count == 3) {
						System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓");
						System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 2) {
						System.out.println("┏━━━┓ ┏━━━┓");
						System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃");
						System.out.println("┗━━━┛ ┗━━━┛");
						count--;
					} else if (count == 1) {
						System.out.println("┏━━━┓");
						System.out.println("┃ " + c1 + " ┃");
						System.out.println("┗━━━┛");
						count--;
					}

					int pickNum = Integer.parseInt(scan.nextLine());
					if (player.getPlayerNumberList().contains(pickNum)) {// pickNum
						player.setPlayerPickNum(pickNum);
						player.getPlayerNumberList().remove(Integer.valueOf(player.getPlayerPickNum()));// 다음배열출력에
																										// 지워지는지확인
						player.getPlayerNumberList().add(0);
						if (player.getPlayerPickNum() > com.getComPickNum()) {
							if (player.getPlayerPickNum() == 9 && com.getComPickNum() == 1) {// 1이 9를이기는 룰 추가
								comScore = comScore + 1;
								com.setComScore(comScore);
								System.out.println("╔═══════════════════════════════╗");
								System.out.println("║컴퓨터의 승! \t\t\t║");
								System.out.println("║\t       현재 스코어     \t\t║");
								System.out.println("║Player\t\t\tComputer║");
								System.out.println("║   " + playerScore + "\t\t\t" + "   " + comScore + "\t║");
								System.out.println("║\t  \t\t\t║");
								System.out.println("╚═══════════════════════════════╝");
								System.out.println();

								break;
							}
							playerScore = playerScore + 1;
							player.setPlayerScore(playerScore);
							System.out.println("╔═══════════════════════════════╗");
							System.out.println("║Player님의 승! \t\t\t║");
							System.out.println("║\t       현재 스코어     \t\t║");
							System.out.println("║Player\t\t\tComputer║");
							System.out.println("║   " + playerScore + "\t\t\t" + "   " + comScore + "\t║");
							System.out.println("║\t  \t\t\t║");
							System.out.println("╚═══════════════════════════════╝");
							System.out.println();
							break;
						} else if (player.getPlayerPickNum() < com.getComPickNum()) {
							if (player.getPlayerPickNum() == 1 && com.getComPickNum() == 9) {// 1이 9를이기는 룰 추가
								playerScore = playerScore + 1;
								player.setPlayerScore(playerScore);
								System.out.println("╔═══════════════════════════════╗");
								System.out.println("║Player님의 승! \t\t\t║");
								System.out.println("║\t       현재 스코어     \t\t║");
								System.out.println("║Player\t\t\tComputer║");
								System.out.println("║   " + playerScore + "\t\t\t" + "   " + comScore + "\t║");
								System.out.println("║\t  \t\t\t║");
								System.out.println("╚═══════════════════════════════╝");
								System.out.println();
								break;
							}
							comScore = comScore + 1;
							com.setComScore(comScore);
							System.out.println("╔═══════════════════════════════╗");
							System.out.println("║컴퓨터의 승! \t\t\t║");
							System.out.println("║\t       현재 스코어     \t\t║");
							System.out.println("║Player\t\t\tComputer║");
							System.out.println("║   " + playerScore + "\t\t\t" + "   " + comScore + "\t║");
							System.out.println("║\t  \t\t\t║");
							System.out.println("╚═══════════════════════════════╝");
							System.out.println();
							break;
						} else {
							System.out.println("╔═══════════════════════════════╗");
							System.out.println("║무승부! \t\t\t\t║");
							System.out.println("║\t       현재 스코어     \t\t║");
							System.out.println("║Player\t\t\tComputer║");
							System.out.println("║   " + "2" + "\t\t\t" + "   3" + "\t║");
							System.out.println("║\t  \t\t\t║");
							System.out.println("╚═══════════════════════════════╝");
							System.out.println();
							break;
						}
					} else {
						System.out.println("잘못선택하였습니다. 다시선택해주세요");
						count++;
					}
				} catch (NumberFormatException e) {
					System.out.println("잘못입력하였습니다. 다시입력해주세요(숫자입력해주세요)");
					count++;
					i--;
					break;
				}
//				if (player.getPlayerNumberList().contains(pickNum)) {// pickNum
//					player.setPlayerPickNum(pickNum);
//					player.getPlayerNumberList().remove(Integer.valueOf(player.getPlayerPickNum()));// 다음배열출력에 지워지는지확인
//					player.getPlayerNumberList().add(0);
//					if (player.getPlayerPickNum() > com.getComPickNum()) {
//						if (player.getPlayerPickNum() == 9 && com.getComPickNum() == 1) {// 1이 9를이기는 룰 추가
//							comScore = comScore + 1;
//							com.setComScore(comScore);
//							System.out.println("╔═══════════════════════════════╗");
//							System.out.println("║컴퓨터의 승! \t\t\t║");
//							System.out.println("║\t       현재 스코어     \t\t║");
//							System.out.println("║Player\t\t\tComputer║");
//							System.out.println("║   "+playerScore +"\t\t\t"+"   "+comScore+ "\t║");
//							System.out.println("║\t  \t\t\t║");
//							System.out.println("╚═══════════════════════════════╝");
//							System.out.println();
//							
//							break;
//						}
//						playerScore = playerScore + 1;
//						player.setPlayerScore(playerScore);
//						System.out.println("╔═══════════════════════════════╗");
//						System.out.println("║Player님의 승! \t\t\t║");
//						System.out.println("║\t       현재 스코어     \t\t║");
//						System.out.println("║Player\t\t\tComputer║");
//						System.out.println("║   "+playerScore +"\t\t\t"+"   "+comScore+ "\t║");
//						System.out.println("║\t  \t\t\t║");
//						System.out.println("╚═══════════════════════════════╝");
//						System.out.println();
//						break;
//					} else if (player.getPlayerPickNum() < com.getComPickNum()) {
//						if (player.getPlayerPickNum() == 1 && com.getComPickNum() == 9) {// 1이 9를이기는 룰 추가
//							playerScore = playerScore + 1;
//							player.setPlayerScore(playerScore);
//							System.out.println("╔═══════════════════════════════╗");
//							System.out.println("║Player님의 승! \t\t\t║");
//							System.out.println("║\t       현재 스코어     \t\t║");
//							System.out.println("║Player\t\t\tComputer║");
//							System.out.println("║   "+playerScore +"\t\t\t"+"   "+comScore+ "\t║");
//							System.out.println("║\t  \t\t\t║");
//							System.out.println("╚═══════════════════════════════╝");
//							System.out.println();
//							break;
//						}
//						comScore = comScore + 1;
//						com.setComScore(comScore);
//						System.out.println("╔═══════════════════════════════╗");
//						System.out.println("║컴퓨터의 승! \t\t\t║");
//						System.out.println("║\t       현재 스코어     \t\t║");
//						System.out.println("║Player\t\t\tComputer║");
//						System.out.println("║   "+playerScore +"\t\t\t"+"   "+comScore+ "\t║");
//						System.out.println("║\t  \t\t\t║");
//						System.out.println("╚═══════════════════════════════╝");
//						System.out.println();
//						break;
//					} else {
//						System.out.println("╔═══════════════════════════════╗");
//						System.out.println("║무승부! \t\t\t\t║");
//						System.out.println("║\t       현재 스코어     \t\t║");
//						System.out.println("║Player\t\t\tComputer║");
//						System.out.println("║   "+"2" +"\t\t\t"+"   3"+ "\t║");
//						System.out.println("║\t  \t\t\t║");
//						System.out.println("╚═══════════════════════════════╝");
//						System.out.println();
//						break;
//					}
//				} else {
//					System.out.println("잘못선택하였습니다. 다시선택해주세요");
//					count++;
//				}
			} while (true);
		} // for문종료
		playGameResultInfo(player, com);
	}// 메서드종료

	public void playGame(Player player1, Player player2) {
		int player1Score = 0;
		int player2Score = 0;
		int p1count = 9;
		int p2count = 9;
		for (int i = 0; i < 9; i++) {
			do {
				
				System.out.println("Player1님 대결하실 번호를 선택해주세요");
				int c1 = player1.getPlayerNumberList().get(0);
				int c2 = player1.getPlayerNumberList().get(1);
				int c3 = player1.getPlayerNumberList().get(2);
				int c4 = player1.getPlayerNumberList().get(3);
				int c5 = player1.getPlayerNumberList().get(4);
				int c6 = player1.getPlayerNumberList().get(5);
				int c7 = player1.getPlayerNumberList().get(6);
				int c8 = player1.getPlayerNumberList().get(7);
				int c9 = player1.getPlayerNumberList().get(8);

				if (p1count == 9) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ 1 ┃ ┃ 2 ┃ ┃ 3 ┃ ┃ 4 ┃ ┃ 5 ┃ ┃ 6 ┃ ┃ 7 ┃ ┃ 8 ┃ ┃ 9 ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 8) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃ ┃ "
							+ c6 + " ┃ ┃ " + c7 + " ┃ ┃ " + c8 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 7) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃ ┃ "
							+ c6 + " ┃ ┃ " + c7 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 6) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃ ┃ "
							+ c6 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 5) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 4) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ");
					p1count--;
				} else if (p1count == 3) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 2) {
					System.out.println("┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛");
					p1count--;
				} else if (p1count == 1) {
					System.out.println("┏━━━┓");
					System.out.println("┃ " + c1 + " ┃");
					System.out.println("┗━━━┛");
					p1count--;
				}
				
				int pickNum1 = Integer.parseInt(scan.nextLine());
				
				// contain말고 코드로 구현하기(정상작동 확인함)
//				for (int j = 0; j < player1.getPlayerNumberList().size(); j++) {
//					if(player1.getPlayerNumberList().get(j) == pickNum1) {
//						checkNum = true;
//						break;
//						
//					}else {
//						checkNum = false;
//					}
//				}
				if (player1.getPlayerNumberList().contains(pickNum1)) {// if(check) 넣고하면 정상작동됨을 확인
					player1.setPlayerPickNum(pickNum1);
					player1.getPlayerNumberList().remove(Integer.valueOf(player1.getPlayerPickNum()));
					player1.getPlayerNumberList().add(0);
					if (player1.getPlayerPickNum() % 2 == 0) {
						System.out.println();
						System.out.println("╔═══════════════════════════════╗");
						System.out.println("║\t  \t\t\t║");
						System.out.println("║\t상대방 카드보기 방지용\t\t║");
						System.out.println("║\t\t\t\t║");
						System.out.println("╚═══════════════════════════════╝");
						ms.playMessage(21);// 플레이어1이 짝수카드제시
						break;
					} else {
						System.out.println();
						System.out.println("╔═══════════════════════════════╗");
						System.out.println("║\t  \t\t\t║");
						System.out.println("║\t상대방 카드보기 방지용\t\t║");
						System.out.println("║\t\t\t\t║");
						System.out.println("╚═══════════════════════════════╝");
						ms.playMessage(22);// 플레이어1이 홀수카드제시
						break;
					}
				} else {
					System.out.println("잘못선택하였습니다. 다시선택해주세요");
					p1count++;
				}
				
			} while (true);
			do {
				
				System.out.println("Player2 님 상대방과 겨룰 번호를 선택하세요");
				int c1 = player2.getPlayerNumberList().get(0);
				int c2 = player2.getPlayerNumberList().get(1);
				int c3 = player2.getPlayerNumberList().get(2);
				int c4 = player2.getPlayerNumberList().get(3);
				int c5 = player2.getPlayerNumberList().get(4);
				int c6 = player2.getPlayerNumberList().get(5);
				int c7 = player2.getPlayerNumberList().get(6);
				int c8 = player2.getPlayerNumberList().get(7);
				int c9 = player2.getPlayerNumberList().get(8);

				if (p2count == 9) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ 1 ┃ ┃ 2 ┃ ┃ 3 ┃ ┃ 4 ┃ ┃ 5 ┃ ┃ 6 ┃ ┃ 7 ┃ ┃ 8 ┃ ┃ 9 ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 8) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃ ┃ "
							+ c6 + " ┃ ┃ " + c7 + " ┃ ┃ " + c8 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 7) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃ ┃ "
							+ c6 + " ┃ ┃ " + c7 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 6) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃ ┃ "
							+ c6 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 5) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃ ┃ " + c5 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 4) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓ ┏━━━┓ ");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃ ┃ " + c4 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛ ┗━━━┛ ");
					p2count--;
				} else if (p2count == 3) {
					System.out.println("┏━━━┓ ┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃ ┃ " + c3 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 2) {
					System.out.println("┏━━━┓ ┏━━━┓");
					System.out.println("┃ " + c1 + " ┃ ┃ " + c2 + " ┃");
					System.out.println("┗━━━┛ ┗━━━┛");
					p2count--;
				} else if (p2count == 1) {
					System.out.println("┏━━━┓");
					System.out.println("┃ " + c1 + " ┃");
					System.out.println("┗━━━┛");
					p2count--;
				}
				int pickNum2 = Integer.parseInt(scan.nextLine());
				if (player2.getPlayerNumberList().contains(pickNum2)) {
					player2.setPlayerPickNum(pickNum2);
					player2.getPlayerNumberList().remove(Integer.valueOf(player2.getPlayerPickNum()));
					player2.getPlayerNumberList().add(0);
					if (player2.getPlayerPickNum() % 2 == 0) {
						ms.playMessage(31);// 플레이어2이 짝수카드제시
					} else {
						ms.playMessage(32);// 플레이어2이 홀수카드제시
					}
					if (player1.getPlayerPickNum() > player2.getPlayerPickNum()) {
						if (player1.getPlayerPickNum() == 9 && player2.getPlayerPickNum() == 1) {// 1이 9를이기는 룰 추가
							player2Score = player2Score + 1;
							player2.setPlayerScore(player2Score);
							System.out.println("╔═══════════════════════════════╗");
							System.out.println("║Player2님의 승! \t\t\t║");
							System.out.println("║\t       현재 스코어     \t\t║");
							System.out.println("║Player1\t\tPlayer2\t║");
							System.out.println("║   " + player1Score + "\t\t\t" + "   " + player2Score + "\t║");
							System.out.println("║\t  \t\t\t║");
							System.out.println("╚═══════════════════════════════╝");
							System.out.println();
							break;
						}
						player1Score = player1Score + 1;
						player1.setPlayerScore(player1Score);
						System.out.println("╔═══════════════════════════════╗");
						System.out.println("║Player1님의 승! \t\t\t║");
						System.out.println("║\t       현재 스코어     \t\t║");
						System.out.println("║Player1\t\tPlayer2\t║");
						System.out.println("║   " + player1Score + "\t\t\t" + "   " + player2Score + "\t║");
						System.out.println("║\t  \t\t\t║");
						System.out.println("╚═══════════════════════════════╝");
						System.out.println();
						break;

					} else if (player1.getPlayerPickNum() < player2.getPlayerPickNum()) {
						if (player1.getPlayerPickNum() == 1 && player2.getPlayerPickNum() == 9) {// 1이 9를이기는 룰 추가
							player1Score = player1Score + 1;
							player1.setPlayerScore(player1Score);
							System.out.println("╔═══════════════════════════════╗");
							System.out.println("║Player1님의 승! \t\t\t║");
							System.out.println("║\t       현재 스코어     \t\t║");
							System.out.println("║Player1\t\tPlayer2\t║");
							System.out.println("║   " + player1Score + "\t\t\t" + "   " + player2Score + "\t║");
							System.out.println("║\t  \t\t\t║");
							System.out.println("╚═══════════════════════════════╝");
							System.out.println();
							break;
						}
						player2Score = player2Score + 1;
						player2.setPlayerScore(player2Score);
						System.out.println("╔═══════════════════════════════╗");
						System.out.println("║Player2님의 승! \t\t\t║");
						System.out.println("║\t       현재 스코어     \t\t║");
						System.out.println("║Player1\t\tPlayer2\t║");
						System.out.println("║   " + player1Score + "\t\t\t" + "   " + player2Score + "\t║");
						System.out.println("║\t  \t\t\t║");
						System.out.println("╚═══════════════════════════════╝");
						System.out.println();
						break;
					} else {
						System.out.println("╔═══════════════════════════════╗");
						System.out.println("║무승부! \t\t\t\t║");
						System.out.println("║\t       현재 스코어     \t\t║");
						System.out.println("║Player1\t\tPlayer2\t║");
						System.out.println("║   " + player1Score + "\t\t\t" + "   " + player2Score + "\t║");
						System.out.println("║\t  \t\t\t║");
						System.out.println("╚═══════════════════════════════╝");
						System.out.println();
						break;
					}
				} else {
					System.out.println("잘못선택하셨습니다. 다시선택해주세요");
					p2count++;
				}
				
			} while (true);
		} // for문종료
		playGameResultInfo(player1, player2);
	}// 메서드종료

	public void playGameResultInfo(Player player, Computer com) {
		if (player.getPlayerScore() > com.getComScore()) {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║Player님의 최종 승리!! 축하합니다! \t║");
			System.out.println("║\t       총  스코어     \t\t║");
			System.out.println("║Player\t\t\tComputer║");
			System.out.println("║   " + player.getPlayerScore() + "\t\t\t" + "   " + com.getComScore() + "\t║");
			System.out.println("║\t  \t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
		} else if (player.getPlayerScore() < com.getComScore()) {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║Computer의 최종 승리!!  \t\t║");
			System.out.println("║\t       총  스코어     \t\t║");
			System.out.println("║Player\t\t\tComputer║");
			System.out.println("║   " + player.getPlayerScore() + "\t\t\t" + "   " + com.getComScore() + "\t║");
			System.out.println("║\t  \t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
		} else {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║무승부!!!  \t\t\t║");
			System.out.println("║\t       총  스코어     \t\t║");
			System.out.println("║Player\t\t\tComputer║");
			System.out.println("║   " + player.getPlayerScore() + "\t\t\t" + "   " + com.getComScore() + "\t║");
			System.out.println("║\t  \t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
		}
		do {
			System.out.println("한게임 더 하시겠습니까? Y/N");
			String endStr = scan.nextLine();
			if (endStr.equals("Y") || endStr.equals("y")) {
				setGame();
				break;
			} else if (endStr.equals("N") || endStr.equals("n")) {
				System.out.println("게임을 종료합니다. 감사합니다.");
				break;
			} else {
				System.out.println("잘못된 접근입니다. 다시 시도해주세요");
			}
		} while (true);
	}

	public void playGameResultInfo(Player player1, Player player2) {
		if (player1.getPlayerScore() > player2.getPlayerScore()) {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║" + player1.getPlayerName() + " 님의 최종 승리!! 축하합니다! \t║");
			System.out.println("║\t       총  스코어     \t\t║");
			System.out.println("║Player1\t\tPlayer2 ║");
			System.out.println("║   " + player1.getPlayerScore() + "\t\t\t" + "   " + player2.getPlayerScore() + "\t║");
			System.out.println("║\t  \t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
			System.out.println();
		} else if (player1.getPlayerScore() < player2.getPlayerScore()) {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║" + player2.getPlayerName() + " 님의 최종 승리!! 축하합니다! \t║");
			System.out.println("║\t       총  스코어     \t\t║");
			System.out.println("║Player1\t\tPlayer2 ║");
			System.out.println("║   " + player1.getPlayerScore() + "\t\t\t" + "   " + player2.getPlayerScore() + "\t║");
			System.out.println("║\t  \t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
			System.out.println();
		} else {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║무승부!!! \t\t\t║");
			System.out.println("║\t       총  스코어     \t\t║");
			System.out.println("║Player1\t\tPlayer2 ║");
			System.out.println("║   " + player1.getPlayerScore() + "\t\t\t" + "   " + player2.getPlayerScore() + "\t║");
			System.out.println("║\t  \t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
			System.out.println();
		}
		do {
			System.out.println("한게임 더 하시겠습니까? Y/N");
			String endStr = scan.nextLine();
			if (endStr.equals("Y") || endStr.equals("y")) {
				setGame();
				break;
			} else if (endStr.equals("N") || endStr.equals("n")) {
				System.out.println("게임을 종료합니다. 감사합니다.");
				break;
			} else {
				System.out.println("잘못된 접근입니다. 다시 시도해주세요");
			}
		} while (true);
	}
}
