package cn.geekhall.algorithms.divideandconquer;

/**
 * MatrixMultiply.java
 * 给定两个矩阵A和B，A=[aij] , B = [bij]
 * 计算矩阵的乘积
 *
 * @author yiny
 */
public class MatrixMultiplyProblem {


    public static int[][] bruteforce(int[][] a, int[][] b){

        int n = a.length;
        int[][] res = new int[n][n];

        for ( int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                int temp = 0;
                for (int k = 0; k < n; k++) {
                    temp += (a[i][k] + b[k][j]);
                }
                res[i][j] = temp;
            }
        }
        return res;
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            System.out.print("| ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,1},{1,1}};
        int[][] b = new int[][]{{1,1},{1,1}};
        printMatrix(a);
        printMatrix(b);
        printMatrix(bruteforce(a, b));
    }
}
