package AbstractFactory.SQL;

import AbstractFactory.interfaces.Connection;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("OracleConnection.connect");
    }
}
