class Course{
    String coursename;
    int duration;
    int fee;
    static String institutename = "SRM";

    Course(String coursename, int duration, int fee){
        this.coursename= coursename;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails(){
        System.out.println("The institute name is "+institutename);
        System.out.println("The name of the course is "+coursename);
        System.out.println("The duration of the course is "+duration);
        System.out.println("The course fee is "+fee);
    }

    static void updateInstituteName(String institutename){
        Course.institutename = institutename;
        System.out.println("The new institute name is "+institutename);
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course = new Course("CSE", 4, 200000);
        course.displayCourseDetails();
        course.updateInstituteName("Eswari");
    }
}