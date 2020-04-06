package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Leetcode0101
 * @MethodDesc: TODO Leetcode0101
 * @Author Movle
 * @Date 4/4/20 10:59 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode面试01.01 判断字符是否唯一
 * 题目描述：
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同
 */


public class LeetCode0101 {

    public static void main(String[] args){

        boolean result1 = isUnique1("abc");

        boolean result2=isUnique2("abc");
        System.out.println("方法一"+result1);

        System.out.println("方法二"+result2);

    }

    /**方法一
    *第一次遍历字符串所有字母；
    *第二次遍历从第一次遍历的后一位开始；
    *判断两次遍历的字母是否相等，一旦相等则返回false；
    *默认返回true
    **/
    public static boolean isUnique1(String astr) {


        for(int i=0;i<astr.length();i++){
            for(int j=i+1;j<astr.length();j++){
                if(astr.charAt(i)==astr.charAt(j))
                {
                    return false;
                }

            }
        }

        return true;
    }

    /**
     * 方法二
     * 利用set集元素不同的性质判定
     * 将String中的字符添加到set集中
     * 遍历结束后，若set集的大小和String集合的长度相同，则证明不重复
     * 否则有重复元素
     * */
    public static boolean isUnique2(String astr) {

        Set set = new HashSet();

        for (int i = 0; i < astr.length(); i++) {
            set.add(astr.charAt(i));
        }

        if (set.size() == astr.length()) {
            return true;
        } else {
            return false;
        }

    }
}
