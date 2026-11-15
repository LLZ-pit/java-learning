import java.util.*;
import java.util.function.Consumer;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Student student = new Student("zhangsan",23);
        Student student2 = new Student("zhangsan",29);
        Student student3 = new Student("wangwu",25);
        Student student4 = new Student("zhaoliu",26);
        Student student5 = new Student("huba",123);
        //添加学生对象
        HashSet <Student> hs = new HashSet<Student>();
        System.out.println(hs.add(student));

        System.out.println(hs.add(student2));
        System.out.println(hs.add(student3));
        System.out.println(hs.add(student4));
        System.out.println(hs.add(student5));
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("aaa");
        lhs.add("bbb");
        lhs.add("ccc");
        lhs.add("ddd");
        for(String s: lhs){
            System.out.println(s);
        }
        System.out.println("========-=-===-=--===-==----=-=-==");
        //lamdba便利
        lhs.forEach( s->System.out.println(s));
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(87);
        ts.add(3);
        ts.add(100);
        ts.add(5);
        ts.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("====-=====---=====-=-====-====--=");
        for(int i:ts){
            System.out.println(i);
        }
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==========-------=======");
        TreeSet <Student> ts2 = new TreeSet<>();
        ts2.add(student);
        ts2.add(student2);
        ts2.add(student3);
        ts2.add(student4);
        ts2.add(student5);
        for(Student s: ts2){
            System.out.println(s);
        }
        //默认排序Javabean重写Comparable接口
        System.out.println("=========------=====----====----=====-=-==========================");
        TreeSet <String> ts3 = new TreeSet<>(new Comparator<String>() {
            //o1是要添加的对象长度  02是存在的对象的长度 i和之前的规则一样

            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
              i =   i == 0? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts3.add("aaa");
        ts3.add("bbkrdn");
        ts3.add("cccnvjnd");
        ts3.add("ddddjsjddnknisan");
        for(String s : ts3){
            System.out.println(s);
        }



    }
}
