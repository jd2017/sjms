package zhuangshi;

public class BlackBorderDecorator extends  ComponentDecorator {
    private String name ;
    public String getName(){
        return name;
    }
    public BlackBorderDecorator(Component component,String name){
        super(component);
        this.name=name;
    }
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display()
    {
        this.setBlackBorder();
        super.display();
    }

    public  void setBlackBorder()
    {
        System.out.println("为增加黑色边框！");
    }

    @Override
    public String toString() {
        return "BlackBorderDecorator{" +
                "name='" + name + '\'' +
                '}';
    }
}
