import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String []args){
        //对Map集合的练习 Map和继承他的集合都有相似的方法
        //因为map是双链集合的顶级接 所以只能创建他的实现类的对象 会有两个参数一个是键另一个是值
        Map  <String,String> m = new HashMap<>();
        //添加元素
        m.put("A","b");
        m.put("B","c");
        m.put("C","d");
        m.put("D","e");
        m.put("E","f");
        //删除元素 是根据键值来删除元素的
        m.remove("A");//会返回值对象
        //遍历方法1.不用对集合便利map中有keyset()方法可以直接得到所有的键值放在一个链表中不要放在数组中
        Set <String> keys = m.keySet();

      for(String key : keys){
          System.out.println(m.get(key));
      }





    }
}
