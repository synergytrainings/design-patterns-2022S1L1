import model.Locker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private PrintWriter logWriter;

    private static Logger logger = null;

    private Logger() {
        try {
            File logFile = new File("log.txt");
            FileWriter fw = new FileWriter(logFile);
            logWriter = new PrintWriter(fw, true);
        } catch (IOException e) {
            System.out.println("Error occurred while working with file" + e.getMessage());
        }
    }

    public static synchronized Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void logSlotLeft(Locker locker, int slotId) {
        String companyName = locker.getCompanyName();
        String lockerName = locker.getName();
        logWriter.println(String.format("Number %d slot was left from '%s %s' locker", slotId, lockerName, companyName));
    }

    public void logEmptySlot(Locker locker, int slotId) {
        String companyName = locker.getCompanyName();
        String lockerName = locker.getName();
        logWriter.println(String.format("Number %d slot was empty in '%s %s' locker, please check it", slotId, lockerName, companyName));
    }
}
