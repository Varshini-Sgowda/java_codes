class Employee{
    String name;
    double basicsalary;
    double GrossSalary(){
        return basicsalary + (0.2*basicsalary) + (0.1*basicsalary);
    }
}
public class hw5{
    public static void main(String[] args){
        Employee E1=new Employee();
        E1.name="Varshini";
        E1.basicsalary=100255;
        System.out.println("GrossSalary= " + E1.GrossSalary());
    }
}