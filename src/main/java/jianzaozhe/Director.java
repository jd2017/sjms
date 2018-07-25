package jianzaozhe;

public class Director {
    private  Builder builder;

    public  Director(Builder builder) {
        this.builder=builder;
    }

    public  void setBuilder(Builder builder) {
        this.builder=builder;
    }

    //产品构建与组装方法
    public Actor construct() {
        builder.buildType();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        builder.buildSex();
        return builder.createActor();

    }
}
