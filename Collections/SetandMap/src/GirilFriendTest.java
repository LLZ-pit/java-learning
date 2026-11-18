import java.util.Scanner;

public class GirilFriendTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GrilFriend gf = new GrilFriend();
        while (true) {
            try {
                System.out.println("名字");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("年龄");
                String age = sc.nextLine();
                int age1 = Integer.parseInt(age);
                gf.setAge(age1);
                break;
            } catch (NumberFormatException e) {
                //年龄接受是是字符串所以有可能导致输入的不是数字类型的要要进行判断
                System.out.println("年龄的格式有误，请输入数字年龄");
            }catch (NameFormatException e){
                e.printStackTrace();
                continue;
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                continue;

            }
        }
        System.out.println(gf);

    }
}
