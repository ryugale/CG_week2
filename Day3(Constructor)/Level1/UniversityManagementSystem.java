class Student {
    public int rollNumber;
    protected String name;
    private float CGPA;
    Student(int rollNumber, String name, float CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public void updateCGPA(float CGPA) {
        this.CGPA = CGPA;
    }
    public float getCGPA() {
        return this.CGPA;
    }
 }
 
 class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, float CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
 }
 public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student jawa = new Student(362, "Jawahar", 8.7f);
        System.out.println("Initial CGPA: " + jawa.getCGPA());
        jawa.updateCGPA(9.1f);
        System.out.println("Updated CGPA: " + jawa.getCGPA());
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Robin", 9.5f);
        pgStudent.displayDetails();
    }
 }