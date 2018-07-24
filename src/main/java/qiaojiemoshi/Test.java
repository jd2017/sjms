package qiaojiemoshi;

public class Test {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImp imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
