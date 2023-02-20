package Array;

public class Index {
    public static void main(String[] args) {
        int[] a={2,3,5,6,9};
        int c=a.length-1;
        for (int i:a) {
                System.out.println(a[c]);
            c--;
        }
    }
}
