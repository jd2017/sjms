package guanchazhe.youhua1;

import java.util.Observable;
import java.util.Observer;

public class ControlCenter extends Observable{
    private String allyName;

    public ControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    public synchronized void addObserver(Player o) {
        super.addObserver(o);
        System.out.println("this:"+this);
        o.setCc(this);
    }

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
