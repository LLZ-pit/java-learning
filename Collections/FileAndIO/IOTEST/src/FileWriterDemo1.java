import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        File fi = new File("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text");
        FileWriter fw = new FileWriter(fi);
        //一次写一个数据
        fw.write(2034);
        //一次写一个字符串
        fw.write("我爱你中国");
        String str = "一次写入一个字节数组";
        fw.write("\r\n");
        char [] ch = str.toCharArray();
        fw.write(ch,0,ch.length);
        fw.close();
    }
}
