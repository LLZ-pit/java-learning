import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字输入流对象
        FileInputStream fis = new FileInputStream("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text");
        //把字节流转化为字符流来读取数据
        InputStreamReader isr = new InputStreamReader(fis);
        //因为要读一整行所以要用字符输入缓冲流来
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();


    }
}
