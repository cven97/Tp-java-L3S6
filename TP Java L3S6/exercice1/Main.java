package exercice1;

import exercice2.Point;
import exercice2.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(6,4);
		
		//System.out.println(p1.getX());
		//System.out.println(p1.getY());
		
		//p1.getPoint();
		
		
		Rectangle R1 = new Rectangle(p1, p2);
		
		Rectangle R2 = new Rectangle(p1, 12, 14);
		
		Rectangle R3 = new Rectangle(p1, 12, 13, 12, 13);
		
		
		
		System.out.println("\nRectengle 1 :\n");
		R1.getRectangle();
		
		System.out.println("\nRectengle 2 :\n");
		R2.getRectangle();
		
		System.out.println("\nRectengle 3 :\n");
		R3.getRectangle();
		
	}

}
