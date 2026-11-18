import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInPutSreamDemo1 {
    public static void main(String[] args) throws IOException {
//        File f = new File("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text");
//        FileInputStream fis = new FileInputStream(f);
//        int b ;
//        Long g = f.length();
//        System.out.println(g);
//        int legth = g.intValue();
//        byte [] bs = new byte[legth];
//        int i = 0;
//        while((b = fis.read()) != -1){
//            System.out.print((char)b);
//            bs[i] = (byte)b;
//            i++;
//
//        }
//        fis.close();
//        FileOutputStream fos = new FileOutputStream("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a1.text");
//        fos.write(bs);
//        fos.close();
        long startTime = System.currentTimeMillis();
      byte [] bytes = new byte[1024*1024*5];
      int len ;
      //创建对象input是获取 ouput是给外面的值
      FileInputStream fis = new FileInputStream("D:\\\\代码\\\\java\\\\IDEAdaima\\\\Collections\\\\FileAndIO\\\\src\\\\a.text");
      FileOutputStream fos = new FileOutputStream("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a1.text");
      while((len = fis.read(bytes)) != -1){
          fos.write(bytes,0,len);
      }
      //释放资源
        fis.close();
      fos.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}

