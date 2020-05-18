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
    public static String compressString(String S){
        int i=0;
        int length = S.length();
        int j;

        StringBuilder sb = new StringBuilder();

        while(i<length){
            j=i;
            while(j<length && S.charAt(j)==S.charAt(i)){
                j++;
            }
            sb.append(S.charAt(i));
            sb.append(j-i);

            i=j;
        }

        String result = sb.toString();

        if(result.length()>S.length()){
            return S;
        }else {
            return result;
        }
    }

    public static void rotate(int[][] matrix){
        int n =matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tem = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }

        int mid = n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<mid;j++){
                int tmp = matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=tmp;
            }
        }

    }
    public static void setZeros(int[][] matrix){
        HashSet<Integer> row_set = new HashSet<Integer>();
        HashSet<Integer> col_set = new HashSet<Integer>();


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row_set.add(i);
                    col_set.add(j);
                }
            }
        }

        for(int row:row_set){
            Arrays.fill(matrix[row],0);
        }

        for(int col:col_set){
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
        }

    }

    public static boolean isFlipedString(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(0)==s2.charAt(i)){
                StringBuilder sb = new StringBuilder(s2.substring(i));
                sb.append(s2.substring(0,i));

                if(s1.equals(sb.toString())){
                    return true;
                }

            }
        }
        return false;
    }
}
