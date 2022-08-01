package AbstractFactory.SQL;

import AbstractFactory.interfaces.ResultSet;

public class OracleResultSet implements ResultSet {
    @Override
    public void hasNext() {
        System.out.println("OracleResultSet.hasNext");
    }

    @Override
    public void Next() {
        System.out.println("Next Item");
    }
}
