package sort;

/**
 * @ClassName QuickSort
 * @MethodDesc: 快速排序Java实现
 * @Author Movle
 * @Date 6/4/20 4:26 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class QuickSort {
    public static void main(String[] args) {

        int[] arr={49,28,45,33,78,1,7,2,0,22};
        System.out.println("--快速排序前--");
        for(int i:arr){
            System.out.println(i);
        }
        quickSort(arr,0,arr.length-1);

        System.out.println("--快速排序之后--");

        for(int i:arr){
            System.out.println(i);
        }

    }

    private static void quickSort(int[] arr,int low,int high){
        if(low<high){
            //寻找基准数据的正确索引
            int index=getIndex(arr,low,high);

            //利用迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort(arr,0,index-1);
            quickSort(arr,index+1,high);
        }
    }

    private static int getIndex(int[] arr,int low,int high){

        //基准数据
        int tmp=arr[low];

        while(low<high){
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while( low<high && arr[high]>=tmp){
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];

            // 当队首元素小于等于tmp时,向前挪动low指针
            while(low<high && arr[low]<=tmp){
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high]=arr[low];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low]=tmp;
        // 返回tmp的正确位置
        return low;
    }
}
