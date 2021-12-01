package exercice7;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dessin D = new Dessin(4);
		
		
		Point p1 = new Point(0,2);
		//Point p2 = new Point(1,1);
		//Point p3 = new Point(-1,4);
		Rectangle R = new Rectangle(p1,12,10);
		
		if(D.add(R))
			System.out.println("Rectangle inseré !");
		else
			System.out.println("Rectangle ne peut pas etre inseré !");
		
		
		
		if(D.add(R))
			System.out.println("Rectangle inseré !");
		else
			System.out.println("Rectangle ne peut pas etre inseré !");
		
		
		D.getDessin();
	}
}
