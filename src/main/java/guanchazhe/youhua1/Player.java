package guanchazhe.youhua1;

import guanchazhe.yiban.AllyControlCenter;

import java.util.Observable;
import java.util.Observer;

public class Player implements Observer{
    private ControlCenter cc;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
    public void setCc(ControlCenter cc) {
        this.cc = cc;
    }

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        cc.setChanged();
        cc.notifyObservers(name+":大家好，我现在的名字叫"+name+","+this.name+"这个名字不用了");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //遭受攻击方法的实现，当遭受攻击时将调用战队控制中心类的通知方法notifyObserver()来通知盟友
    public void beAttacked() {
        cc.setChanged();
        cc.notifyObservers(this.name + "被攻击！");
    }

    //支援盟友方法的实现
    public void help() {
        cc.setChanged();
        cc.notifyObservers("坚持住，" + this.name + "来救你！");
    }
}
