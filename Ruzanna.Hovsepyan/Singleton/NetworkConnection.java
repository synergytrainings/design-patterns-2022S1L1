public class NetworkConnection {
    private String ipAddress;
    private String defaultGateWay;

    private NetworkConnection() {
        if (NetworkConnectionHolder.INSTANCE != null) {
            throw new UnsupportedOperationException("You can't create instance with constructor please use getConnection()");
        }
    }

    private static class NetworkConnectionHolder {
        private static final NetworkConnection INSTANCE = new NetworkConnection();
    }

    public static NetworkConnection getConnection() {
        return NetworkConnectionHolder.INSTANCE;
    }

    public void initConfigurations() {
        //to something use getIpAddress, getDefaultGateWay

    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDefaultGateWay() {
        return defaultGateWay;
    }

    public void setDefaultGateWay(String defaultGateWay) {
        this.defaultGateWay = defaultGateWay;
    }
}