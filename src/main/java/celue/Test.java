package celue;

import celue.ticket.MovieTicket;
import celue.ticket.StudentDiscount;

public class Test {
    public static void main(String[] args) {
//        Duck redDuck = new RedDuck();
////        redDuck.display();
////        redDuck.performFly();
////        redDuck.setFlyBehavior(new CanFly());
////        redDuck.performFly();
////        Duck blackDuck = new BlackDuck();
////        blackDuck.display();
////        blackDuck.performFly();
////        blackDuck.setFlyBehavior(new CanFly());
////        blackDuck.performFly();

//        Calculate calculate = (Calculate) XMLUtil.getBean(); //读取配置文件并反射生成具体折扣对象
//        calculate.calculate(90);

        //电影票例子
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(30);
        ticket.getPrice();

        ticket.setCalculate(new StudentDiscount());
        ticket.getPrice();
    }
}
