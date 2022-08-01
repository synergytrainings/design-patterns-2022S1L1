package AbstractFactory.DbFactory;

import AbstractFactory.SQL.MySqlCommand;
import AbstractFactory.SQL.MySqlConnection;
import AbstractFactory.interfaces.Command;
import AbstractFactory.interfaces.Connection;
import AbstractFactory.interfaces.DbFactory;

public class MySqlFactory implements DbFactory {
    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }
    @Override
    public Command createCommand() {
        return new MySqlCommand();
    }
}
