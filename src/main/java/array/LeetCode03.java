package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode03 剑指offer03题 数组中重复的数字
 * @MethodDesc:
 * @Author Movle
 * @Date 4/11/20 5:07 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


/**
 * LeetCode 剑指Offer 面试题03
 * 数组中重复的数字
 */

public class LeetCode03 {
    public static void main(String[] args) {
        int[] a = {2,3,1,0,2,5,3};

        System.out.println(findRepeatNumber(a));

    }

    /**
     * 解法一 遍历数组
     * 利用for循环遍历数组，将数组nums[]中的元素添加到集合HashSet set中
     * 同时判定set中是否包含nums[i]的元素
     * 若包含则返回nums[i]元素，同时退出循环
     * 否则进行下一次循环
     */
    public static int findRepeatNumber(int[] nums){
        int rep = -1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){

            if(set.contains(nums[i])){

                rep=nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return rep;
    }
}
