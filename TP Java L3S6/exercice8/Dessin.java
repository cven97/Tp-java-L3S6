// Créer par LOMPO Laurent Licence 3 informatique Université Joseph-KI ZERBO 2021

package exercice8;

public class Dessin {
	private int taille;
	private int nbrRectangleInsere = 0;
	private Rectangle[] tabRectangle;
	
	public Dessin(){
		this.setTaille(0);
	}
	
	public Dessin(int n) {
		this.setTaille(n);
		this.tabRectangle = new Rectangle[n];
	}
	
	// Methode 
	
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
			
			return val;
		}
		
		//Mehode pour recuperer les rectangles d'un dessin  

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

	public Rectangle[] getTabRectangle() { // obtenir les rectangle du dessin
		return tabRectangle;
	}

	
	
	
	
	

}
