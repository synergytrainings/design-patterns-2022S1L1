package com.example.test;

public class ToyWarrior {

	private final WarriorUniform uniform;
	private final WarriorWeapon weapon;
	private final boolean ridesHorse;

	public static class ToyWarriorBuilder {
		private WarriorUniform uniform;
		private WarriorWeapon weapon;
		private boolean ridesHorse = false;

		public ToyWarriorBuilder dressWithUniform(WarriorUniform uniform) {
			this.uniform = uniform;
			return this;
		}

		public ToyWarriorBuilder giveWeapon(WarriorWeapon weapon) {
			this.weapon = weapon;
			return this;
		}

		public ToyWarriorBuilder giveHorseToRide(boolean ridesHorse) {
			this.ridesHorse = ridesHorse;
			return this;
		}

		public ToyWarrior build() {
			return new ToyWarrior(this);
		}
	}

	private ToyWarrior(ToyWarriorBuilder builder) {
		this.uniform = builder.uniform;
		this.weapon = builder.weapon;
		this.ridesHorse = builder.ridesHorse;
	}

	@Override
	public String toString() {
		return "ToyWarrior{" +
				"uniform=" + uniform +
				", weapon=" + weapon +
				", ridesHorse=" + ridesHorse +
				'}';
	}
}
