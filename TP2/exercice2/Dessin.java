// Créer par LOMPO Laurent Licence 3 informatique Université Joseph-KI ZERBO 2021

package exercice2;

public class Dessin {
	private int taille;
	private int nbrRectangleInsere = 0;
	private Rectangle[] tabRectangle;
	private Rectangle hullRect;
	
	public Dessin(){
		this.setTaille(0);
	}
	
	public Dessin(int n) {
		this.setTaille(n);
		this.tabRectangle = new Rectangle[n];
	}
	
	// Methode 
	
	
	//Methode Hull 
	
	public Rectangle hull(){
		
		Point p = baseRectangle();
			
		return new Rectangle(p,longeurRectangle(), largeurRectangle());
	}


	public float longeurRectangle(){
		Boolean val;
		float longueur =0 ;
		
		for (int i = 0; i < getNbrRectangleInsere(); i++) {
			
			val = true;
			
			for (int j = 0; j < getNbrRectangleInsere(); j++) {
				if(getTabRectangle()[i].getPointBase().getX() +  getTabRectangle()[i].getDimensionH1()
						< getTabRectangle()[j].getPointBase().getX() + getTabRectangle()[j].getDimensionH1()){
					val = false;
				}
			}
			
			if(val){
				longueur = getTabRectangle()[i].getDimensionH1();
				break;
			}
			
		}
		
		return longueur;
	}
		
		public float largeurRectangle(){
			Boolean val;
			float largeur =0 ;
			
			for (int i = 0; i < getNbrRectangleInsere(); i++) {
				
				val = true;
				
				for (int j = 0; j < getNbrRectangleInsere(); j++) {
					if(getTabRectangle()[i].getPointBase().getY() +  getTabRectangle()[i].getDimensionV1()
							< getTabRectangle()[j].getPointBase().getY() + getTabRectangle()[j].getDimensionV1()){
						val = false;
					}
				}
				
				if(val){
					largeur = getTabRectangle()[i].getDimensionV1();
					break;
				}
				
			}
			
			return largeur;
	}
		
		public Point baseRectangle(){
			
			Boolean val;
			float x =0 ;
			float y =0 ;
			
			for (int i = 0; i < getNbrRectangleInsere(); i++) {
				
				val = true;
				
				for (int j = 0; j < getNbrRectangleInsere(); j++) {
					if(getTabRectangle()[i].getPointBase().getX() > getTabRectangle()[j].getPointBase().getX()){
						val = false;
					}
				}
				
				if(val){
					x = getTabRectangle()[i].getPointBase().getX();
					break;
				}
				
			}
			
			for (int i = 0; i < getNbrRectangleInsere(); i++) {
				
				val = true;
				
				for (int j = 0; j < getNbrRectangleInsere(); j++) {
					if(getTabRectangle()[i].getPointBase().getY() > getTabRectangle()[j].getPointBase().getY()){
						val = false;
					}
				}
				
				if(val){
					y = getTabRectangle()[i].getPointBase().getY();
					break;
				}
				
			}
			
			Point p = new Point(x,y);
			
			return p;
			
		}
	
	// Methode pour Calculer la surface du dessin
	
	public float calculSurface(){
		
		float surface = 0;
		
		for(int i = 0; i<this.getNbrRectangleInsere(); i++){
			surface += tabRectangle[i].calculSurface();
			System.out.println(surface);
		}
		
		return surface;
	}
	
	public Boolean translate(Point V){
		
		
		for(int i = 0; i < this.getNbrRectangleInsere(); i++){
			tabRectangle[i].translate(V);
		}
		
		return true;
	}
	
	
	// Methode pour ajouter un rectangle a un dessin
	
		public Boolean add(Rectangle R){
			
			Boolean val = false;
			
			if(this.getNbrRectangleInsere() < this.getTaille()){
				
				this.tabRectangle[this.getNbrRectangleInsere()] = R;
				setNbrRectangleInsere();
				val = true;
			}
			
			this.setHullRect(this.hull());
			
			return val;
		}
		
		// Mehode pour recuperer les rectangles d'un dessin  

		public void getDessin(){ 
			int n;
			for (int i = 0; i < this.getNbrRectangleInsere(); i++) {
				n = i + 1;
				System.out.println("\n\nRectangle ["+n+"]\n");
				this.tabRectangle[i].getRectangle();
				
			}
		}
		

	public int getTaille() {  // obtetir la taille du dessin
		return taille;
	}

	public void setTaille(int taille) { // Modifier la taille du dessin
		this.taille = taille;
	}
	
	public int getNbrRectangleInsere() { // obtetir le nombre de rectangle du dessin
		return nbrRectangleInsere;
	}
	
	public void setNbrRectangleInsere() { // Modifier le nombre de rectangle du dessin
		this.nbrRectangleInsere += 1;
	}

	public Rectangle[] getTabRectangle() { // obtenir les rectangles du dessin
		return tabRectangle;
	}

	public Rectangle getHullRect() { // obtenir le rectangle hull du dessi
		return hullRect;
	}

	public void setHullRect(Rectangle hullRect) { // Modifier le rectangle hull du dessi
		this.hullRect = hullRect;
	}

	
	
	
	
	

}
