package blackandwhite;

import java.util.ArrayList;
import java.util.Collections;

public class Computer {
	
	private ArrayList<Integer> computerNumberList = new ArrayList<Integer>();
	private String comName = "컴퓨터";
	private int comPickNum = 0;
	private boolean winner = false;
	private int comScore = 0;
	
	
	public Computer() {
		super();
		this.comName = "컴퓨터";
		this.comScore = 0;
		this.comPickNum = 0;
		setComputerNumberList(computerNumberList);//컴퓨터 생성시 번호생성
		
	}

	public ArrayList<Integer> getComputerNumberList() {
		return computerNumberList;
	}
	
	public void setComputerNumberList(ArrayList<Integer> computerNumberList) {
		for (int i = 0; i < 9; i++) {
			computerNumberList.add(i+1);
		}
		for (int i = 0; i < 5; i++) {//컴퓨터 번호 섞기
			Collections.shuffle(computerNumberList);
		}
	}

	public int getComPickNum() {
		return comPickNum;
	}

	public void setComPickNum(int comPickNum) {
		this.comPickNum = comPickNum;
	}

	public int getComScore() {
		return comScore;
	}

	public void setComScore(int comScore) {
		this.comScore = comScore;
	}

	@Override
	public String toString() {
		return "Computer [computerNumberList=" + computerNumberList + ", comName="
				+ comName + ", comPickNum=" + comPickNum + ", winner=" + winner 
				+ ", comScore=" + comScore + "]";
	}

	

	
	
}
