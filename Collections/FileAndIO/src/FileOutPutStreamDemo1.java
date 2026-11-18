import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo1 {
    //写一段文字到本地数据中
    public static void main(String [] args) throws IOException {
        //创建对象 可以是String 的地址和File对象都可以
        FileOutputStream fos = new FileOutputStream("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text");
        //写出数据
//        fos.write(100);
//        //释放资源
//        fos.close();
       String str = "sodosfkfodsisfofjos";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        //添加换行符
        String wrap = "\r\n";
        fos.write(wrap.getBytes());
        String str1 = "dkjijiokddnsfoinfelkfeo";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);
        fos.close();
    }


}
