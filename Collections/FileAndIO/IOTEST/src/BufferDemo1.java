import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo1 {
    public static void main(String[] args) throws IOException {
        //先创建字输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a1.text"));
        //读取数据 readLine()可以读取一行数据
       String str = null;
       while((str = br.readLine()) != null){
           System.out.println(str);
       }
       br.close();

    }
}
