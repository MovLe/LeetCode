package array;

/**
 * @ClassName LeetCode0106 字符串压缩
 * @MethodDesc:
 * @Author Movle
 * @Date 4/9/20 5:14 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode0106 字符串压缩
 * 利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 可以假设字符串中只包含大小写英文字母（a至z）
 *
 */

public class LeetCode0106 {
    public static void main(String[] args) {
        System.out.println(compressString("aabccccaaa"));
    }

    /**
     * 解法一 双指针法
     * 新建两个指针i，j
     * 新建一个StringBuilder sb
     * 利用while循环，i为下表=标，从0开始遍历字符串S
     * 令j=i;
     * 判定字符串的第j的元素是否与第i个元素是否相等
     * 若相等，则j指向下一位
     * 否则将S的第i个元素添加到sb中
     * 再将j-i 即重复字符的个数添加到sb中，
     * 再将i指针指向j，进行下一个循环
     * 循环结束后，将sb转换为String类型的字符串result
     * 比较result和S的长度，返回较短的字符串
     * 结束
     */
    public static String compressString(String S){
        int j;
        int i=0;
        int N = S.length();
        StringBuilder sb = new StringBuilder();

        while(i<N){
            j=i;

            while(j<N && S.charAt(i)==S.charAt(j)){
                j++;
            }

            sb.append(S.charAt(i));
            sb.append(j-i);
            i=j;
        }

        String result = sb.toString();

        if(result.length()<S.length()){
            return result;
        }else {
            return S;
        }

    }
}
