package chouxianggongchang;

public class Test {
    public static void main(String[] args) {
        Factory factory = new SpringFactory();
        factory.createButton().display();
        factory.createTextField().display();
    }
}
