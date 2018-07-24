package gongchangfangfa;

public class DBLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("把日志写入数据库");
    }
}
