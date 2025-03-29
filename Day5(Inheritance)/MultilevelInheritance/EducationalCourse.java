class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
class OnlineCourse extends Course {
    boolean isRecorded;
    OnlineCourse(boolean isRecorded, String courseName, int duration) {
        super(courseName, duration);
        this.isRecorded = isRecorded;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Is Recorded: " + (isRecorded ? "Yes"
                : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;
    PaidOnlineCourse(double fee, double discount, boolean isRecorded, String courseName, int duration) {
        super(isRecorded, courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 4);
        course.displayDetails();
        System.out.println();
        OnlineCourse onlineCourse = new OnlineCourse(true,"Advanced Java", 6);
        onlineCourse.displayDetails();
        System.out.println();
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse(200.0, 10.0, true, "Java Masterclass", 8);
        paidOnlineCourse.displayDetails();
    }
}