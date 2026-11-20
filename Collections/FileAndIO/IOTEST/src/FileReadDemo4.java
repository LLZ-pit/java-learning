import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReadDemo4 {
    public static void main(String[] args) throws IOException {
        //对于读取数据要用FileReader字节流来做 对于 拷贝用字符流来做
        FileReader ft = new FileReader("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text");
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch = ft.read()) !=-1){
            sb.append((char)ch);
        }
        ft.close();
        //排序先把StringBuilder转换成字符类型的再调用spilt方法去切割
        String str = sb.toString();
        String[] arra = str.split("-");
        int [] array = new int [arra.length];
      for(int i=0;i<arra.length;i++){
          //把String类型的数据转化为int型的数据;
          array[i] = Integer.parseInt(arra[i]);
      }
      //通过调用Arrays中的方法进行排序
        Arrays.sort(array);
      //咋创建新的StringBuilder去存数组
        StringBuilder sb2  = new StringBuilder();
        for(int i=0;i<array.length;i++){
           if(i != array.length-1){
               sb2.append(array[i]);
               sb2.append("-");
           }
           else{
               sb2.append(array[i]);
           }
        }
        String str2 = sb2.toString();
        FileWriter fw = new FileWriter("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a1.text");
        fw.write(str2);
        ft.close();
        fw.close();




    }
}
