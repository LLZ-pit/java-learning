import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //是字符输入流是Reader的实现类对象
        String str = "D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text";
        FileReader f1 = new FileReader(str);
        //读取数据 底层也是字节流 但遇到中文会读取多个字节 UTF-8读取3个 GBK读取2个字节
      //把数组中的数据变成字符串再进行打印
        char [] ch = new char[2];
        int len;
        //就表示每次读取2个数据
        while((len = f1.read(ch)) != -1){
            System.out.print (new String(ch,0,len));
        }

    }
}
