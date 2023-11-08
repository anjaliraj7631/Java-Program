package Stack;

import java.util.Scanner;

public class Stack {
    int size;
    int top;
    int[] stack;
    Stack(int size){
        stack =new int[size];
        top=-1;
        this.size=size;
    }

    @Override
    public String toString(){
        String s="[" ;
        for (int i = 0; i <=top; i++) {
            if (i!=top)
                s=s+stack[i]+",";
            else
                s=s+stack[i];
        }
        s=s+"]";
        return s;
    }

   public boolean isEmpty(){
        return top==-1;
   }
   public boolean isFull(){
        return top==size-1;
   }
   public void push(int data){
       if(isFull()) {
           System.err.println("Stack Overflow");
       }
       else{
           top++;
           stack[top]=data;
           System.out.println(data+" is added successfully");
       }


   }
   public void pop(){
        int data;
        if (isEmpty()) {
            System.err.println("Stack Underflow");
        }
        else
        {
            data=stack[top];
            top--;
        }
   }
   public int peek(){
        if (top==-1)
            return -1;
        else
            return stack[top];
   }
}
class StackMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        Stack s=new Stack(size);
        boolean exit=false;
        while (!exit){
            System.out.println("1.Push \n2.Pop \n3.Empty \n4.Full \n5.Peek \n6.Display \n7.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the element to insert");
                    int data = sc.nextInt();
                    s.push(data);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    System.out.println(s.isEmpty());;
                        break;
                case 4:
                    System.out.println(s.isFull());;
                break;
                case 5:
                    if (s.peek()==-1)
                        System.err.println("No element found");
                    else
                        System.out.println(s.peek());
                    break;
                case 6:
                    System.out.println(s.toString());
                    break;
                case 7:
                    exit=true;
                    break;
                default:
                    System.err.println("invalid chice");
            }

        }
    }
}
