package exercice2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(6,4);
		
		//System.out.println(p1.getX());
		//System.out.println(p1.getY());
		
		//p1.getPoint();
		
		
		//Rectangle R1 = new Rectangle(p1, p2);
		
		Rectangle R2 = new Rectangle(p1, 12, 13);
		
		
		Rectangle R3 = new Rectangle(p1, 12, 13, 12, 13);
		
		
		
		/*
		 * System.out.println("\nRectengle 1 :\n");
		R1.getRectangle();
		
		System.out.println("\nRectengle 2 :\n");
		R2.getRectangle();
		
		*/
		
		//System.out.println("\nRectengle 3 :\n");
		//R3.getRectangle();
		
		//System.out.println("surface du rectangle 3 = " + R3.calculSurface());
		
		
		// translation d'un rectangle 
		
		/*
		System.out.println("Rectengle 3 avant translation:\n");
		R3.getPointBase().getPoint();
		
		R3.translate(p2);
		
		
		System.out.println("\nRectengle 3 apres translation:\n");
		R3.getPointBase().getPoint();
		/*
		
		
		//*** translation de deux rectangles ayant le meme point de base ******/
		
		System.out.println("Rectengle 2 avant translation de R3:\n");
		R2.getPointBase().getPoint();
		
		R3.translate(p2);
		
		System.out.println("\nRectengle 2 apres translation de R3:\n");
		R2.getPointBase().getPoint();
		
	}

}
