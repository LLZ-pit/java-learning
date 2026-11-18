import java.io.File;

public class FileDemo1 {
    public static void main(String [] args){
        String str = "C:\\Users\\LLZ\\Desktop\\a.txt";
    //父路径就是:C:\Users\LLZ\Desktop\
        //子路径就是:a.txt
        File f1 = new File(str);
        //用父路径加子路径创建对象
        String parents = "C:\\Users\\LLZ\\Desktop";
        String childs = "a.txt";
//        File f2 = new File(parents, childs);
//        File f3 = new File(parents);
//        File f4 = new File(f3, childs);
//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());
        Long len = f1.length();//无法获取文件夹的大小
        System.out.println(len);
        String absolutePath = f1.getAbsolutePath();


    }
}
