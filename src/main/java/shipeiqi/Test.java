package shipeiqi;

import shipeiqi.object.OperationAdapter;
import shipeiqi.object.ScoreOperation;
import shipeiqi.shuang.*;

public class Test {
    public static void main(String[] args) {
        ScoreOperation scoreOperation = new OperationAdapter();
        int[] array = {2,3,1,4,5,0,23};
        int result[];
        int score;
        System.out.println("成绩排序结果：");
        result = scoreOperation.sort(array);//遍历输出成绩
        for(int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = scoreOperation.search(result,4);
        if (score != -1) {
            System.out.println("找到成绩4。");
        }
        else {
            System.out.println("没有找到成绩4。");
        }

        System.out.println("查找成绩12：");
        score = scoreOperation.search(result,12);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩12。");
        }


        //双适配器
        Target target = new Adapter(new AdapteeImpl());
        target.request();

        Adaptee adaptee = new Adapter(new TargetImpl());
        adaptee.specificRequest();
    }
}
