public class Logger {
    private static volatile Logger instance = null;

    private Logger() {}

    public static Logger getLogger() {
        Logger res = Logger.instance;
        if (res == null) {
            synchronized(Logger.class) {
                res = Logger.instance;
                if (res == null) {
                    Logger.instance = res = new Logger();
                }
            }
        }
        return res;
    }

    public void log(LogLevel level, String msg) {
        switch(level) {
            case INFO:
                info(msg);
                break;
            case ERROR:
                error(msg);
                break;
            default:
                error("Wrong Log Level!");
        }
    }

    public void info(String msg) {
        System.out.println(msg);
    }

    public void error(String msg) throws Exception {
        throw new Exception(msg);
    }
}

public enum LogLevel {
    INFO,
    ERROR
}
