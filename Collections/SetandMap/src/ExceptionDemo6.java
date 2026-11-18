public class ExceptionDemo6 {
    public static void main(String[] args) {
        int  [] arr = {1,2,3,4,5,6,7};

        System.out.println("看看我执行了吗");
        try{
            System.out.println(arr[0]);//程序出现了异常
        }catch(ArrayIndexOutOfBoundsException e){
            //索引越界了
            System.out.println("索引越界了");

        }
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
//

        }
    }
}
