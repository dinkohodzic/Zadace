package ba.bitcamp.vjezbeTask2;

public class Glass {

	private String liquid;
	private int currentCapacity;
	private int maxCapacity;

	public Glass(int maxCapacity) {
		super();
		this.liquid = null;
		this.currentCapacity = 0;
		this.maxCapacity = maxCapacity;
	}

	public String getLiquid() {
		return liquid;
	}

	

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void addLiquid(String newLiquid, int newCapacity) {
		if (this.liquid==null) {
			this.liquid = newLiquid;
			this.currentCapacity += newCapacity;
		}
		
		if (this.liquid.equals(newLiquid)) {
			this.currentCapacity += newCapacity;
		}
		if (this.currentCapacity + newCapacity > maxCapacity) {
			currentCapacity = maxCapacity;
		}

	}
	public void emtyGlass(){
		this.currentCapacity=0;
	}
}
