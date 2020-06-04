package sort;

import java.util.Arrays;

/**
 * @ClassName MergeSory
 * @MethodDesc: 归并排序之Java实现
 * @Author Movle
 * @Date 6/4/20 4:52 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class MergeSort {
    public static void main(String[] args) {

        int[] arr={38,2,65,45,78,54,99,4,25,55,109};
        System.out.println("--归并排序前--");
        for(int i:arr){
            System.out.println(i);
        }
        int[] arr2=mergeSort(arr);

        System.out.println("--归并排序后--");
        for(int i:arr2){
            System.out.println(i);
        }

    }
    private static int[] mergeSort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        if(arr.length<2){
            return arr;
        }

        int middle = (int) Math.floor(arr.length/2);

        int[] left = Arrays.copyOfRange(arr,0,middle);
        int[] right = Arrays.copyOfRange(arr,middle,arr.length);

        return merge(mergeSort(left),mergeSort(right));

    }

    private static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length+right.length];

        int i=0;
        while (left.length>0 &&right.length>0){
            if(left[0]<=right[0]){
                result[i++]=left[0];
                left=Arrays.copyOfRange(left,1,left.length);
            }else {
                result[i++]=right[0];
                right=Arrays.copyOfRange(right,1,right.length);
            }
        }

        while(left.length>0){
            result[i++]=left[0];
            left=Arrays.copyOfRange(left,1,left.length);
        }

        while(right.length>0){
            result[i++]=right[0];
            right=Arrays.copyOfRange(right,1,right.length);
        }

        return result;

    }
}
