class Person {
    int age;
    String name;
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void displayRole() {
        System.out.println("Role: Person");
    }
}
class Teacher extends Person {
    String subject;
    Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }
    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
    }
}
class Student extends Person {
    char grade;
    Student(int age, String name, char grade) {
        super(age, name);
        this.grade = grade;
    }
    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }
}
class Staff extends Person {
    double salary;
    Staff(int age, String name, double salary) {
        super(age, name);
        this.salary = salary;
    }
    @Override
    void displayRole() {
        System.out.println("Role: Staff");
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Person person = new Person(20, "Jawahar");
        Teacher teacher = new Teacher(40, "BOB", "Cs");
        Student student = new Student(21, "James", 'A');
        Staff staff = new Staff(40, "Han", 40000);
        person.displayRole();
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}