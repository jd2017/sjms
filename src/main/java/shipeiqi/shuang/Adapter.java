package shipeiqi.shuang;

public class Adapter implements Target,Adaptee{//同时维持对抽象目标类和适配者的引用
    private Target target;
    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
       adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
