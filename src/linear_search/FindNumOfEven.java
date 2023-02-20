package linear_search;

public class FindNumOfEven {
    public static void main(String[] args) {
        int[] num={18,293,899,1233,0,91,8382};
        System.out.println(findNumber(num));
        System.out.println(digit(-29874));
    }
    static int findNumber(int[] num){
        int count=0;
        for(int i=0;i<num.length;i++){
            if(even(num[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigit=digit(num);
        if(numberOfDigit%2==0){
            return true;
        }
        return false;
    }
    static int digit(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
