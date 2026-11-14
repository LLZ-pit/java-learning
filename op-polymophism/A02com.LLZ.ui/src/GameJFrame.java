import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import static javax.print.attribute.standard.MediaSizeName.D;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {
    //表示的是游戏的主界面，游戏登录的代码都写到这个界面
    //跟游戏相关的所有类都写到这个界面

    //创建一个4*4的二维数组
    //用来管理数据 加载图片会根据二维数组来加载图片


    int [] [] data = new int [4][4];
    //创建一个判断胜利的数组
    int [] []win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0},

    };
    //定义一个变量统计玩了多少步
    int step = 0;
    //创建选项下面条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem relogItem = new JMenuItem("重新登录");
    JMenuItem colseItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");





    //用来统计空白图片的位置
    int x =1;
    int y =1;
    //定义一个变量用来展示当前图片下的路径
    String path = "op-polymophism\\image\\animal\\animal3\\";
   

   public GameJFrame() {
       //初始化界面
       initJFrame();
       //初始化菜单
       initJMenuBar();

       //初始化数据(打乱)
       initData();

       //初始化图片(根据打乱后的结果去初始化数据)
       initImage();


       //展示游戏界面
       this.setVisible(true);
   }





    //初始化数据(打乱)
 private void   initData(){
     //定义一维数组
     int [] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
     //打乱一位数组
     for (int i = 0; i < tempArr.length; i++) {
         //先获取随机索引
         Random R = new Random();
         int r = R.nextInt( tempArr.length);
         //拿着便利到的数据和随机索引上的数据进行交换
         int temp = tempArr[r];
         tempArr[r] = tempArr[i];
         tempArr[i] = temp;
         //通过交换数组的形式可以避免有数据重复


     }

     //5.给二维数组添加数据
     //(1)解法一:便利一维数组得到每个元素，并一次添加到二维数组中
     int temp = 0;
     for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {

                 data[i][j] = tempArr[temp];
                 temp++;



         }

     }


 }


   //初始化图片+加载图片
    //添加图片要按照二维数组来添加图片
    private void initImage(){
       //先清空已经出现的所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利的图
            JLabel win = new JLabel(new ImageIcon("D:\\代码\\java\\IDEAdaima\\op-polymophism\\image\\win.png"));
            //对图片进行设置
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);

        }
        //JLabel这个类可以管理图片和对象
        JLabel stepjlabel = new JLabel("步数:"+step);
        stepjlabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepjlabel);





       //路径：绝对路径；要从盘符开始的
        //相对路径是：是相对于项目来说的 就是把包前面的绝对路径的删了



        //把内循环重复执行了四次
        for (int j = 0; j < 4; j++) {
            //----表示在一行添加4张图片
            for (int i= 0; i < 4; i++) {
                //在创建一个JLable的容器用来存储图片;
                //获取要添加图片的序号
                if(data[j][i] == 0){
                    x = j;
                    y = i;

                }
                int temp = data[j][i];
                JLabel jlable = new JLabel(new ImageIcon(path+temp+".jpg"));

                //指定添加图片的位置 要在添加之前
                jlable.setBounds(i*105+83,j*105+134,105,105);
                //给图片添加边框 setBorder是一个接口 规定了接口的规则； 用这个方法的BevelBorder
                //new BevelBirder是一个类 用了含参构造 0吐出来 1凹下去
                jlable.setBorder(new BevelBorder(1));


                //把管理容器添加到ImageIcon中;
                //添加这个方法是JFrame的
                this.getContentPane().add(jlable);


            }

        }
        //先用imageIcon来创建图像的对象
        ImageIcon bg = new ImageIcon("op-polymophism\\image\\background.png");
        //把这个图片对象储存在JLabel容器中
        JLabel backgroud = new JLabel(bg);
        //在添加到JFrame之前先确定图片的大小和长宽高
        backgroud.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
        //添加到JFrame中
        this.getContentPane().add(backgroud);
        //在刷新界面
        this.getContentPane().repaint();








    }

    private void initJMenuBar() {

        //初始化菜单
        //创建整个菜单对象 JMenuBar
        JMenuBar jmenuber = new JMenuBar();

        //创建菜单上两个选项的对象 功能 关于我们
        JMenu fuctionJMenu = new JMenu("功能");

        JMenu aboutJMenu = new JMenu("关于我们");


        //将每一个选项下面的条目添加到选项当中
        fuctionJMenu.add(replayItem);
        fuctionJMenu.add(relogItem);
        fuctionJMenu.add(colseItem);


        aboutJMenu.add(accountItem);
        //给条目绑定时间
        replayItem.addActionListener(this);
        relogItem.addActionListener(this);
        colseItem.addActionListener(this);
        accountItem.addActionListener(this);




        //将菜单里面的两个选项添加到菜单当中
        jmenuber.add(fuctionJMenu);
        jmenuber.add(aboutJMenu);

        //给整个界面设置方法
        this.setJMenuBar(jmenuber);
    }



    private void initJFrame() {
        //设置界面的宽高，
        this.setSize(603,680);
        //展示界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭方法
        this.setDefaultCloseOperation(3);

        //取消默认的居中放置，只有取消了才会才会按照x,Y来放置
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //按下松时就会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
       int code = e.getKeyCode();
        if(code == 65){
            //把界面中所有图片全都删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片 加载背景图片
           JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
           //对图片长宽高经行设置
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            ImageIcon bg = new ImageIcon("op-polymophism\\image\\background.png");
            //把这个图片对象储存在JLabel容器中
            JLabel backgroud = new JLabel(bg);
            //在添加到JFrame之前先确定图片的大小和长宽高
            backgroud.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
            //添加到JFrame中
            this.getContentPane().add(backgroud);
            //刷新界面
            this.getContentPane().repaint();

        }



    }
