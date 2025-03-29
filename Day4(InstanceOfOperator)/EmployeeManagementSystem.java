class Employee {
    static String companyName = "Living";
    private String name, designation;
    final String id;
    private static int totalEmployees = 0;
    Employee(String name, String id, String designation) {
    this.name = name;
    this.id = id;
    this.designation = designation;
    totalEmployees++;
    }
    static void displayTotalEmployees() {
    System.out.println("Total Employees: " + totalEmployees);
    }
    void displayEmployeeDetails() {
    System.out.println("Company Name: " + companyName);
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Designation: " + designation);
    }
   }
   public class EmployeeManagementSystem {
    public static void main(String[] args) {
    Employee emp1 = new Employee("Alice", "E001", "Developer");
    Employee emp2 = new Employee("Bob", "E002", "Manager");
    if (emp1 instanceof Employee) {
    emp1.displayEmployeeDetails();
    }
    if (emp2 instanceof Employee) {
    emp2.displayEmployeeDetails();
    }
    Employee.displayTotalEmployees();
    }
   }