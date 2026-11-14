public class InsertDemo3 {
    public static void main(String [] args){
        //用递归来求5的阶乘
        int result  = getFactorial(5);

            System.out.println(result);


    }
    public static int getFactorial(int number){
        if(number == 1){
            return 1;
            //返回值是返回方法的调用处

        }
        return number*getFactorial(number-1);
    }
}
