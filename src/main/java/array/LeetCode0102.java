package array;

import java.util.Arrays;

/**
 * @ClassName LeetCode0102
 * @MethodDesc: LeetCode0102功能介绍
 * @Author Movle
 * @Date 4/5/20 8:11 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode题目描述
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */

public class LeetCode0102 {
    public static void main(String[] args) {

        boolean result = CheckPermutation("abc","acb");
        System.out.println(result);
    }

    /**
     * 解题思路
     * 现将s1，s2字符串转换为字符数组schar1,schar2
     * 再将数组schar1,schar2进行排序
     * 再将数组schar1,schar2转换为字符串
     * 再利用equal函数比较两个字符串是否相同即可
     */

    public static boolean CheckPermutation(String s1,String s2){
        //转换为字符数组
        char[] schar1 = s1.toCharArray();
        char[] schar2 = s2.toCharArray();

        if(s1.length()!=s2.length()){
            return false;
        }

        //排序
        Arrays.sort(schar1);
        Arrays.sort(schar2);

        //转换为字符串
        String ss1 = String.copyValueOf(schar1);
        String ss2 = String.copyValueOf(schar2);

        //判定
        if(ss1.equals(ss2)){
            return true;
        }else {
            return false;
        }

    }
}
