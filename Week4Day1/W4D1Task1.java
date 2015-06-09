package zadaci;

public class W4D1Task1 {

	public static void main(String[] args) {

		System.out.println(convertToKelvins(100));
		System.out.println(convertToKelvins(15.85));
		System.out.println(convertToKelvins(-15.15));
	}

	/**
	 * <h1>Converts degrees from Celsius to Kelvin</h1>
	 * @param celsius
	 * @return the converted value in Kelvins
	 */
	public static double convertToKelvins(double celsius) {
		
		double kelvin = celsius + 273.15;
		
		return kelvin;
	}

}
