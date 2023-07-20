import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Sambit", 101, 2000, new Date("01-04-2022"),
                "Manager", "7008338097", new Address("Baramunda", "Bhubaneswar", "Odisha", 751001)));
    
    }
    public static void arrangeEmployeeBySalary(Employee e[]){


//        List<Employee> employeeList = employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
//        System.out.println(employeeList);

    }
    public static void getEmployeesByJobPosition(Employee e[], String jp){

    }
    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2){

    }
    public static int foreignEmployeeCount(Employee e[]){

        return 0;
    }
    public static void getEmployeesBySalary(Employee e[], double s1, double s2){

    }
}