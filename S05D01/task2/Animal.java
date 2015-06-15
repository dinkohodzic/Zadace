package task2;

public class Animal {
	// Attributes
	private String name;
	private Integer active;
	private Integer drinksWater;
	private static Integer timeOfDay;
	private static Integer habitat;

	// Constructor
	public Animal(String name, Integer active, Integer drinksWater) {
		super();
		this.name = name;
		this.active = active;
		this.drinksWater = drinksWater;
		this.timeOfDay = 1;
		this.habitat = 1;
	}

	// toString method
	public String toString() {
		String s = "";
		if (this.active.equals(this.timeOfDay)
				&& this.habitat >= this.drinksWater) {
			s = "It's fine. The animal is active and has enough water.";
		} else if (this.active.equals(this.timeOfDay)
				&& this.habitat < this.drinksWater) {
			s = "The animal is active, but needs more water.";
		} else if (this.active != this.timeOfDay
				&& this.habitat >= this.drinksWater) {
			s = "The animal is not active, but has enough water.";
		} else {
			s = "The animal is not active and it does not have enough water.";
		}
		return s;
	}

	/**
	 * This method changes the status between day and night
	 */
	public static void setDayNight() {
		if (Animal.timeOfDay == 1) {
			Animal.timeOfDay = 2;
		} else {
			Animal.timeOfDay = 1;
		}
	}

	/**
	 * Sets the habitat (the amount of water)
	 * 
	 * @param habitat
	 */
	public static void setHabitat(Integer habitat) {
		Animal.habitat = habitat;
	}

}
