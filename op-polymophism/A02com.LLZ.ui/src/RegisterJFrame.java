import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //跟游戏注册的代码都写到这里
    public RegisterJFrame(){
        this.setSize(488,500);
        this.setVisible(true);
        //设置登录界面
        this.setTitle("拼图 注册界面");
        //让界面居中
        this.setLocationRelativeTo(null);
        //让界面置顶
        this.setAlwaysOnTop(true);
        //设置关闭方法
        this.setDefaultCloseOperation(3);
    }
}
