package AbstractFactory.interfaces;

public interface DbFactory {
    Connection createConnection();
    Command createCommand();
}
