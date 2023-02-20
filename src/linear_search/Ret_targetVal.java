package linear_search;

public class Ret_targetVal {
    public static void main(String[] args) {
        int[] num={5,2,19,-2,-1,84,29,76,34};
        int tar=84;
        System.out.println(linearSearch(num,tar));
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            if(target==arr[index]){
                return target;
            }
        }
        return -1;
    }
}
