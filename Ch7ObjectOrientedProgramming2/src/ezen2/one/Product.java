package ezen2.one;

public class Product {
	public int price; // 제품의 가격
	public int bonusPoint; // 제품구매 시 제공하는 보너스점수


	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
	}
	
}
