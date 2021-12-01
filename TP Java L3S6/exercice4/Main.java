package exercice4;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		
		Rectangle R1 = new Rectangle(p1, 12, 20);
		Rectangle R2 = new Rectangle(p2, 12, 20);
		
		if(R1.sameAs(R2))
			System.out.println("R2 est egale au rectangle R1");
		else
			System.out.println("R2 n'est pas egale au rectangle R1");
				
		
	}

}
