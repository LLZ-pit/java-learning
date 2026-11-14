import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String [] args){
        //对集合顶层父类接口的理解
        Collection coil = new ArrayList();
        coil.add("aaa");
        coil.add("bbb");
        coil.add("ccc");
        coil.add("ddd");
        //删除元素 返回值为boolean类型
        boolean aaa = coil.remove("aaa");
        //查询元素
        boolean b = coil.contains("ccc");
        System.out.println(b);
        //判断是否为空
        boolean b2 = coil.isEmpty();//这个方法底层调用的是equals这个对比,如果集合中存储的是自定义类型的对象 也想用contains来比较时
        //就要在javabean中重写这个方法不重写的话是依赖地址值判断的
        System.out.println(b2);



    }

}
