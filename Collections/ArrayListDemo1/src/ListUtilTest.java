import java.util.ArrayList;

public class ListUtilTest {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList <>();
        ListUtil.addAll(list,"aaa","bbb","ccc","dddd");
        System.out.println(list
        );
    }
}
