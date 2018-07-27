package zhuangshi;

public class TextBox implements Component {
    private String name ;
    public String getName(){
        return name;
    }
    public TextBox(String name){
        this.name=name;
    }
    @Override
    public void display() {
        System.out.println("显示文本框！");
    }

    @Override
    public String toString() {
        return "TextBox{" +
                "name='" + name + '\'' +
                '}';
    }
}
