import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class FileDemo4 {
    public static void main(String[] args) {

        //写一个文件夹的大小
        String str = "D:\\test.c";
        File f = new File(str);

        HashMap <String, Integer> hm = getCount(f);
        //Map便利
        Set <Map.Entry<String, Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("=============-=-===========");
        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + " : " + value);
            }
        });





    }
    //统计一个文件夹中每种文件的个数 参数是要统计的文件夹 返回值map集合用计数器思想让键表示要统计的对象值表示个数
    public static HashMap<String,Integer> getCount(File file){
        HashMap<String,Integer> hm = new HashMap<>();
        //1，进入文件夹
        File[] files = file.listFiles();
        //进入文件夹
        for(File src : files){
            if(src.isFile()){
              String name =   src.getName();
              //对名字经行切割
                int count = 0;
            String [ ] arr =  name.split("\\.");
            if(arr.length >= 2){
                String endname = arr[arr.length-1];
                if(hm.containsKey(endname)){
                   int i = hm.get(endname);
                   i++;
                   hm.put(endname,i);
                }else{
                    //如果不存在就说明是第一次添加
                    hm.put(endname, 1);
                }
            }

            }else{
                //是文件夹就经行递归
                HashMap<String, Integer> snomap = getCount(src);
               //便利snomap集合把里面得到的值累加到hm集合中
                Set<String> keys = snomap.keySet();
                for (String key : keys) {
                    if(hm.containsKey(key)){
                        int i = snomap.get(key);
                        int count =   hm.get(key) + i;
                        hm.put(key,count);
                    }else{
                        hm.put(key,1);
                    }

                }
            }
        }
        return hm;


    }
}
