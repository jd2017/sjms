package qiaojiemoshi;

public class GIFImage extends Image{
    public void parseFile(String fileName){
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为GIF。");
    };
}
