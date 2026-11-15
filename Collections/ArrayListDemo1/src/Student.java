import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age ;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    @Override//红黑树底层会不断的调用compareTo方法去不断的去比较;
    public int compareTo(Student o) {
        //在方法里面指定排序规则
        //只看年龄
        int i = this.getAge() - o.getAge();//this代表要添加的元素  o代表已经存的元素
        return i;
        //返回值类型i>0存在右边//
        //i<0存在右边 =0不存已经存在
    }
}
