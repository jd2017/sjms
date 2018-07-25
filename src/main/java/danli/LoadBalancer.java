package danli;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，
//考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
public class LoadBalancer {
    //私有静态成员变量，存储唯一实例
    private static LoadBalancer instance = null;
    //服务器集合
    private List serverList = null;
    //私有构造函数
    private LoadBalancer() {
        serverList = new ArrayList();
    }
    public LoadBalancer getLoadBalancer(){
        if(instance==null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
