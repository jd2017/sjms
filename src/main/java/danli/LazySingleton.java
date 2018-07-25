package danli;

//懒汉式单例在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，
//这种技术又称为延迟加载(Lazy Load)技术，即需要的时候再加载实例
//懒汉式
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() { }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton(); //创建单例实例
        }
        return instance;
    }

}
