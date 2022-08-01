package AbstractFactory.DbFactory;

import AbstractFactory.SQL.OracleCommand;
import AbstractFactory.SQL.OracleConnection;
import AbstractFactory.interfaces.Command;
import AbstractFactory.interfaces.Connection;
import AbstractFactory.interfaces.DbFactory;

public class OracleFactory implements DbFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }
    @Override
    public Command createCommand() {
        return new OracleCommand();
    }
}
