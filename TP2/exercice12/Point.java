// Cr?er par LOMPO Laurent Licence 3 informatique Universit? Joseph KI-ZERBO 2021

package exercice12;

public class Point {

	private float x;
	private float y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void getPoint(){
		System.out.println("X = " + this.x + " | Y = " + this.y);
	}
	
}
