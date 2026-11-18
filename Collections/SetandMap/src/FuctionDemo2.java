import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,23","李扒皮,35","王老五,76","小龙女,54","黄蓉,32","王麻子,21");
        //把数据封装成student对象并存在map集合中
//      List<Student> student =   list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//               String [] arr = s.split(",");
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//                Student student = new Student(name,age);

//                return student;
//
//            }
//        }).collect(Collectors.toList());
//        System.out.println(student);
        list.stream().map(Student::new).forEach(s -> System.out.println(s));
    }
}
