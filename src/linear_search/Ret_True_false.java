package linear_search;

public class Ret_True_false {
    public static void main(String[] args) {
        int[] num={5,2,19,-2,-1,84,29,76,34};
        int tar=-84;
        System.out.println(linearSearch(num,tar));
    }
    static boolean linearSearch(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
