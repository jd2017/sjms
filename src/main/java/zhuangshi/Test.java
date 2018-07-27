package zhuangshi;

public class Test {
    public static void main(String[] args) {
//        ComponentDecorator decorator = new BlackBorderDecorator(new ListBox());
//        decorator = new ScrollBarDecorator(decorator);
//        decorator.display();
//        decorator = new ScrollBarDecorator(new Window());
//        decorator.display();

//        BlackBorderDecorator decorator = new BlackBorderDecorator(new ListBox("列表框"),"黑色边框装饰类");
////        ScrollBarDecorator decorator1 = new ScrollBarDecorator(decorator,"滚动条装饰类");
////        decorator1.display();

        Component decorator = new BlackBorderDecorator(new ListBox("列表框"),"黑色边框装饰类");
        decorator = new ScrollBarDecorator(decorator,"滚动条装饰类");
        decorator.display();
    }
}
