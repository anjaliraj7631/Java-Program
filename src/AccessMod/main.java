package AccessMod;

public class main {
    public static void main(String[] args) {
        A obj=new A(12,"K");
        obj.getNum();
        int n=obj.num;// can access when num will be public,default,protected
    }
}
