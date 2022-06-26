package com.example.test;

/**
 * This are monsters that have way higher fighting ability stats and also could have are control effects
 */
public class UniqueMonster extends Monster {

	boolean areaControl;

	public UniqueMonster(String name, Double attack, Double defense, int respawnTime, boolean areaControl) {
		super(name, attack, defense, respawnTime);
		this.areaControl = areaControl;
	}
}
