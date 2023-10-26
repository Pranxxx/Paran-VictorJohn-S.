import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First Name: ");
        first_name = scan.next();

        System.out.print("Middle Name: ");
        middle_name = scan.next();

        System.out.print("Last Name: ");
        last_name = scan.next();

        System.out.print("Suffix: ");
        suffix = scan.next();
        
        System.out.print("Full Name: "+ getFullName());

        scan.close();
    }

    // Attributes
    public static String first_name;
    public static String middle_name;
    public static String last_name;
    public static String suffix;

    //Getters 
     public static String getFirstName() { return first_name;}
    public static String getMiddleName() { return middle_name;}
    public static String getLastName() {return last_name; }
    public static String getSuffix() {return suffix;}
    public static String getFullName() {
        return  "" + first_name + "" + middle_name + "" + last_name + "" +suffix + ""; 
    }

    
    //Setters 
    public void setFirstName(String firstName) { first_name = firstName;}
    public void setMiddleName(String middleName) { middle_name = middleName;}
    public void setLastName(String lastName) {last_name = lastName; }
    public void setSuffix(String Suffix) {suffix = Suffix;}

    
}
