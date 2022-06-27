import org.junit.Test;

public class CarEngineerTest {

    @Test
    public void EngineerTest() {
        CarBuilder MBCarBuilder = new MercedesBenzCarBuilder();
        CarEngineer MBCarEngineer = new CarEngineer(MBCarBuilder);

        MBCarEngineer.buildCar("E63 AMG", 2013, "White", "5.5", 585, "Automatic");

        CarBuilder BMWCarBuilder = new BMWCarBuilder();
        CarEngineer BMWCarEngineer = new CarEngineer(BMWCarBuilder);

        BMWCarEngineer.buildCar("M5", 2013, "White", "4.4", 560, "Automatic");
    }
}
