package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1 两数之和
 * @MethodDesc:
 * @Author Movle
 * @Date 4/9/20 3:50 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode 1 题目：两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 */

public class LeetCode1 {
    public static void main(String[] args) throws Exception {

        int[] test = {3,2,4,7};
        int ta=9;

        int []result=twoSum2(test,ta);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }

    /**
     * 解法一暴力法
     * 暴力法
     * 嵌套循环
     */
    public static int[] twoSum(int[] num,int target){
        int index1=0;
        int index2=0;

        for(int i =0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    index1=i;
                    index2=j;
                }
            }
        }

        int[] result ={index1,index2};
        return result;
    }

    /**
     * 解法二 两遍哈希表
     * 保持数组中的每个元素与其索引相互对应的最好方法是哈希表
     * 首先将数组元素和下标存入哈希表map中
     * 再进行for循环
     * 再新建一个int类型的元素compont，其值为target与数组nums[i]的差值
     * 判定哈希表map中是否存在compont元素，若存在，则返回该下表i与哈希表map key值为compont的value值
     * 结束
     */
    public static int[] twoSum2(int[] nums,int target) throws Exception {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int compont = target-nums[i];
            if(map.containsKey(compont)&&map.get(compont)!=i){
                return new int[]{i,map.get(compont)};
            }
        }
        throw new IllegalArgumentException("无匹配结果");
    }
}
