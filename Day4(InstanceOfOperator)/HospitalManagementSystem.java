class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    final String patientID;
    private String name;
    private int age;
    private String ailment;
    Patient(String patientID, String name, int age, String ailment) {
    this.patientID = patientID;
    this.name = name;
    this.age = age;
    this.ailment = ailment;
    totalPatients++;
    }
    static int getTotalPatients() {
    return totalPatients;
    }
    void displayPatientDetails() {
    System.out.println("Patient ID: " + patientID);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Ailment: " + ailment);
    System.out.println("Hospital Name: " + hospitalName);
    }
   }
   public class HospitalManagementSystem {
    public static void main(String[] args) {
    Patient patient1 = new Patient("P001", "John Doe", 30, "Fever");
    Patient patient2 = new Patient("P002", "Jane Smith", 25, "Cold");
    if (patient1 instanceof Patient) {
    patient1.displayPatientDetails();
    }
    if (patient2 instanceof Patient) {
    patient2.displayPatientDetails();
    }
    System.out.println("Total Patients Admitted: " +
   Patient.getTotalPatients());
    }
   }
