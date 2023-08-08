package one;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		Rabbit rabbit = new Rabbit();
		Cat cat = new Cat();
		
		dog.leg = 4;
		dog.mouth = "입";
		dog.eatSound = "와구와구";
		
		dog.work();
		dog.run();
		dog.eat();
		System.out.println();
		rabbit.leg = 4;
		rabbit.mouth = "입";
		rabbit.eatSound = "뇸뇸";
		
		rabbit.work();
		rabbit.run();
		rabbit.eat();
		System.out.println();
		
		cat.leg = 4;
		cat.mouth = "입";
		cat.eatSound = "냥냥";
		
		cat.work();
		cat.run();
		cat.eat();
		cat.sleep();
	}

}
