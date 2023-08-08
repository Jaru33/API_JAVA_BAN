package blackandwhite;

import java.util.ArrayList;

public class Player {

	private String playerName = "";
	private ArrayList<Integer> playerNumberList = new ArrayList<Integer>();
	private int playerPickNum = 0;
	private boolean winner = false;
	private int playerScore = 0;
	
//	생성자 맴버변수 초기화
	public Player() {
		super();
		this.winner = false;
		this.playerPickNum = 0;
		this.playerScore = 0;
		setPlayerNumberList(playerNumberList);
	}
	
	public Player(String playerName) {
		super();
		this.playerName = playerName;
		this.winner = false;
		this.playerPickNum = 0;
		this.playerScore = 0;
		setPlayerNumberList(playerNumberList);
	}

	public ArrayList<Integer> getPlayerNumberList() {
		return playerNumberList;
	}

	public void setPlayerNumberList(ArrayList<Integer> playerNumberList) {
		for (int i = 0; i < 9; i++) { // 사용할수있는 초기번호 지정
			playerNumberList.add(i+1);
		}
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerPickNum() {
		return playerPickNum;
	}

	public void setPlayerPickNum(int playerPickNum) {
		this.playerPickNum = playerPickNum;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	
	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerNumberList=" 
				+ playerNumberList + ", playerPickNum=" + playerPickNum + ", "
						+ "winner=" + winner + ", playerScore=" + playerScore + "]";
	}

	
	

	
	
	
}
