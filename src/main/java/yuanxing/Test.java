package yuanxing;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args) {
        /*WeeklyLog zhou1 = new WeeklyLog();
        zhou1.setName("小白");
        zhou1.setContent("今天初步完成了952车险相关功能的实现");
        zhou1.setDate("2018-7-25");
        System.out.println(zhou1);
        WeeklyLog zhou2 = zhou1.clone();
        System.out.println(zhou2);
        zhou2.setName("小灰");
        zhou2.setDate("2018-7-18");
        System.out.println(zhou1);
        System.out.println(zhou2);
        System.out.println(zhou1==zhou2);
        System.out.println(zhou1.equals(zhou2));*/


        //浅克隆
        /*WeeklyLog week1 = new WeeklyLog();

        Attachment  attachment = new Attachment(); //创建附件对象
        attachment.setName("文件1");
        week1.setAttachment(attachment);  //将附件添加到周报中

        WeeklyLog week2 = week1.clone();
        System.out.println(week1);
        System.out.println(week2);

        //比较周报
        System.out.println("周报是否相同？ " + (week1 ==  week2));
        //比较附件
        System.out.println("附件是否相同？ " +  (week1.getAttachment() == week2.getAttachment()));*/


        //深克隆
        WeeklyLog2  log_previous, log_new = null;
        log_previous  = new WeeklyLog2(); //创建原型对象
        Attachment2  attachment2 = new Attachment2(); //创建附件对象
        log_previous.setAttachment2(attachment2);  //将附件添加到周报中
        try
        {
            log_new =  log_previous.deepClone(); //调用深克隆方法创建克隆对象
        }
        catch(Exception e)
        {
            System.err.println("克隆失败！");
        }

        //比较周报
        System.out.println("周报是否相同？ " + (log_previous ==  log_new));
        //比较附件
        System.out.println("附件是否相同？ " +  (log_previous.getAttachment2() == log_new.getAttachment2()));
    }
}
