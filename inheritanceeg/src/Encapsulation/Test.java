package Encapsulation;

public class Test {
    public static void main(String[] args){
       Employee e=new Employee();
       e.setEmployeeid(101);
       e.setEmployeename("John");
       e.setEmployeeaddress("California");
       System.out.println("the employee name is"+e.getEmployeename()+" and"+"employee id is"+e.getEmployeeid()+" and he belongs to"+e.getEmployeeaddress());
    }
}
