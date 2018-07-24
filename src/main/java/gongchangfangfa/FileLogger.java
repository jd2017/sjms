package gongchangfangfa;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("把日志写入文件");
    }
}
