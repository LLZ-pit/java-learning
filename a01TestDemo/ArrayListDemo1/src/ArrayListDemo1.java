import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;


public class ArrayListDemo1 {
    public static void main(String [] args){
        //对ArrayList集合的5种遍历方式
        //1.迭代器便利
        ArrayList <String>list = new ArrayList<>();


        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //创建迭代器的对象
        Iterator <String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("==============-------------=====================");

        //增强for
        for(String s:list){
            //s只是一个临时变量；
            System.out.println(s);
        }
        System.out.println("==============-------------=====================");
        //Lambda表达式便利
        list.forEach( s ->System.out.println(s));





    }
}
