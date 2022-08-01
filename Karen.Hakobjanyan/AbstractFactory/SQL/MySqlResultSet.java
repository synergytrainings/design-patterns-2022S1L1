package AbstractFactory.SQL;

import AbstractFactory.interfaces.ResultSet;

public class MySqlResultSet implements ResultSet {
    @Override
    public void hasNext() {
        System.out.println("MySqlResultSet.hasNext");
    }

    @Override
    public void Next() {
        System.out.println("Next Item");
    }
}
