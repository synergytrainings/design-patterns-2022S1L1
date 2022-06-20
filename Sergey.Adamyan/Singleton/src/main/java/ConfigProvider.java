import model.Config;

public class ConfigProvider {

    private static ConfigProvider configProvider;


    private ConfigProvider() {
    }

    /**
     * Thread Safe Singleton
     */
    public static ConfigProvider getInstance() {
        if (configProvider == null) {
            synchronized (ConfigProvider.class) {
                if (configProvider == null) {
                    configProvider = new ConfigProvider();
                }
            }
        }
        return configProvider;
    }

    /**
     * Getting config from provider, logic not implemented yet
     *
     * @param lockerId: unique locker id
     * @return Config for given locker id
     */
    public Config getConfig(int lockerId) {
        // for example simple logic for returning Configs
        switch (lockerId) {
            case 1:
                return new Config(lockerId, true, "Globbing");
            case 2:
                return new Config(lockerId, false, "Globbing");
            case 3:
                return new Config(lockerId, true, "Onex");
            case 4:
                return new Config(lockerId, false, "Onex");
            default:
                throw new RuntimeException(String.format("There are no Locker with id %d", lockerId));
        }
    }

}
