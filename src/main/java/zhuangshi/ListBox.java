package zhuangshi;

public class ListBox implements Component {
    private String name ;
    public String getName(){
        return name;
    }
    public ListBox(String name){
        this.name=name;
    }
    public void display() {
        System.out.println("显示列表框");
    }

    @Override
    public String toString() {
        return "ListBox{" +
                "name='" + name + '\'' +
                '}';
    }
}
