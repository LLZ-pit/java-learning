public class QuickSdotDemo {
    public static void main(String[] args) {
        int [] arr = {4,3,6,2,8,12,34,23,42,13};
        quicksort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"," );
        }

    }
    /*
    1.要排序数组
    2.要排序数组的起始索引
    3.结束索引
     */
    public static void quicksort(int [] arr,int i, int j){
       //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        if(start > end){
            return ;
        }
        //记录基准数
        int baeNumber = arr[i];
        //利用循环找到要交换的数字
        while(start != end){
            //利用end从后向前找比基准数小的数字
            while(true){
                if(end <= start||arr[end] < baeNumber ){
                    break;
                }
                end--;


            }

            //start向后找比基准数大的数并
            while(true){
                if(start >= end||arr[start] > baeNumber ){
                    break;
                }
                start++;


            }

            //把找到的数进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        //当start==end时表示基准数归为了
        //把i指向的数字与end和start进行交换
        //就是拿着这个范围的第一个数字和start进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        //确定6左边的范围重复刚刚的事情
        quicksort(arr,i,start-1);
        //确定6右边的范围重复做这件事
        quicksort(arr,start+1,j);

    }
}
