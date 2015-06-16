package ba.bitcamp.vjezbeTask1;

public class Temperature {

	private double temp;

	// Default constructor
	public Temperature(double temp) {
		super();
		this.temp = temp;

	}

	public Temperature(Temperature newTemp) {
		this.temp = newTemp.temp;
	}

	// Gets the temperature
	public double getTemp() {
		return temp;
	}

	// Sets the temperature
	public void setTemp(double temp) {
		this.temp = temp;
	}

	/**
	 * Returns the temperature in Celsius
	 * 
	 * @return The temperature in Celsius
	 */
	public double getTemperatureInC() {
		
		return temp;
	}

	/**
	 * Returns the temperature in Kelvin
	 * 
	 * @return The temperature in Kelvin
	 */
	public double getTemperatureInK() {
		return temp + 273.15;
	}

	/**
	 * Returns the temperature in Farenheit
	 * 
	 * @return Temperature in Farenheit
	 */
	public double getTemperatureInF() {
		return this.temp + 32;
	}

	public String toString() {
		return "The temperature is: " + temp;
	}

}
