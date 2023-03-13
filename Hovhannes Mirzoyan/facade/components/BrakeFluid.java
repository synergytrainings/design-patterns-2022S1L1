package patterns.facade.components;

public class BrakeFluid {
    public void applyPressure(int power) {
        System.out.printf("Depresses a piston with %d power in the master cylinder, forcing fluid along the pipe.%n", power);
    }
}
