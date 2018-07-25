package danli;

/*通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式
（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）。*/
public class StaticInnerSingleton {
    public static int value = 123;
    {
        System.out.println("StaticInnerSingleton构造快");
    }
    static{
        System.out.println("StaticInnerSingleton静态构造快");
    }
    private StaticInnerSingleton(){
    }

    public static StaticInnerSingleton getInstance(){
        return HolderClass.instance;
    }

    private static class HolderClass {
        public static long INNER_STATIC_DATE = System.currentTimeMillis();
        private final static StaticInnerSingleton instance = new StaticInnerSingleton();
        {
            System.out.println("instance:"+instance);
            System.out.println("静态内部类构造1");
        }
        {
            System.out.println("instance:"+instance);
            System.out.println("静态内部类构造快2");
        }
        static{
            System.out.println("instance:"+instance);
            System.out.println("静态内部类静态构造快1");
        }
        static{
            System.out.println("instance:"+instance);
            System.out.println("静态内部类静态构造快2");
        }
    }
}
