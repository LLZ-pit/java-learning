import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuctionDemo {
    public static void main(String [] args){
//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list,"1","2","3","4","5");
//        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","王五","赵六","小龙女","张三丰");
       // list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s ->System.out.println(s));
        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge)
                .forEach(s -> System.out.println("s"));
    }
}
