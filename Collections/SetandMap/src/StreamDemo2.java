import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //过滤数据只留下偶数并将存起来
        //将数据收集到集合中
       List<Integer> list2 = list.stream()
                .filter( integer -> integer % 2 ==0)
                .collect(Collectors.toList());
    }
}
