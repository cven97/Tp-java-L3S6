package exercice3;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(5,10);
		
		
		Rectangle R = new Rectangle(p1, 12, 20);
		Rectangle R2 = new Rectangle(p2, 9, 12);
		
		if(R.contains(p2))
			System.out.println("P2 est a l'interieur du rectangle R.");
		else
			System.out.println("P2 n'est pas a l'interieur du rectangle R.");
		
		if(R.contains(R2))
			System.out.println("R2 est a l'interieur du rectangle R.");
		else
			System.out.println("R2 n'est pas a l'interieur du rectangle R.");
	}

}