//松开按键时调用
    @Override
    public void keyReleased(KeyEvent e) {
       if(victory()){
           //结束当前方法
           return ;
       }
       //对上，下，左，右进行判断
       //左；37，上；38，右；39；下；40
        //这个方法可以获得每个键对应的数值 可以进行判断按了那个键
       int code = e.getKeyCode();
        System.out.println(code);
        if(code == 37){
            step++;
            //相当于把空白域左边的图片进行交换
            if(y == 0){
                return ;
            }
            System.out.println("向左移动");
            data[x][y] = data[x][y -1];
            data[x][y - 1] = 0;
            y--;
            initImage();
        }else if(code == 38){
            step++;
            System.out.println("向上移动");
            //把空白下方的图片向上移动了
            //x.y表示空白方块 下方的图片表示 x+1 y不变表示下方的图片
            //对于边界进行判断
            if(x == 0){
                //就代表空白方块在最上方 上面没有图片了 所以不可以走
                return ;
            }
         data[x][y] = data[x - 1][y];
            data[x -1][y] = 0;
            x--;
            initImage();

        }else if(code == 39){
            step++;
            System.out.println("向右移动");
            if(y == 3){
                return ;
            }

            data[x][y] = data[x ][y +1];
            data[x][y + 1] = 0;
            y++;
            initImage();



        }else if(code == 40){
            step++;
            if(x == 3){
                return ;
            }
            System.out.println("向下移动");
            data[x][y] = data[x + 1][y];
            data[x+1][y] = 0;
            x++;
            //调用方法再添加图片
            initImage();

        }else if(code == 65){
            initImage();
        }else if(code == 87){
            //把二维数组变成最终的值就可以
            data = new int [] []{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},

            };
            initImage();
        }

    }
    //判断data中的数组和win里的数组是否一样
    //一样的返回true不一样返回false
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < win.length; j++) {
                if(data[i][j] != win[i][j]){
                    return false;
                }

            }

        }
        return true;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的方法
        Object obj = e.getSource();
        //判断
        if(obj == replayItem){
            System.out.println("重新游戏");
            step = 0;

            //再次打乱二维数组的数据
            initData();
            //重新加载图片
            initImage();
            //刷新界面
            this.getContentPane().repaint();





        }else if(obj ==relogItem){
            System.out.println("重新登录");
            //关闭当前界面 隐藏了
            this.setVisible(false);
            //打开登录界面
            new loginJFrame();

        }else if(obj == colseItem){
            System.out.println("关闭游戏");
            //直接关闭虚拟接即可
            System.exit(0);
        }else if(obj == accountItem){
            System.out.println("公众号");
            //创建一个管理容器的对象
            JDialog jDialog   = new JDialog();
            //床见图片管理容器JLabel
            JLabel jlabel = new JLabel(new  ImageIcon("D:\\代码\\java\\IDEAdaima\\op-polymophism\\image\\girl\\girl1\\all.jpg"));
            //设置长宽高
            jlabel.setBounds(0,0,258,258);
            //把图片添加到弹框中
            jDialog.getContentPane().add(jlabel);
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            //不关闭无法进行其他操作
            jDialog.setVisible(true);
        }

    }
}
