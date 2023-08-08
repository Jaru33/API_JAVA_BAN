package blackandwhite;

public class Message {
	
	public void startMessage() {
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("║╔═══════════════════════════════╗║");
		System.out.println("║║ 더 지니어스 흑과 백 게임 시작하겠습니다.\t ║║");
		System.out.println("║╚═══════════════════════════════╝║");
		System.out.println("╚═════════════════════════════════╝");
	}
	
	public void setMessage(int num) {
		if(num ==0) {
			System.out.println("╔═════════════════════════════════╗");
			System.out.println("║게임 타입을 정해주세요.\t\t  ║");
			System.out.println("║1. PLAYER vs COM\t\t  ║");
			System.out.println("║2. PLAYER vs PLAYER\t\t  ║");
			System.out.println("║3. END\t\t\t\t  ║");
			System.out.println("╚═════════════════════════════════╝");
		}else if(num ==1){
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║1.PLAYER vs COM 를 선택하셨습니다.\t║");
			System.out.println("╚═══════════════════════════════╝");
		}else if(num ==2){
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║2.PLAYER vs PLAYER를 선택하셨습니다\t║");
			System.out.println("║참가하실 Player1 이름을 입력해주세요.\t║");
			System.out.println("╚═══════════════════════════════╝");
		}else if(num ==21){
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║참가하실 Player2 이름을 입력해주세요.\t║");
			System.out.println("╚═══════════════════════════════╝");
		}else if(num ==3) {
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║3. END 를 선택하셨습니다.\t\t║");
			System.out.println("║게임을 종료합니다.\t\t\t║");
			System.out.println("╚═══════════════════════════════╝");
		}else if(num ==4) {
			System.out.println("잘못 입력하였습니다.");
			System.out.println("다시입력해주세요.");
		}else if(num ==11){
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║게임을 시작하겠습니다.\t\t║");
			System.out.println("╚═══════════════════════════════╝");
		}else if(num ==22){
			System.out.println("╔═══════════════════════════════╗");
			System.out.println("║2.Player들의 이름설정이 끝났습니다.\t║");
			System.out.println("║게임을 시작하겠습니다.\t\t║");
			System.out.println("╚═══════════════════════════════╝");
		}
	}
	public void playMessage(int num1) {
			if(num1 == 11) {
				System.out.println("╔═══════════════════════════════╗");
				System.out.println("║\t  ┏━━━┓\t\t\t║");
				System.out.println("║컴퓨터가 \t  ┃ 흑 ┃ 을 제시했습니다.\t║");
				System.out.println("║\t  ┗━━━┛\t\t\t║");
				System.out.println("╚═══════════════════════════════╝");
			}else if(num1 == 12) {
				System.out.println("╔═══════════════════════════════╗");
				System.out.println("║\t  ┏━━━┓\t\t\t║");
				System.out.println("║컴퓨터가 \t  ┃ 백 ┃ 을 제시했습니다.\t║");
				System.out.println("║\t  ┗━━━┛\t\t\t║");
				System.out.println("╚═══════════════════════════════╝");
			}else if(num1 == 21) {
				System.out.println("╔═══════════════════════════════╗");
				System.out.println("║\t  ┏━━━┓\t\t\t║");
				System.out.println("║player1가 ┃ 흑 ┃ 을 제시했습니다.\t║");
				System.out.println("║\t  ┗━━━┛\t\t\t║");
				System.out.println("╚═══════════════════════════════╝");
			}else if(num1 == 22) {
				System.out.println("╔═══════════════════════════════╗");
				System.out.println("║\t  ┏━━━┓\t\t\t║");
				System.out.println("║player1가 ┃ 백 ┃ 을 제시했습니다.\t║");
				System.out.println("║\t  ┗━━━┛\t\t\t║");
				System.out.println("╚═══════════════════════════════╝");
			}else if(num1 == 31) {
				System.out.println("╔═══════════════════════════════╗");
				System.out.println("║\t  ┏━━━┓\t\t\t║");
				System.out.println("║player2가 ┃ 흑 ┃ 을 제시했습니다.\t║");
				System.out.println("║\t  ┗━━━┛\t\t\t║");
				System.out.println("╚═══════════════════════════════╝");
			}else if(num1 == 32) {
				System.out.println("╔═══════════════════════════════╗");
				System.out.println("║\t  ┏━━━┓\t\t\t║");
				System.out.println("║player2가 ┃ 백 ┃ 을 제시했습니다.\t║");
				System.out.println("║\t  ┗━━━┛\t\t\t║");
				System.out.println("╚═══════════════════════════════╝");
			}
			
	}
	
}
