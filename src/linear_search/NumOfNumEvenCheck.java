package linear_search;

public class NumOfNumEvenCheck {
    public static void main(String[] args) {
        int[] num={18,124,9,1764,98,2};
        System.out.println(findNumbers(num));
        System.out.println(digits(-13156));
        System.out.println(digits1(-978654));
    }
    static int findNumbers(int[] nums){
        int c=0;
        for(int num:nums){
            if(even(num)){
                c++;
            }
        }
        return c;
    }

    static boolean even(int num){
        int numOfDigit=digits(num);
        if(numOfDigit%2==0){
            return true;
        }
        return false;
    }

    static int digits1(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
