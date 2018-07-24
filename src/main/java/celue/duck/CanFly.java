package celue.duck;

public class CanFly  implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞哦");
    }
}
