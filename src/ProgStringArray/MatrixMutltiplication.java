package ProgStringArray;

public class MatrixMutltiplication {
    public static void main(String[] args) {
        int[][] m1={{1,2},{3,4}};
        int[][] m2={{2,4},{6,8}};
        // (1*2)+(2*6)  (1*4)+(2*8)
        int[][] mul=new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                for (int k = 0; k < m1.length; k++) {
                    mul[i][j]+=m1[i][k]*m2[k][j];
                }
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
