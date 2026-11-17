import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String []args){
        //Stream的创建
        //1.数组类型的 对于int这种包装类和基本数据类型不一样的时候尽量用Lamdba表达式来简写
        int [] arr = {1,2,3,45,6,7,8,9,10};
        Arrays.stream(arr).forEach(s->System.out.println(s));
       //filter过滤方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","张思","王五","王扒皮","里霸气");
        System.out.println("============--=----------------------========");
        list.stream().filter((s)-> s.startsWith("张"))
                .forEach( s-> System.out.println(s));
        //limit(x)获取前x位数据
        list.stream().limit(4).forEach(s -> System.out.println(s));
        System.out.println("=========-=--=--=--==-==-===-=====================---=-=-==");
        //skip(x)跳过前x位的元素
        list.stream().skip(3).forEach(s -> System.out.println(s));
        //distinct对相同的元素去重;
        System.out.println("===-============-----=-=-==-=-===--=--=-=-=-=-=-=-=-=-=-=-=-=-=");
        //map转换流中的数据类型




    }
}
