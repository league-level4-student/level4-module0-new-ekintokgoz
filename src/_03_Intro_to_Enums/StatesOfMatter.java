package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0), LIQUID((int) 25.55), GAS(100);
	
	int celsiusTemp;
	
	private StatesOfMatter(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	
	public int getCelsiusTemp() {
		return celsiusTemp;
	}

	public void setCelsiusTemp(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	
	public int convertToFarenheit() {
		return ((celsiusTemp * 9/5) + 32);		
	}
	}
