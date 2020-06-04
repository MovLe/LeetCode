package sort;


import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @MethodDesc: 冒泡排序Java实现
 * @Author Movle
 * @Date 6/4/20 3:38 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class BubbleSort {
    public static void main(String[] args) {

        int[] a={1,3,7,5,2,9,15,11};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int[] b= sort(a);
        System.out.println("----冒泡排序后----");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    public static int[] sort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        for(int i=0;i<arr.length;i++){
            boolean flag = true;

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){

                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;

                    flag=false;
                }

            }

            if(flag){
                break;
            }
        }

        return arr;
    }
}
