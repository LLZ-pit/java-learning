import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        String str = "D:\\";
        File f = new File(str);
        finaAVI(f);




    }
    public static void finaAVI(File file){
        //先进入文件夹file
        File[] src = file.listFiles();
        if(src != null){
            //遍历数组得到每个文件并判断是否为文件夹
            for (File f : src) {
                //判断是否为文件如果是就执行查找方法 isFile()判断是否为文件
                if (f.isFile()) {
                    String name = f.getName();
                    if(name.endsWith(".text")){
                        System.out.println(f);
                    }


                }else{
                    //如果是文件夹就继续执行查找方法继续拆分
                    finaAVI(f);
                }

            }

        }



    }


}
