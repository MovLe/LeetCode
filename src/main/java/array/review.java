package array;

import java.util.Arrays;

/**
 * @ClassName review
 * @MethodDesc: TODO review功能介绍
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

}
