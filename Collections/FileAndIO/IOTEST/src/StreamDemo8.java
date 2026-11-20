import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StreamDemo8 {
    public static void main(String[] args) throws IOException {
        //先创建学生类对象
        Student student = new Student("张三",23);
        //在构造序列化输出流对象 里面参数是字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\代码\\java\\IDEAdaima\\Collections\\FileAndIO\\src\\a.text"));
        //写出数据
        oos.writeObject(student);
        //释放资源
        oos.close();

    }
}
