package RealTimeApplication;


public class Emp {
    private String emp_name;
    private double sal;
    private String designation;
    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
}
class Company{
    Emp e;
    public void addEmployee(Emp e) //helper method
    {
        if(this.e==null) {
            this.e = e;
            System.out.println("Employee is added to company");
        }
        else
            System.out.println("employee  is already there");
    }
    public void removeEmployee(Emp e){
        if(this.e!=null){
            this.e=null;
            System.out.println("Employee is removed");
        }
        else {
            System.out.println("Employee  is not there");
        }
    }
    public void displayDetails(Emp e){
        System.out.println("Employee Details:");
    }
}
class MainEMp{
    public static void main(String[] args) {
        Company c=new Company();
        c.addEmployee(new Emp());
        c.removeEmployee(new Emp());
//        c.displayDetails(new Emp());
        c.e.setEmp_name("Anjali");
        c.e.setDesignation("Developer");
        c.e.setSal(50000);
        c.e.setGender('F');
        System.out.println("Employee Name"+c.e.getEmp_name());



    }
}
