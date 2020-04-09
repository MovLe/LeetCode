package array;

/**
 * @ClassName LeetCode0107 旋转矩阵
 * @MethodDesc:
 * @Author Movle
 * @Date 4/9/20 9:09 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。
 * 请你设计一种算法，将图像旋转 90 度
 */

public class LeetCode0107 {
    public static void main(String[] args) {

        int [][] matrix ={  {1,2,3},
                            {4,5,6},
                            {7,8,9} };
       rotate(matrix);

       printMartix(matrix);

    }

    /**
     * 方法一
     * 首先根据矩阵martix的对角线{1,5,9}进行翻转
     * {{1,2,3},
     * {4,5,6},
     * {7,8,9}}
     * 转换为
     * {{1,4,7},
     * {2,5,8},
     * {3,6,9}}
     * 即外层循环，以i为下标，从0开始，遍历到n-1
     * 内存循环，一j=i+1开始，遍历到n-1
     * 进行matrix[i][j]与matrix[j][i]互换
     * 再根据每一行的中点进行翻转
     * 即转换为
     * {{7,4,1},
     * {8,5,2},
     * {9,6,3}}
     * 即外层循环，以i=0为开始下表，遍历到n-1
     * 内层循环以j-0为开始下标，遍历到n/2-1
     * 进行martix[i][j]与matrix[i][n-j-1]互换
     * 循环结束则旋转结束
     */
    public static void rotate(int[][] matrix){

        int n =matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
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

    public static void printMartix(int [][] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
