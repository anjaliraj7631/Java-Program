package PatternProblem;

public class P5 {
    public static void main(String[] args) {
        Pattern5(5);
    }
    static void Pattern5(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalColInRows=row>n ? 2*n-row:row;
            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
