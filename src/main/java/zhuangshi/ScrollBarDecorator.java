package zhuangshi;

public class ScrollBarDecorator extends ComponentDecorator {
    private String name ;
    public String getName(){
        return name;
    }
    public ScrollBarDecorator(Component component,String name){
        super(component);
        this.name=name;
    }
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display()
    {
        this.setScrollBar();
        super.display();
    }

    public  void setScrollBar()
    {
        System.out.println("为构件增加滚动条！");
    }

    @Override
    public String toString() {
        return "ScrollBarDecorator{" +
                "name='" + name + '\'' +
                '}';
    }
}
