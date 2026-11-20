import java.io.*;
import java.util.*;

public class BufferDem02 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a1.text"));
        //1读取数据 Array
       TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
       String line;
       while((line = br.readLine()) != null){
           int key = Integer.parseInt(line.split("\\.")[0]);
           String value = line.split("\\.")[1];
           tm.put(key,value);
       }
       //对map集合便利写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text"));
       //获取键值对 对象
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
           bw.write( entry.getValue());
           bw.newLine();
        }
        br.close();
        bw.close();



    }
}
