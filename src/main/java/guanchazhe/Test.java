package guanchazhe;

import guanchazhe.yiban.AllyControlCenter;
import guanchazhe.yiban.ConcreteAllyControlCenter;
import guanchazhe.youhua1.ControlCenter;
import guanchazhe.youhua1.Player;
import guanchazhe.youhua2.Children;
import guanchazhe.youhua2.Kekeshi;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
          //普通
//        Observer o1 = new Player("小白");
//        Observer o2 = new Player("小青");
//        Observer o3 = new Player("小朱");
//        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("旋风");
//        allyControlCenter.join(o1);
//        allyControlCenter.join(o2);
//        allyControlCenter.join(o3);
//        o1.beAttacked(allyControlCenter);

        //优化1  JDK的java.util包中，提供了Observable类以及Observer接口，它们构成了JDK对观察者模式的支持
//        Player player1 = new Player("阿朱");
//        Observer player2 = new Player("萧峰");
//        Observer player3 = new Player("王语嫣");
//        Observer player4 = new Player("段誉");
//        ControlCenter cc = new ControlCenter("天龙八部");
//        cc.addObserver(player1);
//        cc.addObserver(player2);
//        cc.addObserver(player3);
//        cc.addObserver(player4);
//
//        String oldName = player1.getName();
//        player1.setName("孙悟空");

        //优化2
        Children  c1=new Children("小花");
        Children  c2=new Children("小凡");
        Children  c3=new Children("小玉");
        Kekeshi kk = new Kekeshi();
        kk.addObserver(c1);
        kk.addObserver(c2);
        kk.addObserver(c3);
        kk.dancing();
    }
}
