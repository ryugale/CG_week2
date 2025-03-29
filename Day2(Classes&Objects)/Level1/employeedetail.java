class employee {
    String name;
    int id;
    int salary;

    employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void getdetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
    
}
public class employeedetail{
    public static void main(String[] args) {
        employee emp = new employee("Dina", 97, 100000);
        emp.getdetail();
    }
}