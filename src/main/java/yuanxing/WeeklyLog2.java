package yuanxing;

import java.io.*;

public class WeeklyLog2 implements Serializable{
    private  String name;
    private  String date;
    private  String content;
    private Attachment2 attachment2;

    public Attachment2 getAttachment2() {
        return attachment2;
    }

    public void setAttachment2(Attachment2 attachment2) {
        this.attachment2 = attachment2;
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", attachment2=" + attachment2 +
                '}';
    }


    public  void setName(String name) {
        this.name  = name;
    }

    public  void setDate(String date) {
        this.date  = date;
    }

    public  void setContent(String content) {
        this.content  = content;
    }

    public  String getName() {
        return  (this.name);
    }

    public  String getDate() {
        return  (this.date);
    }

    public  String getContent() {
        return  (this.content);
    }

    //克隆方法clone()，此处使用Java语言提供的克隆机制  浅克隆
    public WeeklyLog2 clone()
    {
        Object obj = null;
        try
        {
            obj = super.clone();
            return (WeeklyLog2)obj;
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("不支持复制！");
            return null;
        }
    }

    //深克隆
    public WeeklyLog2 deepClone() throws IOException, ClassNotFoundException, OptionalDataException
    {
        //将对象写入流中
        ByteArrayOutputStream bao=new  ByteArrayOutputStream();
        ObjectOutputStream oos=new  ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return  (WeeklyLog2)ois.readObject();
    }
}
