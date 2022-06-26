package com.example.test;

/**
 * In one specific mobile game there are different kinds of monsters which have different attributes
 * They are all monsters, but with different implementations.
 */
public class Monster {

	String name;
	Double attack;
	Double defense;
	int respawnTime;

	protected Monster(String name, Double attack, Double defense, int respawnTime) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.respawnTime = respawnTime;
	}

	public static Monster getOrdinaryMinion(Double attack, Double defense) {
		return new Monster("Small Minion", attack, defense, 30);
	}

	public static Monster getCargoMinion(Double attack, Double defense) {
		return new Monster("Big Minion", attack, defense, 30);
	}

	public static Monster getTurtle(Double attack, Double defense) {
		return new UniqueMonster("Turtle", attack, defense, 180, false);
	}

	public static Monster getLord(Double attack, Double defense) {
		return new UniqueMonster("Lord", attack, defense, 240, true);
	}
}
