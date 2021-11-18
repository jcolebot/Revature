package revature;

public class StudentProfile {
    String firstName;
    String lastName;
    String major;
    double gpa;
    int graduationYear;

    public StudentProfile(String firstName, String lastName, String major,
                          double gpa, int graduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    public void incrementGraduationYear() {
        this.graduationYear = this.graduationYear + 1;
    }


    public static void main(String[] args) {
        StudentProfile newStudent1 = new StudentProfile("Jack", "Skellington", "Scares", 3.5, 2021);
        StudentProfile newStudent2 = new StudentProfile("Sally", "Ragdoll", "Chemistry", 3.67, 2020);
        newStudent1.incrementGraduationYear();
        newStudent2.incrementGraduationYear();
        System.out.println("Jack is expected to graduate in" + newStudent1.graduationYear);
        System.out.println("Sally is expected to graduate in" + newStudent2.graduationYear);
    }
}
