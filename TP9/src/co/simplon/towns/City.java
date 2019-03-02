package co.simplon.towns;

/** 
 * 
 * @author Mohamed El babili
 */

public class City {
	private String name;
	private String state;
	private int nbInhabitant;
	
	public static int nbInstance = 0;	//attribut de classe pour calculer le nombre d'instance
	
	//Constructeur avec 3 arguments
	public City(String name, String state, int nbInhabitant) {
		this.name = name;
		this.state = state;
		this.nbInhabitant = nbInhabitant;
		nbInstance++;
	}
	//Constructeur sans arguments
	public City() {
		this.name = "";		this.state = "";	this.nbInhabitant = 0;		nbInstance++;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getNbInhabitant() {
		return nbInhabitant;
	}
	public void setNbInhabitant(int nbInhabitant) {
		if(nbInhabitant > this.nbInhabitant)
		this.nbInhabitant = nbInhabitant;
		else System.out.println("impossible !");
	}
	@Override
	public String toString() {
		return " city=" + name + ", state=" + state + ", nbInhabitant=" + nbInhabitant;
	}
	
}
