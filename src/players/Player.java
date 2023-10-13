package players;

public class Player extends stats {
	protected String name;
	protected String race;
	protected String classes;
	
	
	public Player(){
	super();
	name = "null";
	race = "null";
	classes = "null";
	
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public String getClasses() {
		return classes;
	}


	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String toString() {
		return super.toString() + " Name: " + name + " Race: " + race + " Class: " + classes;
	}
}
