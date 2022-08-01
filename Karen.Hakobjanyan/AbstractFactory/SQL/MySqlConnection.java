package AbstractFactory.SQL;

import AbstractFactory.interfaces.Connection;

public class MySqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("MySqlConnection.connect");
    }
}
