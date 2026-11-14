import javax.swing.*;

public class loginJFrame extends JFrame {
    //游戏登录界面，关于游戏登录的界面都写到这个里面
    public loginJFrame(){
        //再创见登录界面时同时去设置登录信息
        //比如设置宽高，，，直接展示出来
        this.setSize(488,430);
        this.setVisible(true);
        //设置登录界面
        this.setTitle("拼图 登录界面");
        //让界面居中
        this.setLocationRelativeTo(null);
        //让界面置顶
        this.setAlwaysOnTop(true);
        //设置关闭方法
        this.setDefaultCloseOperation(3);
    }
}
