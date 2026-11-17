import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zangsan",23);
        Student s2 = new Student("wangwu",23);
        Student s3 = new Student("zhangsan",29);
        Student s4 = new Student("wangwu",29);
        HashMap<Student ,String> hm = new HashMap<>();
        hm.put(s1,"z");
        hm.put(s2,"w");
        hm.put(s3,"zh");
        hm.put(s4,"w");
        Set<HashMap.Entry<Student,String>> set = hm.entrySet();
        for(HashMap.Entry<Student,String> s: set){
            System.out.println(s.getKey() + " : " + s.getValue());

        }

    }
}
