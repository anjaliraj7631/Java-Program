package NumberProgramming;
public class HappyNumber {
    public static void main(String[] args) {
        int num = 25;
        int sum = 0;
        int res = num;
        while (res != 1 && res != 4) {
            sum = 0;
            while (res > 0) {
                int rem = res % 10;
                sum += rem * rem;
                res = res / 10;
            }
            res = sum;
        }
        if (res == 1) {
            System.out.println(num + " is a happy number");
        } else {
            System.out.println(num + " is not a happy number");
        }
    }
}
