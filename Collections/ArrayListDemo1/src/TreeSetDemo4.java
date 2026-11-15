import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        Student2 s1 = new Student2("zhangsan",23,90,99,50);
        Student2 s2 = new Student2("lisi",24,90,98,51);
        Student2 s3 = new Student2("wangwu",25,100,20,50);
        Student2 s4 = new Student2("zaoliu",26,100,69,50);
        Student2 s5 = new Student2("qianqi",27,70,89,100);
        TreeSet<Student2> ts = new TreeSet <Student2>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(Student2 s:ts){
            System.out.println(s);
        }

    }
}
