package NumberProgramming;

class Static {
    static int i=18;
    public static void m2(){
        System.out.println("bjbjb");
    }
    public  int m(){
        int j=12;
//        i=52;
        Static.m2();
        System.out.println(j);
        return i;
    }
    public static void main(String[] args) {
        System.out.println(i);
//        i=15;
        Static r=new Static();
        System.out.println(r.m());
    }
}
