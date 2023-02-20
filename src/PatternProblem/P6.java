package PatternProblem;

public class P6 {
    public static void main(String[] args) {
        Pattern6(5);
    }
    static void Pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalNoOfCol=row > n ? 2*n-row : row;
            int totalSpace=n-totalNoOfCol;
            for (int space = 0; space <totalSpace ; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalNoOfCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
