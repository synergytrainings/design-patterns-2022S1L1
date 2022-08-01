package AbstractFactory.DbFactory;

import AbstractFactory.interfaces.Command;
import AbstractFactory.interfaces.Connection;
import AbstractFactory.interfaces.DbFactory;
import AbstractFactory.interfaces.ResultSet;

public class AbstractFactory {
    public static void transaction(DbFactory dbFactory) {
        Connection con = dbFactory.createConnection();
        con.connect();
        Command cmd = dbFactory.createCommand();
        ResultSet set = cmd.execute();
        set.hasNext();
    }
}
