package AbstractFactory.SQL;

import AbstractFactory.interfaces.Command;
import AbstractFactory.interfaces.ResultSet;

public class MySqlCommand implements Command {
    @Override
    public ResultSet execute() {
        System.out.println("MySqlCommand.execute");
        return new MySqlResultSet();
    }
}
