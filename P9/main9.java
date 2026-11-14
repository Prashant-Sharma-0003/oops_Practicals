class Employee { String name; double salary; 
static int employeeCount = 0; 
Employee() { 
    this("Default Employee", 0.0); 
} 
Employee(String name, double salary) { 
    this.name = name; 
    this.salary = salary; 
} 
void displayDetails() { 
    System.out.println("Employee Name: " + name); 
    System.out.println("Salary: ₹" + salary); 
    System.out.println("-----------------------------------"); 
} 
static void displayEmployeeCount() { 
    System.out.println("Total Employees Created: " + employeeCount); 
}
} 
public class Main { public static void main(String[] args) 
    System.out.println("--- Creating Objects ---"); 
    Employee emp1 = new Employee();                             
    emp1.displayDetails(); 
    Employee.displayEmployeeCount(); 
    System.out.println(); 
    Employee emp2 = new Employee("Aarav Sharma", 50000.0);      
    emp2.displayDetails(); 
    Employee.displayEmployeeCount(); 
    System.out.println(); 
    Employee emp3 = new Employee("Priya Verma", 75000.0);       
    emp3.displayDetails(); 
    System.out.println("--- Final Summary ---"); 
    Employee.displayEmployeeCount(); 
} 
                  }
