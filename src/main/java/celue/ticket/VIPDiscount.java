package celue.ticket;

public class VIPDiscount implements Discount {

    @Override
    public double discount(double price) {
        System.out.println("原票价："+price);
        System.out.println("VIP票,影院VIP用户享受票价半价优惠，折后价为："+(price * 0.5));
        System.out.println("影院VIP用户还可进行积分，积分累计到一定额度可换取电影院赠送的奖品,增加积分！");
        return price * 0.5;
    }
}
