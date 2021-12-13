package exercice11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(1,2);
		//float angle = 90;
		
		Rectangle R = new Rectangle(p, 12,20);
		Rectangle R2 = new Rectangle(p, 15,20);
		
		
		SlantedRectangle Rect = new SlantedRectangle(p, 12, 300);
		SlantedRectangle Rect2 = new SlantedRectangle(p, 12, 100);
		
		Rect.rotate(12);
		
		Rect2.rotate(12);
		
		Rect.getRectangle();
		
		System.out.print(Rect.equals(Rect2));
		

	}

}
