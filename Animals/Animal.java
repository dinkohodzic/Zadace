public class Animal {

	private String name;
	private String sound;

	public Animal(String sound, String name) {
		super();
		this.sound = sound;
		this.name = name;

	}

	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Sound: " + sound + "\n";

		return s;
	}

}
