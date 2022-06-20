import model.Config;
import model.Locker;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Locker application for online shopping centers for example 'Globbing', 'ONEX'
 * There are two singleton classes ConfigProvider and Logger
 * ConfigProvider: for getting configs for each locker uniquely
 * Logger: for write logs into txt file (Info about getting items from slots)
 */
public class LockerApp {
    private static final Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        Locker firstLocker = new Locker(1, "First", 10, new ArrayList<>(Arrays.asList(1, 2, 4, 5)));
        ConfigProvider configProvider = ConfigProvider.getInstance();
        Config firstLockerConfig = configProvider.getConfig(firstLocker.getId());
        firstLocker.setConfig(firstLockerConfig);

        if (firstLocker.getItemFromSlot(1)) {
            logger.logSlotLeft(firstLocker, 1);
        } else {
            logger.logEmptySlot(firstLocker, 1);
        }

        Locker secondLocker = new Locker(3, "Second", 20, new ArrayList<>(Arrays.asList(2, 7, 8, 11)));
        Config secondLockerConfig = configProvider.getConfig(secondLocker.getId());
        secondLocker.setConfig(secondLockerConfig);

        if (secondLocker.getItemFromSlot(10)) {
            logger.logSlotLeft(secondLocker, 10);
        } else {
            logger.logEmptySlot(secondLocker, 10);
        }


    }
}
