// Créer par LOMPO Laurent Licence 3 informatique Université Joseph-KI ZERBO 2021

package exercice3;





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
	
	/*********************** REDEFINITION DES METHODES  **********************************/ 
	
	
public Boolean sameAs(SlantedRectangle R){
		
		Boolean val = false;
		
		if(super.getDimensionH1() == R.getDimensionH1() && super.getDimensionV1() == R.getDimensionV1()
				&& super.getDimensionH2() == R.getDimensionH2() && super.getDimensionV2() == R.getDimensionV2())
			val = true;
		
		return val;
		
	}
	
	public Boolean contains(Point p){
		float x = p.getX() - super.getPointBase().getX();
		float y = p.getY() - super.getPointBase().getY();
		
		if(x >= 0 && y >= 0 && x <= super.getDimensionH1() && y <= super.getDimensionV1())
			return true;
		else
			return false;
	}
	
	public Boolean contains(SlantedRectangle R){
		
		Boolean val = false;
		
		if(super.contains(R.getPointBase())){
			
			if(super.getDimensionH1() >= R.getDimensionH1() && super.getDimensionV1() >= R.getDimensionV1())
				val = true;
		}
		
		return val;
		
	}
	
	
	
	
	
	public float surface(){ // calcul de surface
		return super.calculSurface();
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
