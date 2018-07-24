package celue.ticket;

public class OtherDiscount implements Discount{

    @Override
    public double discount(double price) {
        System.out.println("给特殊人群，票价不变："+price);
        return price;//非特殊人群，返回原始票价
    }
}
