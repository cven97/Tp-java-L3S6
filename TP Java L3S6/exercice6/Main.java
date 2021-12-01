package exercice6;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Point p1 = new Point(0,2);
		Point p2 = new Point(1,1);
		Point p3 = new Point(-1,4);
		
		
		Rectangle[] R = new Rectangle[4];
		
		R[0] = new Rectangle(p1,12,12);
		R[1] = new Rectangle(p2,24,22);
		R[2] = new Rectangle(p1,22,45);
		R[3] = new Rectangle(p3,22,50);
	
		
		//System.out.println(R.length);
		
		Rectangle R2 =  hull(R);
		System.out.println("Le rectangle anglobant l'ensemble des rectangle du tableaux R est :\n");
		R2.getRectangle();
		
	}
	
	
	
public static Rectangle hull(Rectangle[] tabRect){
	
	Point p = baseRectangle(tabRect);
		
	return new Rectangle(p,longeurRectangle(tabRect), largeurRectangle(tabRect));
	}

	public static float longeurRectangle(Rectangle[] listRect){
		Boolean val;
		float longueur =0 ;
		
		for (int i = 0; i < listRect.length; i++) {
			
			val = true;
			
			for (int j = 0; j < listRect.length; j++) {
				if(listRect[i].getPointBase().getX() +  listRect[i].getDimensionH1()
						< listRect[j].getPointBase().getX() + listRect[j].getDimensionH1()){
					val = false;
				}
			}
			
			if(val){
				longueur = listRect[i].getDimensionH1();
				break;
			}
			
		}
		
		return longueur;
}
	public static float largeurRectangle(Rectangle[] listRect){
		Boolean val;
		float largeur =0 ;
		
		for (int i = 0; i < listRect.length; i++) {
			
			val = true;
			
			for (int j = 0; j < listRect.length; j++) {
				if(listRect[i].getPointBase().getY() +  listRect[i].getDimensionV1()
						< listRect[j].getPointBase().getY() + listRect[j].getDimensionV1()){
					val = false;
				}
			}
			
			if(val){
				largeur = listRect[i].getDimensionV1();
				break;
			}
			
		}
		
		return largeur;
}
	
	public static Point baseRectangle(Rectangle[] listRect){
		
		Boolean val;
		float x =0 ;
		float y =0 ;
		
		for (int i = 0; i < listRect.length; i++) {
			
			val = true;
			
			for (int j = 0; j < listRect.length; j++) {
				if(listRect[i].getPointBase().getX() > listRect[j].getPointBase().getX()){
					val = false;
				}
			}
			
			if(val){
				x = listRect[i].getPointBase().getX();
				break;
			}
			
		}
		
		for (int i = 0; i < listRect.length; i++) {
			
			val = true;
			
			for (int j = 0; j < listRect.length; j++) {
				if(listRect[i].getPointBase().getY() > listRect[j].getPointBase().getY()){
					val = false;
				}
			}
			
			if(val){
				y = listRect[i].getPointBase().getY();
				break;
			}
			
		}
		
		Point p = new Point(x,y);
		
		return p;
		
	}

}
