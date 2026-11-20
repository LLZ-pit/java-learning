import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadDemo3 {
    public static void main(String[] args) throws IOException {
        //对文件加密 要加密的对象
        File file = new File("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a1.text");
        FileInputStream fis = new FileInputStream(file);
        //要放的位置
        File fileCopy = new File("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a2.text");
        FileOutputStream fos = new FileOutputStream(fileCopy);
        int len;
        while((len = fis.read()) != -1){
            fos.write(len ^ 10 );

        }
        fos.close();
        fis.close();
    }
}
