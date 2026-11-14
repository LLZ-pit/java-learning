public class InsertDemo {
    public static void main(String[] args) {
        int [] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //1.找到无序的那一组数据是从哪一个索引开始的 2
        int startIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                startIndex = i;
                break;
            }

        }
       //2.便利从startIndex开始到arr.length结束这一段无序的代码
//        for (int i = startIndex; i < arr.length; i++) {
//            //先记录要插入数据的位置
//            int j = i;
//            while(j > 0 && arr[j] < arr[j-1]){
//                //叫换位置
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//                j--;
//
//            }
//
//
//
//        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = i;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
