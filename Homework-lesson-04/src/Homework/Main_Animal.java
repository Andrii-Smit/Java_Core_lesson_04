package Homework;

public class Main_Animal {
	public static void main(String[] args) {
		Animal animal = new Animal ("Leopard", 20, 7);
		System.out.print("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років\n");
		animal.setAge(14);
		animal.setName("Bull");
		animal.setSpeed(2);
		System.out.print("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років\n");
	}
}
