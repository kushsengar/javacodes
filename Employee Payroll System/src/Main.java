import java.util.ArrayList;
import java.util.Objects;

abstract class Employee{
    private String Id;
    private String name;
    public Employee(String Id,String name){
        this.Id=Id;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return Id;
    }
    public abstract double CalculateSalary();
    @Override
    public String toString(){
       return "Employee[name="+name+",Id="+Id+",salary="+CalculateSalary()+"]";
    }
}
class FullTimeEmployee extends Employee{
    private int monthlySalary;
    public  FullTimeEmployee(String Id,String name,int monthlySalary){
        super(Id, name);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double CalculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String Id, String name, int hoursWorked,double hourlyRate ){
        super(Id, name);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double CalculateSalary() {
        return hoursWorked*hourlyRate;
    }
}
class PayRollSystem{
    private ArrayList<Employee> employeelist;
    public PayRollSystem(){
            employeelist= new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }

    public void RemoveEmployee(String Id){
        Employee employeetToRemove=null;
        for (Employee employee: employeelist) {
            if (Objects.equals(employee.getId(), Id)){
                employeetToRemove= employee;
                break;
            }
        }
        if (employeetToRemove!=null){
            employeelist.remove(employeetToRemove);
        }
    }
    public void DisplayEmpployees(){
        for (Employee employee:employeelist) {
            System.out.println(employee);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PayRollSystem Ps= new PayRollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee("A1","kush",120000);
        PartTimeEmployee emp2= new PartTimeEmployee("B1","kartik",4,500);
        PartTimeEmployee emp3= new PartTimeEmployee("B2","avinash",5,500);
        Ps.addEmployee(emp1);
        Ps.addEmployee(emp2);
        Ps.addEmployee(emp3);
        System.out.println("details of employees :");
        Ps.DisplayEmpployees();
        System.out.println("removing employee , Layoff :");
        Ps.RemoveEmployee("B1");
        System.out.println("employees after Layoff :");
        Ps.DisplayEmpployees();

    }
}