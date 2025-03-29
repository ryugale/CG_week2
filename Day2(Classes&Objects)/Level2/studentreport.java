class student{
    String name;
    int rollnumber;
    int marks;

    student(String name, int rollnumber, int marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    String calculategrade(int marks){
        if(marks>100){
            return "invalid";
        }
        else if(marks>=90){
            return "A";
        }
        else if(marks>=80){
            return "B";
        }
        else if(marks>=70){
            return "C";
        }
        else{
            return "D";
        }
    }    
    void details(){
        System.out.println("Name: "+name);
        System.out.println("Rollnumber: "+rollnumber);
        System.out.println("marks: "+marks);
        System.out.println("Grade: "+calculategrade(marks));
    }
}
public class studentreport {
    public static void main(String[] args) {
        student child = new student("Mukesh", 74, 95);
        child.details();
    }
}