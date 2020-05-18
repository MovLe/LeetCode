package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName review
 * @MethodDesc: 回顾之前做的题
 * @Author Movle
 * @Date 5/17/20 7:06 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class review {

    public static void main(String[] args) {

    }

    public static boolean CheckPermutation(String s1,String s2){

        char[] schar1 = s1.toCharArray();
        char[] schar2 = s2.toCharArray();

        if(schar1.length!=schar2.length){
            return false;
        }
        Arrays.sort(schar1);
        Arrays.sort(schar2);

        String ss1 = String.copyValueOf(schar1);
        String ss2 = String.copyValueOf(schar2);

        if (ss1.equals(ss2)) {

            return true;
        }else {
            return false;
        }

    }
    public static String replaceSpaces(String s1,int length){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<length;i++){
            if(s1.charAt(i)==' '){
                sb.append("20%");
            }else{
                sb.append(s1.charAt(i));
            }
        }

        return sb.toString();
    }

    public static boolean canPermutePalindrome(String S){

        Set<Character> sets = new HashSet<Character>();

        char[] c1 = S.toCharArray();

        for(int i=0;i<S.length();i++){
            if(!sets.add(c1[i])){
                sets.remove(c1[i]);
            }
        }

        return sets.size()<=1;

    }

    public static boolean oneEditAway(String first,String second){
        int len1 = first.length();
        int len2 = second.length();

        if(Math.abs(len1-len2)>1){
            return false;
        }

        if(len2>len1){
            String tem = first;
            first=second;
            second=tem;
        }

        int l1 = first.length();
        int l2 = second.length();

        for(int i=0;i<l1;i++){
            if(first.charAt(i)!=second.charAt(i)){
                return first.substring(i+1).equals(second.substring(l1==l2?i+1:i));
            }
        }
        return true;

    }
}
