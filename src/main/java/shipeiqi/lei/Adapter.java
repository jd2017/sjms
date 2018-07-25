package shipeiqi.lei;

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        System.out.println("适配器");
        specificRequest();
    }
}
