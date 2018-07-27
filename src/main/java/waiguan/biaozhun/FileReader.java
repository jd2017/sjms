package waiguan.biaozhun;

import java.io.*;

public class FileReader {
    public String Read(String fileNameSrc)
    {
        System.out.println("读取文件，获取明文：");
        File file = new File(fileNameSrc);
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try
        {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new java.io.FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                sb.append(tempString).append("\n");
            }
            reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("文件不存在！");
        }
        catch(IOException e)
        {
            System.out.println("文件操作错误！");
        }
        System.out.println("原始文件内容："+sb.toString());
        return sb.toString();
    }
}
