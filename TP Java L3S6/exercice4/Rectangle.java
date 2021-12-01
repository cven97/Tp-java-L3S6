package exercice4;


public class Rectangle {
	
	private Point pointBase;
	private float dimensionH1 = 0;
	private float dimensionH2 = 0;
	private float dimensionV1 = 0;
	private float dimensionV2 = 0;
	
	public Rectangle(Point p1, Point p2) {
		
		this.setPointBase(p1);
		
		if(p2.getX() - p1.getX() > 0 && p2.getY() - p1.getY() > 0){
			
			
			this.setDimensionH1(p2.getX() - p1.getX());
			this.setDimensionV1(p2.getY() - p1.getY());
			
			this.setDimensionH2(p2.getX() - p1.getX());
			this.setDimensionV2(p2.getY() - p1.getY());
		}
		else
			System.out.println("Les points doivent etre different ! ");
		
	}
	
	public Rectangle(Point p, float longueur, float largeur) {
		
		this.setPointBase(p);
		
		if(longueur > 0 && largeur > 0){
			
			this.setDimensionH1(longueur);
			this.setDimensionH2(longueur);
			
			this.setDimensionV1(largeur);
			this.setDimensionV2(largeur);
		}
		else
			System.out.println("Les longueurs doivent etre superieur a zero ! ");
	}
	
	public Rectangle(Point p, float longueur1, float longueur2, float longueur3, float longueur4 ) {
		
		this.setPointBase(p);
		
		if(longueur1 > 0 && longueur2 > 0 && longueur3 > 0 && longueur4 > 0){
			
			this.setDimensionH1(longueur1);
			this.setDimensionH2(longueur2);
			this.setDimensionV1(longueur3);
			this.setDimensionV2(longueur4);
		}
		else
			System.out.println("Les longueurs doivent etre superieur a zero ! ");
	}
	
	/********************* Methodes ****************************/
	
	public Boolean sameAs(Rectangle R){
		
		Boolean val = false;
		
		if(this.getDimensionH1() == R.getDimensionH1() && this.getDimensionV1() == R.getDimensionV1()
				&& this.getDimensionH2() == R.getDimensionH2() && this.getDimensionV2() == R.getDimensionV2())
			val = true;
		
		return val;
		
	}
	
	public Boolean contains(Point p){
		float x = p.getX() - this.getPointBase().getX();
		float y = p.getY() - this.getPointBase().getY();
		
		if(x >= 0 && y >= 0 && x <= this.dimensionH1 && y <= this.dimensionV1)
			return true;
		else
			return false;
	}
	
	public Boolean contains(Rectangle R){
		
		Boolean val = false;
		
		if(this.contains(R.getPointBase())){
			
			if(this.getDimensionH1() >= R.getDimensionH1() && this.getDimensionV1() >= R.getDimensionV1())
				val = true;
		}
		
		return val;
		
	}
	
	public float calculSurface(){
		return this.dimensionH1*this.dimensionH2;
	}
	
	public void translate(Point p){
		
		float x = pointBase.getX() + p.getX();
		
		float y = pointBase.getY() + p.getY();
		
		pointBase.setX(x);
		
		pointBase.setY(y);
	}
	
	// fonction get set DimensionH1
	
	public float getDimensionH1() {
		return dimensionH1;
	}

	public void setDimensionH1(float dimensionH1) {
		this.dimensionH1 = dimensionH1;
	}

	// fonction get set DimensionH2
	
	public float getDimensionH2() {
		return dimensionH2;
	}

	public void setDimensionH2(float dimensionH2) {
		this.dimensionH2 = dimensionH2;
	}
	
	// fonction get set DimensionV1

	public float getDimensionV1() {
		return dimensionV1;
	}

	public void setDimensionV1(float dimensionV1) {
		this.dimensionV1 = dimensionV1;
	}
	
	// fonction get set DimensionV2

	public float getDimensionV2() {
		return dimensionV2;
	}

	public void setDimensionV2(float dimensionV2) {
		this.dimensionV2 = dimensionV2;
	}

	
	// fonction get set PointBase
	
	public Point getPointBase() {
		return pointBase;
	}

	public void setPointBase(Point pointBase) {
		this.pointBase = pointBase;
	}
	
	
	/*********** autre **********************/
	
	public void getRectangle(){
		System.out.println("Donnees : \n");
		System.out.println("Point rectangle : ");
		
		pointBase.getPoint();
		
		System.out.println("\nDimension : ");
		
		System.out.println("            longueur1 : " + getDimensionH1());
		System.out.println("            largeur1  : " + getDimensionV1());
		System.out.println("            longueur2 : " + getDimensionH2());
		System.out.println("            largeur2  : " + getDimensionV2());
		
	}
	

}
