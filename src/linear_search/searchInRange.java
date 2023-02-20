package linear_search;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr={3,18,24,-8,19,73,-92,28};
        int target=19;
        System.out.println(search(arr,target,1,5));
    }
    static int search(int[] num,int target,int start,int end){
        if(num.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            if(target==num[i]){
                return i;
            }
        }
        return -1;
    }
}
