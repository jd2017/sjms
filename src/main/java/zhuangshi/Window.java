package zhuangshi;

public class Window implements Component{
    private String name ;
    public String getName(){
        return name;
    }
    public Window(String name){
        this.name=name;
    }
    public void display() {
        System.out.println("显示窗体！");
    }

    @Override
    public String toString() {
        return "Window{" +
                "name='" + name + '\'' +
                '}';
    }
}
