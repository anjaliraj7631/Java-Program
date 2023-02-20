package linear_search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts= {
                {1, 2, 3},
                {3, 2},
                {5, 2, 4},
                {6, 1, 2, 1, 2}
        };
        System.out.println(max(accounts));
    }
    static int max(int[][] account){
        int ans=Integer.MIN_VALUE;
        for (int person=0;person<account.length;person++){
            int sum=0;
            for (int acc=0;acc<account[person].length;acc++){
                sum+=account[person][acc];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
