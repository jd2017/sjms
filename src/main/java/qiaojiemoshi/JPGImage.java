package qiaojiemoshi;

public class JPGImage extends Image{
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public void parseFile(String fileName){
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为JPG。");
    };
}
