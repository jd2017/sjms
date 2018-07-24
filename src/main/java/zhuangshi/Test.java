package zhuangshi;

public class Test {
    public static void main(String[] args) {
        ComponentDecorator decorator = new BlackBorderDecorator(new ListBox());
        decorator = new ScrollBarDecorator(decorator);
        decorator.display();
        decorator = new ScrollBarDecorator(new Window());
        decorator.display();
    }
}
