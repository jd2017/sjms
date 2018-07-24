package celue.duck;

public class BlackDuck extends Duck {

    public BlackDuck(){
        flyBehavior=new NoFly();//默认不会飞
    }

    @Override
    public void display() {
        System.out.println("黑色鸭子");
    }
}
