package Homework;

public class Main_Animal {
	public static void main(String[] args) {
		Animal animal = new Animal ("Leopard", 20, 7);
		System.out.print("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���, ³� ������� = " + animal.getAge() + " ����\n");
		animal.setAge(14);
		animal.setName("Bull");
		animal.setSpeed(2);
		System.out.print("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���, ³� ������� = " + animal.getAge() + " ����\n");
	}
}
