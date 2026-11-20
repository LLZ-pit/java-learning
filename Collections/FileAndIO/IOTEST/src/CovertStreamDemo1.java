import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CovertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定的编码读取数据
        //创建对象 一个参数是填字节流的对象 2个参数是 第一个是字节流的对象 另一个是 指定的编码规则
        //这个字节输入流作用是把字节流转化为字符流  创建这个对象当然是属于字符流的可以使用字符流的方法
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\test.c\\bbb\\ccc\\aaa\\a.text\\"),"GBK");
        //读取数据
//        int ch ;
//        while((ch = isr.read()) != -1){
//            System.out.println((char)ch);
//        }
//        isr.close();
       // FileReader fr =new FileReader("D:\\test.c\\bbb\\ccc\\aaa\\a.text\\",Charset.forName("GBK") );
    //字节输出流的参数也是字节输出流的对象 但它本身是一个字符流



    }
}
