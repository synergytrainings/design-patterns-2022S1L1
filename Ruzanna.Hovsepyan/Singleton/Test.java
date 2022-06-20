public class Test {
    public static void main(String[] args) {
        NetworkConnection connection = NetworkConnection.getConnection();
        connection.setIpAddress("192.168.1.105");
        connection.setDefaultGateWay("192.168.1.2");
        connection.initConfigurations();
    }
}
