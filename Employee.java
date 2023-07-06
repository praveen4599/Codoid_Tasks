
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    private String name;
    private int age;
    private String department;
    private double salary;
    private int employeeId;

    public Employee(String name, int age, String department, double salary, int employeeId) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public Employee(Employee other) { // Copy COnstructor..
        this.name = other.name;
        this.age = other.age;
        this.department = other.department;
        this.salary = other.salary;
        this.employeeId = other.employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Praveen Raj", 24, "Dev", 25000.0, 100));
        employees.add(new Employee("Naveen", 24, "Management", 45000.0, 101));
        employees.add(new Employee("Kirubakaran", 24, "Logistics", 55000.0, 102));
        employees.add(new Employee("Aakash", 24, "DBA", 35000.0, 103));
        employees.add(new Employee("Sivaneshan", 24, "Designer", 35000.0, 104));
        employees.add(new Employee("Suresh", 24, "Tester", 30000.0, 105));

        Employee praveen = new Employee(employees.get(0));
        
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " +
                    employee.getAge() + " " +
                    employee.getDepartment() + " " +
                    employee.getSalary() + " " + 
                    employee.getEmployeeId());
        }

        praveen.setSalary(35000.0);

        // Performing Operations using copy constructor
        
        Employee originalEmployee = employees.get(0);
        Employee copiedEmployee = new Employee(originalEmployee);

        copiedEmployee.setSalary(40000.0);
        copiedEmployee.setName("Naresh");
        copiedEmployee.setEmployeeId(106);
        employees.add(copiedEmployee);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " +
                    employee.getAge() + " " +
                    employee.getDepartment() + " " +
                    employee.getSalary() + " " + 
                    employee.getEmployeeId());
        }

/* Two Search Operations Search by Name and Search by employeeId */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name of the employee to retrieve the details: ");

        String nameOfEmployee = scan.nextLine();
        int isFound = 0;

        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(nameOfEmployee)) {
                System.out.println("Employee name found");
                System.out.println(employee.getName() + " " +
                        employee.getAge() + " " +
                        employee.getDepartment() + " " +
                        employee.getSalary());
                isFound = 0;
                break;
            } else {
                isFound += 1;
            }
        }

        if (isFound > 1) {
            System.out.println("Employee name not found");
        }

        System.out.print("Enter the Employee ID to retrieve the details: ");
        int idOfEmployee = scan.nextInt();

        for (Employee employee : employees) {
            if (employee.getEmployeeId() == idOfEmployee) {
                System.out.println("Employee ID found");
                System.out.println(employee.getName() + " " +
                        employee.getAge() + " " +
                        employee.getDepartment() + " " +
                        employee.getSalary());
                isFound = 0;
                break;
            } else {
                isFound += 1;
            }
        }

        if (isFound > 1) {
            System.out.println("Employee ID not found");
        }

        scan.close();
    }
}
