package AbstractFactory.SQL;

import AbstractFactory.interfaces.Command;
import AbstractFactory.interfaces.ResultSet;

public class OracleCommand implements Command {
    @Override
    public ResultSet execute() {
        System.out.println("OracleCommand.execute");
        return new OracleResultSet();
    }
}
