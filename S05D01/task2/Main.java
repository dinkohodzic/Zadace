package task2;

public class Main {

	public static void main(String[] args) {
		// Creating new Animals
		Animal animal1 = new Animal("Animal 1", 1, 1);
		Animal animal2 = new Animal("Animal 2", 2, 3);
		// Initializing values for habitat
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		// Printing
		System.out.println(animal1);
		System.out.println(animal2);
		Animal.setDayNight();
		Animal.setHabitat(c);
		System.out.println(animal1);
		System.out.println(animal2);

	}

}
