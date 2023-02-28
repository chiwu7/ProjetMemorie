package application;

public class Carte {

	//Chemin vers l'image de la carte
	private String chemin;
	//Indique si la carte est retournée ou non
	private boolean retournee;
	
	/*
	 * Constructeur d'une carte
	 * @param chemin : chemin vers l'image de la carte
	 * @return retourne une carte retournée
	 */
	public Carte(String chemin) {
		this.chemin = chemin;
		this.retournee = false;
	}
	
	/*
	 * Modifie l'image de la carte
	 * @param chemin : chemin vers l'image de la carte
	 */
	public void setChemin (String chemin) {
		this.chemin = chemin;
	}
	
	/*
	 * Donne l'état de la carte (retournée ou non)
	 * @return vrai ssi la carte est retourne 
	 */
	public boolean getRetournee() {
		return retournee;
	}
	
	/*
	 * Défini l'état de la carte
	 * @param retournee : l'état de la carte, vrai ssi la carte est retourne, sinon faux
	 */
	public void setRetournee(boolean retournee) {
		this.retournee = retournee;
	}
}
