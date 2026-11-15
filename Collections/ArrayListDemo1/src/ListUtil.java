import java.util.ArrayList;

public class ListUtil <E>{
    //定义一个工具类可以添加多个集合的元素
    private ListUtil(){

    }
    //参数一 集合 要添加的元素
    //因为这个方法要可以存多个集合所以可以在方法名前面声明这个不确定的变量
    public static <E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);


    }

}
