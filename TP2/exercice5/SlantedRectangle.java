// Créer par LOMPO Laurent Licence 3 informatique Université Joseph-KI ZERBO 2021

package exercice5;



public class SlantedRectangle extends Rectangle {
	
	private float angle;
	
	
	// Contructeur SlantedRectangle avec deux point
	
	public SlantedRectangle(Point p1, Point p2) {
		
		super(p1, p2);
		this.setAngle(0);
	}
	
	// Contructeur SlantedRectangle avec un point et deux longueur
	
	public SlantedRectangle(Point p, float longueur, float largeur) {
		
		super(p, longueur, largeur);
		//this.setAngle(0);
	}

	// Contructeur SlantedRectangle avec deux et 4 longueurs
	
	public SlantedRectangle(Point p, float longueur1, float longueur2,
			float longueur3, float longueur4) {
		super(p, longueur1, longueur2, longueur3, longueur4);
		this.setAngle(0);
	}
	
	
	public Boolean rotation(float angle){ // rotation du rectangle
		
		this.setAngle( this.getAngle() + angle );
		return true;
	}
	
	public Boolean translation(Point V){ // trnaslation du rectangle
		
		super.translate(V);
		
		return true;
	}
	
	public Boolean translationRotation(Point V, float angle){ // trnaslation et rotation du rectangle
		
		this.rotation(angle);
		
		this.translate(V);
		
		return true;
		
	}
	
	public void setAngle(float angle) { // Modifier angle rectangle
		this.angle = angle;
	}
	
	public float getAngle() { // Obtenir angle rectangle
		return angle;
	}
	
	public void getRectangle(){
		super.getRectangle();            
		System.out.println("            angle     : "+ this.getAngle());
	}

}
