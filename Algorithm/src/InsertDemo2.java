public class InsertDemo2 {
    public static void main(String[] args) {
        int number = method(100);
        System.out.println(number);


    }
    public static int  method(int number){
        //作为出口
        if (number == 1) {

            return 1;
        }
        return number + method(number - 1);


    }
}
