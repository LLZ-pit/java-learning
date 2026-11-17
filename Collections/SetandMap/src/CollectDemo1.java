import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-23","李四-男-25","小龙女-女-20","郭靖-男-28","李扒皮-男-29");
        //collect到list集合中
        List<String> list2 = list.stream().collect(Collectors.toList());
        //collect到map集合中 //在Fuction中对一个数据是在流中每一个数据类型,第二个是表示在map集合键值的类型
        Map<String,Integer> map =
                list.stream().collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                },new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map);

    }
}
