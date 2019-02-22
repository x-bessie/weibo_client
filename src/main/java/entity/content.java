package entity;

/*
设置发送邮件
 */
public class content {
    //服务器地址
    String home="http://localhost:7116?";
    //发送人邮件地址
    String address="&address=inittest666@126.com";
    //邮件内容
    String text="&text=";
    //邮件名
    String title="&title=title";

    public String getHome() {
        return home;
    }

    public String getAddress() {
        return address;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
