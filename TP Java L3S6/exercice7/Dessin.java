package exercice7;

public class Dessin {
	private int taille;
	private int nbrRectangleInsere = 0;
	private Rectangle[] tabRectangle;
	
	public Dessin(int n) {
		this.setTaille(n);
		this.tabRectangle = new Rectangle[n];
	}
	
	// Methode

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public int getNbrRectangleInsere() {
		return nbrRectangleInsere;
	}
	
	public void setNbrRectangleInsere() {
		this.nbrRectangleInsere += 1;
	}

	public Rectangle[] getTabRectangle() {
		return tabRectangle;
	}
	
	public Boolean add(Rectangle R){
		
		Boolean val = false;
		
		if(this.getNbrRectangleInsere() < this.getTaille()){
			
			this.tabRectangle[this.getNbrRectangleInsere()] = R;
			setNbrRectangleInsere();
			val = true;
		}
		
		return val;
	}

	public void getDessin(){
		int n;
		for (int i = 0; i < this.getNbrRectangleInsere(); i++) {
			n = i + 1;
			System.out.println("\n\nRectangle ["+n+"]\n");
			this.tabRectangle[i].getRectangle();
			
		}
	}
	
	
	
	

}
