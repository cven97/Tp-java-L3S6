package exercice6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(1,2);
		//float angle = 90;
		
		Rectangle R = new Rectangle(p, 12,20);
		
		
		SlantedRectangle Rect = new SlantedRectangle(p, 12, 300);
		
		Rect.getRectangle();
		
		System.out.print(R.toString());
		System.out.print(Rect.toString());
		

	}

}
