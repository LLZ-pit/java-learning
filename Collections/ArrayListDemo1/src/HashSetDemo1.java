import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class HashSetDemo1 {
    public static void main(String [] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        //遍历
        for(String s:hs){
            System.out.println(s);
        }
        //迭代器便利
        System.out.println("=======----=-=======---------===");
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Lamdbem表达式来遍历
        System.out.println("=============--------------=============-------=========");
        hs.forEach( s -> System.out.println(s));

    }
}
