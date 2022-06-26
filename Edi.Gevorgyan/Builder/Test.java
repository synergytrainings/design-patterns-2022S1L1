package com.example.test;

public class Test {
    public static void main(String[] args) {

        ToyWarrior.ToyWarriorBuilder cavalryWarriorBuilder = new ToyWarrior.ToyWarriorBuilder()
                                                                            .dressWithUniform(WarriorUniform.GoldenAlpha)
                                                                            .giveWeapon(WarriorWeapon.Sword)
                                                                            .giveHorseToRide(true);

        ToyWarrior.ToyWarriorBuilder guardianBuilder = new ToyWarrior.ToyWarriorBuilder()
                                                                            .dressWithUniform(WarriorUniform.SilverBeta)
                                                                            .giveWeapon(WarriorWeapon.Spear);

        ToyWarrior cavalryWarrior = cavalryWarriorBuilder.build();

        ToyWarrior guardian = guardianBuilder.build();

        System.out.println(cavalryWarrior);
        System.out.println(guardian);
        
    }
}
