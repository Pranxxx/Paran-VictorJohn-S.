import java.util.Scanner;

class Student {

    // Student Attributes.
    private int studentID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private int yearLevel;
    private String phoneNumber;
    private String email;

    // Constructor for Student Class.
    public Student(int studentID, String firstName, String middleName, String lastName, String suffix, int age, int yearLevel, String phoneNumber, String email) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
        this.yearLevel = yearLevel;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Gettters for Student Attributes.
    public int getStudentID() {return studentID;}
    public String getFirstName() {return firstName;}
    public String getMiddleName() {return middleName;}
    public String getLastName() {return lastName;}
    public String getSuffix() {return suffix;}
    public int getAge() {return age;}
    public int getYearLevel() {return yearLevel;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getEmail() {return email;}

    // Settters for Student Attributes.
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

    // Course Class.
class Course {

    // Course Attributes.
    private String courseName;
    private String courseCode;
    private String department;

    // Constructor for Course Class.
    public Course(String courseName, String courseCode, String department) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.department = department;
    }

    // Getters for Course Attributes.
    public String getCourseName() {return courseName;}
    public String getCourseCode() {return courseCode;}
    public String getDepartment() {return department;}

    // Setters for Course Attributes.

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
    // MAIN CLASS to Execute the program.
public class Midterm_Examination {
    private static Student student;
    private static Course course;

    
    // Method for User to input his/her informations.
    public static void createStudentRecord(Scanner scanner) {
        System.out.println("Enter Student Details:");
        System.out.println("-------------------------");
        System.out.print("Student ID No.: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Year Level: ");
        int yearLevel = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        student = new Student(studentID, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email);
    }

    // Method for user to update his/her information.
    public static void updateStudentRecord(Scanner scanner) {

        // Condition if User didn't input his/her Information.
        if (student == null) {
            System.out.println("No student record exists. Please create one first.");
            return;
        }

        System.out.println("Student Profile Details Update Selection Menu:");
        System.out.println("-----------------------------------");
        System.out.println("1. Update Student ID No.");
        System.out.println("2. Update First Name");
        System.out.println("3. Update Middle Name");
        System.out.println("4. Update Last Name");
        System.out.println("5. Update Suffix");
        System.out.println("6. Update Age");
        System.out.println("7. Update Year Level");
        System.out.println("8. Update Phone Number");
        System.out.println("9. Update Email");
        System.out.println("0. Return");
        System.out.println("-----------------------------------");
        System.out.print("Enter Selection: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Switch Case Conditions for the user to choose which information to update. 
        switch (choice) {
            case 1:
                System.out.print("Enter new Student ID No.: ");
                int newStudentID = scanner.nextInt();
                student.setStudentID(newStudentID);
                break;
            case 2:
                System.out.print("Enter new First Name: ");
                String newFirstName = scanner.nextLine();
                student.setFirstName(newFirstName);
                break;
            case 3:
                System.out.print("Enter new Middle Name: ");
                String newMiddleName = scanner.nextLine();
                student.setMiddleName(newMiddleName);
                break;
            case 4:
                System.out.print("Enter new Last Name: ");
                String newLastName = scanner.nextLine();
                student.setLastName(newLastName);
                break;
            case 5:
                System.out.print("Enter new Suffix: ");
                String newSuffix = scanner.nextLine();
                student.setSuffix(newSuffix);
                break;
            case 6:
                System.out.print("Enter new Age: ");
                int newAge = scanner.nextInt();
                student.setAge(newAge);
                break;
            case 7:
                System.out.print("Enter new Year Level: ");
                int newYearLevel = scanner.nextInt();
                student.setYearLevel(newYearLevel);
                break;
            case 8:
                scanner.nextLine(); // Consume newline character
                System.out.print("Enter new Phone Number: ");
                String newPhoneNumber = scanner.nextLine();
                student.setPhoneNumber(newPhoneNumber);
                break;
            case 9:
                System.out.print("Enter new Email: ");
                String newEmail = scanner.nextLine();
                student.setEmail(newEmail);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
    }

    // Method For the user to choose his/her Course Name
    public static void updateCourse(Scanner scanner) {

        // Condition if User didn't input his/her Information.
        if (student == null) {
            System.out.println("No student record exists. Please create one first.");
            return;
        }
        System.out.println("Select Student Course Details: (Update)");
        System.out.println("-----------------------------------");
        System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
        System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
        System.out.println("3. Associative of Computer Technology (ACT)");
        System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
        System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
        System.out.println("-----------------------------------");
        System.out.print("Enter Selection: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Switch Case Conditions for the user to choose which Course information to update. 
        switch (choice) {
            case 1:
                course = new Course("Bachelor of Science in Information Technology", "BSIT", "College of Computer Studies");
                break;
            case 2:
                course = new Course("Bachelor of Science in Computer Science", "BSCS", "College of Computer Studies");
                break;
            case 3:
                course = new Course("Associative of Computer Technology", "ACT", "College of Computer Studies");
                break;
            case 4:
                course = new Course("Bachelor of Science in Mechanical Engineering", "BSME", "College of Engineering Department");
                break;
            case 5:
                course = new Course("Bachelor of Science in Civil Engineering", "BSCE", "College of Engineering Department");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
    }
    // Method for user to see his/her Informtaion which the user input.
    public static void displayStudentDetails() {
        if (student == null) {
            System.out.println("No student record exists. Please create one first.");
            return;
        }

        System.out.println("Student Record");
        System.out.println("-------------------------");
        System.out.println("0. Exit");
        System.out.println("-------------------------");
        System.out.println("Student Profile Details:");
        System.out.println("> Student ID No.: " + student.getStudentID());
        System.out.println("> First Name: " + student.getFirstName());
        System.out.println("> Middle Name: " + student.getMiddleName());
        System.out.println("> Last Name: " + student.getLastName());
        System.out.println("> Suffix: " + student.getSuffix());
        System.out.println("> Age: " + student.getAge());
        System.out.println("> Year Level: " + student.getYearLevel());
        System.out.println("> Phone Number: " + student.getPhoneNumber());
        System.out.println("> Email: " + student.getEmail());

        // Condition if Course is given or not.
        if (course != null) {
            System.out.println("\nStudent Course Details:");
            System.out.println("> Course Name: " + course.getCourseName());
            System.out.println("> Course Code: " + course.getCourseCode());
            System.out.println("> Department: " + course.getDepartment());
        }
    }

    // Main Method for the inputted Custom Methods and Classess to be called.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int choice; // decleration for switch case 

        // Display first the Choices for the User to pick a function, by using Do While Loop
        do {
            System.out.println("\nStudent Record Management App v1\n");
            System.out.println("Selection Menu");
            System.out.println("-------------------------");
            System.out.println("1. Create Student Record");
            System.out.println("2. Update Student Record");
            System.out.println("3. Update Course");
            System.out.println("4. Display Student Details");
            System.out.println("0. Exit");
            System.out.println("-------------------------");
            System.out.print("Enter Selection: ");
            choice = scanner.nextInt();

            // If User input the same given number, it release it's function  
            switch (choice) {
                case 1:
                    createStudentRecord(scanner);
                    break;
                case 2:
                    updateStudentRecord(scanner);
                    break;
                case 3:
                    updateCourse(scanner);
                    break;
                case 4:
                    displayStudentDetails();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }

            // This Function tells the user if the input is zero or (0) it will stop the Program
        } while (choice != 0);
    }

}