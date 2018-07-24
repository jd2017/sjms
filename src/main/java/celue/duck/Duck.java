package celue.duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    abstract void display();
    public  void performFly(){
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
