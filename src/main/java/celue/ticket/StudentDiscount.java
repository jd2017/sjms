package celue.ticket;

public class StudentDiscount implements Discount {
    @Override
    public double discount(double price) {
        System.out.println("原票价："+price);
        System.out.println("学生票,凭学生证可享受票价8折优惠，折后价为："+(price * 0.8));
        return price * 0.8;
    }

}
