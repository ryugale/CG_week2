class Employee{
    String name;
    int id;
    int salary;
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("Salary "+salary);
    }
}
class Manager extends Employee{
    int teamsize;
    Manager(String name, int id, int salary, int teamsize){
        super(name,id,salary);
        this.teamsize = teamsize;}
        void displayDetails(){
            System.out.println("Name "+name);
            System.out.println("ID "+id);
            System.out.println("Salary "+salary);
            System.out.println("TeamSize "+teamsize);
    }      
    }
    class Developer extends Employee{
        String language;
        Developer(String name, int id, int salary, String language){
            super(name,id,salary);
            this.language = language;}
            void displayDetails(){
                System.out.println("Name "+name);
                System.out.println("ID "+id);
                System.out.println("Salary "+salary);
                System.out.println("Programming Language "+language);
        }         
        }
        class Intern extends Employee{
            Intern(String name, int id, int salary){
                super(name,id,salary);
            }
                void displayDetails(){
                    System.out.println("Name "+name);
                    System.out.println("ID "+id);
                    System.out.println("Salary "+salary);
            }
                
            }
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp = new Employee("Dina", 001, 1000000);
        Manager manager = new Manager("Jawa", 002, 1001, 4);
        Developer dev = new Developer("buwan", 003, 1000002, "python");
        Intern intern = new Intern("karun",000, 100);
        emp.displayDetails();
        manager.displayDetails();
        dev.displayDetails();
        intern.displayDetails();
    }
}