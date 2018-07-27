package guanchazhe.youhua2;

import java.util.Observable;
import java.util.Observer;

public class Children implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String type = (String) arg;
        switch (type){
            case "dancing":
                System.out.println("可可狮跳舞了");
                say();
                break;
            case "sing":
                System.out.println("可可狮唱歌了");
                say();
                break;
            case "over":
                System.out.println("小朋友再见吧，可可狮要睡觉了");
                break;
        }
    }

    private String name;
    public Children(String name){
        this.name=name;
    }

    public void say(){
        System.out.println(this.name+"说：我要跟着可可狮一起唱唱跳跳");
    }
}
