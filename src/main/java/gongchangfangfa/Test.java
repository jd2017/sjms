package gongchangfangfa;

public class Test {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();

        factory = new DBLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
