
package registration;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        studentRegistration studentRegistration = new studentRegistration();
        showAllStudents showAllStudetns = new showAllStudents();
        editStudentinfo editStudentinfo = new editStudentinfo();
        deleteStudent deleteStudent = new deleteStudent();

       System.out.println("What do you want to do?");
        System.out.println("1. Add student");
        System.out.println("2. Show all students");
        System.out.println("3. Edit student info");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1: 
                studentRegistration.studentInforegistr();
                break; 
            case 2: 
                showAllStudetns.showAllStudents();
                break;
            case 3:
                editStudentinfo.edit();
                break; 
            case 4:
                deleteStudent.delete();
                break;   
            case 5:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
    }
}
