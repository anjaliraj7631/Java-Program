package RealTimeApplication;


import java.util.Scanner;

public class Mobile {
    int simslot=1;
    Sim s;
    public void addSim(Sim s) //helper method
    {
        if(this.s==null) {
            this.s = s;
            System.out.println("Sim is added to phone");
        }
        else
            System.out.println("Alrady sim card is there");
    }
    public void removeSim(Sim s){
        if(this.s!=null){
            this.s=null;
            System.out.println("Sim is removed");
        }
        else {
            System.out.println("sim is not there");
        }
    }
}
class Sim{
    private String simprovider;
    private long simno;

    public String getSimprovider() {
        return simprovider;
    }
    public void setSimprovider(String simprovider) {
        this.simprovider = simprovider;
    }

    public long getSimno() {
        return simno;
    }

    public void setSimno(long simno) {
        this.simno = simno;
    }

}
class SimMain{
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.addSim(new Sim());
//        m.s.setSimprovider("Jio");
//        m.s.setSimno(87125464654l);
//        System.out.println("Sim Number: "+m.s.getSimno());
//        System.out.println("Sim Provider: "+m.s.getSimprovider());
//        System.out.println("Sim Slot: "+m.simslot);
        m.addSim(new Sim());
//        System.out.println(m.s.simprovider);
        m.removeSim(new Sim());
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while (!exit){
            System.out.println("1.Add Sim \n2.Remove Sim \n3.Exit");
            int ch=sc.nextInt();
            switch (ch){
                case 1:m.addSim(new Sim());
                    m.s.setSimprovider("Jio");
                    m.s.setSimno(87125464654l);
                    System.out.println("Sim Number: "+m.s.getSimno());
                    System.out.println("Sim Provider: "+m.s.getSimprovider());
                    System.out.println("Sim Slot: "+m.simslot);
                    break;
                case 2:m.removeSim(new Sim());
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        System.err.println("Thanku");
    }
}
