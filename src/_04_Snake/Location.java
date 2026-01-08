package _04_Snake;

public class Location {
	
	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public Boolean equals(Location loc) {
		if(this.x == loc.x && this.y == loc.y) {
			return true;
		}else {
			return false;
		}	
	}
}
