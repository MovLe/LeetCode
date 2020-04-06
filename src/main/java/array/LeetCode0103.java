package array;

/**
 * @ClassName LeetCode0103
 * @MethodDesc: TODO LeetCode0103功能介绍
 * @Author Movle
 * @Date 4/6/20 9:32 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode题目：
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度
 */


public class LeetCode0103 {

    public static void main(String[] args) {

        System.out.println(replaceSpaces("Mr John Smith",13));

        System.out.println(replaceSpaces2("               ",5));
    }

    /**
     * 方法一
     * 新建一个StringBuilder sb
     * 用for循环遍历，结束条件是小于length
     * 遍历字符串S的第i个字符
     * 当字符为空格时，sb新增元素%20
     * 否则将S的第i个元素加到sb后面
     * 循环结束，将sb转化为String返回即可
     */
    public static String replaceSpaces(String S,int length){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<length;i++){
            if(S.charAt(i)==' '){
                sb.append("%20");
            }else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 方法二：
     * 已知字符串后面是空格，，所以将要转化的字符串除了后面的截取
     * 然后再将截取后的字符串中的空格替换为%20即可
     */
    public static String replaceSpaces2(String S,int length){
        String s1 = S.substring(0,length);
        String s2 = S.replaceAll(" ","%20");

        return s2;
    }
}
