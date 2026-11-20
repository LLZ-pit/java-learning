import java.io.*;

public class FileReadDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\test.c\\bbb");
        File f1Copy = new File("D:\\test.c\\bbbCopy");
        getCopt(f1,f1Copy);



    }
    public static void getCopt(File file,File fileCopy) throws IOException {
        file.mkdirs();
     byte [] b= new byte[1024];
     int len;
    //先确定是文件还是文件夹
        File [] f1 = file.listFiles();
        for(File file1 : f1){
            if(file1.isFile()){
                //当判断是文件是在进行拷贝
                FileInputStream fis = new FileInputStream(file);
                //因为只写了要拷贝的文件夹所以 对于被拷贝的文件夹里面可能有文件夹的嵌套和别的文件又不能嵌套所以就可以在保证
                //父路径存在的前提下给每次要拷贝的文件夹
                File Copy = new File(fileCopy,file1.getName());
                FileOutputStream fos = new FileOutputStream(Copy);
                while((len = fis.read(b)) != -1){
                    fos.write(b,0,len);
                }


            }else{
                getCopt(file1,new File(fileCopy+file1.getName()));

            }

        }



    }
}
