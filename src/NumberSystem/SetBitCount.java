package NumberSystem;

public class SetBitCount {
    public static void main(String[] args) {
        int n=45;
        int c=0;
        while (n>0){
            c++;
            n-=(n & -n); // n=n&(n-1)
        }
        System.out.println(c);
    }
}
