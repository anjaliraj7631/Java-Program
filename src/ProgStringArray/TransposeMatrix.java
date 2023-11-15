package ProgStringArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] transposeMatrix=new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposeMatrix[j][i]=matrix[i][j];
            }
        }
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j <transposeMatrix[i].length ; j++) {
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
