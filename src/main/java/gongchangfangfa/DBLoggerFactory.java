package gongchangfangfa;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DBLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DBLogger();
    }
}
