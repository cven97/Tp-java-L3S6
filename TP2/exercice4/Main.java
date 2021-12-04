package exercice4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(1,2);
		Rectangle r = new Rectangle(p, 2, 3);
		Rectangle t = new SlantedRectangle(p, 2, 3);
		SlantedRectangle s = new SlantedRectangle(p, 2, 3);
		
		System.out.println(r.surface()); // ne va pas être compiler car apele de la methode surface de la classe SlantedRectangle
										 // qui n'est pas disponible dans la classe Rectangle


		r.rotate(2); // ne va pas être compiler car apele de la methode rotation de la classe SlantedRectangle 
					 // qui n'est pas disponible dans la classe Rectangle

		System.out.println(r.contains(p)); // va être compiler et apeler la methode contains de la classe Rectangle 

		System.out.println(t.surface()); // ne va pas être compiler car apele de la methode surface de la classe SlantedRectangle
		 								// qui n'est pas disponible dans la classe Rectangle

		t.rotate(2); // ne va pas être compiler car apele de la methode rotate de la classe SlantedRectangle
		 			 // qui n'est pas disponible dans la classe Rectangle


		System.out.println(t.contains(p)); // va être compiler et apeler la methode contains de la classe SlantedRectangle
		 
		System.out.println(s.rotate(2)); // va être compiler et apeler la methode rotate de la classe SlantedRectangle
		System.out.println(s.contains(p)); // va être compiler et apeler la methode rotate redefinie de la classe SlantedRectangle

	}

}
