import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //练习创建文件和文件夹
//        String str = "D:\\test.c\\a.text";
//        File f1 = new File(str);
//        //创建新的文件
//        boolean newFile = f1.createNewFile();
//        System.out.println(newFile);
//        //mkdir创建新的文件夹但不可以多级创建
//        String str2 = "D:\\test.c\\aaa";
//        File f2 = new File(str2);
//        boolean b2 = f2.mkdir();
       //mkdirs可以多级创建
        String str3 = "D:\\test.c\\bbb\\ccc\\aaa";
        File f3 = new File(str3);
        boolean b3 = f3.mkdirs();
        String str4 = "a.text";
        File f4 = new File(f3,str4);
        boolean b4 = f4.createNewFile();
        System.out.println(b3);
        System.out.println(b4);
        //listFiles()便利路径下所有的
        String str5 = "D:\\test.c\\bbb\\ccc\\aaa";
        File f5 = new File(str5);
        for (File file : f5.listFiles()) {
            System.out.println(file);

        }


        //删除方法
//        System.out.println(f1.delete());
//        System.out.println(f2.delete());
//        System.out.println(f3.delete());

    }
}
