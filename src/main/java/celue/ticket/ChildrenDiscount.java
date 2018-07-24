package celue.ticket;

public class ChildrenDiscount implements Discount{

    @Override
    public double discount(double price) {
        System.out.println("原票价："+price);
        if(price>20){
            price -= 10;
        }
        System.out.println("儿童票,年龄在10周岁及以下的儿童可享受每张票减免10元的优惠（原始票价需大于等于20元），折后价为："+price);
        return price;
    }
}
