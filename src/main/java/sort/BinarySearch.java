package sort;

/**
 * @ClassName BinarySearch
 * @MethodDesc: 二分查找之Java实现,递归方法和非递归方法
 * @Author Movle
 * @Date 6/4/20 6:38 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class BinarySearch {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};

        int index = binarySearch(arr,8);
        int index2= recursionBinarySearch(arr,8,0,8);
        System.out.println("非递归二分法获取index:"+index);
        System.out.println("递归二分法获取index:"+index2);
    }

    private static int binarySearch(int[] arr,int num){

        int left = 0;
        int right = arr.length-1;

        int mid;

        while(left<right){

            mid = (left+right)/2;
            if(arr[mid]>num){
                right=mid-1;
            }else if(arr[mid]<num){
                left=mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }

    private static int recursionBinarySearch(int arr[],int num,int low,int high){
        if(num<arr[low]||num>arr[high]||low>high){
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid]>num){
            return recursionBinarySearch(arr,num,low,mid-1);
        }else if(arr[mid]<num){
            return recursionBinarySearch(arr,num,mid+1,high);
        }else {
            return mid;
        }

    }

}
