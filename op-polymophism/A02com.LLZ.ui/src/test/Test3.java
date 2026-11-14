package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String [] args){
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(603,680);
        //设置界面标题
        jFrame.setTitle("事件演示");
        //设置界面顶置
        jFrame.setAlwaysOnTop(true);
        //设置页面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //取消居中放置 这样xy才起作用
        jFrame.setLayout(null);

        //创建一个按钮
        JButton jb = new JButton("点我啊");
        //设置位置和宽高
        jb.setBounds(0,0,100,50);
        //添加动作监听
        //这个动作监听就会执行（）里面的代码 new MyActionListener() 就是一个对象是接口实现类的对象
        //应为ActionListener()里面的对象是接口类型的所以要先实现再创建对象
        //jb.addActionListener(new MyActionListener()); //add是添加 ActuonListener是监听事件哪个事件监听 动作监听 鼠标和空格

        //因为这个jb的按钮实现的接口只能被用到一次 所以就不再创建一个类来实现这个接口后再创建对象
        //就直接用匿名内部类
        jb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });






        //隐藏的容器再进行添加
        //先调用JFrame中的
        jFrame.getContentPane().add(jb);



        //取消界面的隐藏 让界面显示出来
        jFrame.setVisible(true);
    }
}
