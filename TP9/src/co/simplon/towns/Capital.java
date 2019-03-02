package co.simplon.towns;

public class Capital extends City {
	private String monument;

	public Capital() {
		super();
		monument = "";
	}
	public Capital(String name, String state, int nbInhabitant, String monument) {
		super(name, state, nbInhabitant);
		this.monument = monument;
	}
	
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + "monument=" + monument;
	}	
}
