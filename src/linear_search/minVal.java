package linear_search;

public class minVal {
    public static void main(String[] args) {
        int[] num={5,2,19,-2,8,84,29,76,34};
        System.out.println(min(num));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]<ans) {
                ans=arr[i];
            }
        }
        return ans;
    }
}
