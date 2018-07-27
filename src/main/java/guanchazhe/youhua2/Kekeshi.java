package guanchazhe.youhua2;

import java.util.Observable;

public class Kekeshi extends Observable{
    public void dancing(){
        setChanged();
        notifyObservers("dancing");
    }

    public void sing(){
        setChanged();
        notifyObservers("sing");
    }

    public void exit(){
        setChanged();
        notifyObservers("over");//退场消息通过该参数传递到观众的update方法的第二个参数上
    }
}
