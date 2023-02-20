package PatternProblem;

public class p11 {
    public static void main(String[] args) {
//        int k=1;
//        for (int i =1 ; i <=5; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print( k++ + " ");
//            }
//            System.out.println( );
//        }

//        for (int row = 1; row <=5; row++) {
//            for (int col = 1; col <=row ; col++) {
//                for (int k = 0; k<=row; k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
        for (int i = 1; i <=5; i++) {
            char c='a';
            for (int j = 1; j <=i ; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();

        }
    }        
}
