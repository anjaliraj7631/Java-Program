package ObjectClass;

import java.util.Arrays;

public class Student {
    int sid;
    String sname;
    char gender;
    Student(int sid,String sname,char gender){
        this.sid=sid;
        this.sname=sname;
        this.gender=gender;
    }
    @Override
    public boolean equals(Object o){
        Student ref=(Student) o;
        return this.sname.equals(ref.sname) && this.sid==ref.sid && this.gender==ref.gender;
    }
    @Override
    public int hashCode(){
        int res=sid+(int)gender+sname.hashCode();
        return res;
    }
}
class Main{
    public static void main(String[] args) {
        Student s1=new Student(10,"Anjali",'f');
        Student s2=new Student(10,"Anjali",'f');
        Student s3=s1;
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        int h1=s1.hashCode();
        int h2=s2.hashCode();
        System.out.println(h1==h2);
    }
}
