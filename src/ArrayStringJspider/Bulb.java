package ArrayStringJspider;

import java.util.Scanner;

public class Bulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many bulbs u want to give");
        int n=sc.nextInt();
        boolean[] bulb=new boolean[n];
        System.out.println("Enter number of command");
        int c=sc.nextInt();
        String[] comm=new String[n];
        for (int i=0;i<comm.length;i++){
            comm[i]= sc.next();
        }
        calculateNoOfBulbs(bulb,comm);

    }
    public static void calculateNoOfBulbs(boolean[] bulbs,String[] comm){
        for (int i=0;i<comm.length;i++){
            String s=comm[i];
            int x=Character.getNumericValue(s.charAt(i));
            int y=Character.getNumericValue(s.charAt(i));
            if(s.charAt(0)=='F'){
                for (int j=x;j<=y;j++){
                    bulbs[j]=!bulbs[j];
                }
            }
            else {
                int count=0;
               for (int j=x;j<=y;j++){
                   if(bulbs[j]==true)
                       count++;
               }
                System.out.println(count);
            }
        }
    }
}
