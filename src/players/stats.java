package players;

import java.util.Random;

public class stats {
/*
Strength
Dexterity
Constitution
Wisdom
Intelligence
Charisma
 */
protected int Strength;
protected int Dexterity;
protected int Constitution;
protected int Wisdom;
protected int Intelligence;
protected int Charisma;
Random rand = new Random();

stats(){
	Strength = rand.nextInt(20)+10;
	Dexterity = rand.nextInt(20)+1;
	Constitution = rand.nextInt(20)+1;
	Intelligence = rand.nextInt(20)+1;
	Charisma = rand.nextInt(20)+1;
	Wisdom = rand.nextInt(20)+1;
 	}

	public String StringStrength() {
		String s = Integer.toString(getStrength());
		return "Strength: " + s;
	}
	
	public String StringDexterity() {
		String s = Integer.toString(getDexterity());
		return "Dexterity: " + s;
	}
	
	public String StringConstitution() {
		String s = Integer.toString(getConstitution());
		return "Constitution: " + s;
	}
	public String StringWisdom() {
		String s = Integer.toString(getWisdom());
		return "Wisdom: " + s;
	}
	public String StringIntelligence() {
		String s = Integer.toString(getIntelligence());
		return "Intelligence: " + s;
	}
	public String StringCharisma() {
		String s = Integer.toString(getCharisma());
		return "Charisma: " + s;
	}

	
	
	
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength) {
		Strength = strength;
	}
	public int getDexterity() {
		return Dexterity;
	}
	public void setDexterity(int dexterity) {
		Dexterity = dexterity;
	}
	public int getConstitution() {
		return Constitution;
	}
	public void setConstitution(int constitution) {
		Constitution = constitution;
	}
	public int getWisdom() {
		return Wisdom;
	}
	public void setWisdom(int wisdom) {
		Wisdom = wisdom;
	}
	public int getIntelligence() {
		return Intelligence;
	}
	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}
	public int getCharisma() {
		return Charisma;
	}
	public void setCharisma(int charisma) {
		Charisma = charisma;
	}
	
	public String toString() {
		return "Strength: " + Strength + " Dexterity: " + Dexterity + " Constitution: " + Constitution + " Intelligence: " + Intelligence
				+ " Charisma: " + Charisma + " Wisdom: " + Wisdom;
	}
}
