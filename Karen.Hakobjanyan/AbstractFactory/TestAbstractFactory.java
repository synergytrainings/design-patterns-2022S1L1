package AbstractFactory;

import AbstractFactory.DbFactory.AbstractFactory;
import AbstractFactory.DbFactory.MySqlFactory;
import AbstractFactory.DbFactory.OracleFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory.transaction(new MySqlFactory());
        AbstractFactory.transaction(new OracleFactory());
    }
}
