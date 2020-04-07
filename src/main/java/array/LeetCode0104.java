package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode0104
 * @MethodDesc:  LeetCode0104 回文排列
 * @Author Movle
 * @Date 4/7/20 8:23 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode0104题目：
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词
 */


public class LeetCode0104 {
    public static void main(String[] args) {

        System.out.println(canPermutePalindrome("tactco"));
    }

    /**
     * 思路：
     * 每个字符出现的次数为偶数, 或者有且只有一个字符出现的次数为奇数时, 是回文的排列; 否则不是
     * 利用HashSet中的元素不重复性质来判定
     * 将字符串s转换成字符数组c1
     * 新建一个HashSet set
     * 利用循环将c1中的元素添加进set中
     * 若添加成功，则说明之前没有添加，即第一次添加
     * 若添加失败，则证明该元素在之前就已经添加过，所以将该元素移除即可
     * 循环结束后，若set的元素个数为0或者1，则证明该字符串符合条件
     * 否则不符合
     *
     */
    public static boolean canPermutePalindrome(String s) {

        Set<Character> set = new HashSet<Character>();

        char[] c1 = s.toCharArray();

        for(char c:c1){
            if(!set.add(c)){
                set.remove(c);
            }
        }

        return set.size()<=1;
    }
}
