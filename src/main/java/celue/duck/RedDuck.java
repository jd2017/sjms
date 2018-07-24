package celue.duck;

import celue.duck.CanFly;
import celue.duck.Duck;

public class RedDuck extends Duck {

    public RedDuck(){
        flyBehavior=new CanFly();//默认会飞
    }

    @Override
    public void display() {
        System.out.println("红色鸭子");
    }
}
