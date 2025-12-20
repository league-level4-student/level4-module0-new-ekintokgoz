package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID, LIQUID, GAS;
	
	private int celsiusTemp;

	public int getCelsiusTemp() {
		return celsiusTemp;
	}

	public void setCelsiusTemp(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
}
