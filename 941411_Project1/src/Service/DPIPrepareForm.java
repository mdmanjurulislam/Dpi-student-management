package Service;
import DPIStudentSystem.DPIStudentForm;
import java.util.Scanner;


public class DPIPrepareForm {

    public static DPIStudentForm fillUp() {
        System.out.println("Please Fill Up the form:");

        Scanner scan = new Scanner(System.in);
        System.out.print("Id: ");
        int id = scan.nextInt();

        scan.nextLine();

        System.out.print("Your Name: ");
        String name = scan.nextLine();

        System.out.print("Your Department: ");
        String dept = scan.nextLine();

        System.out.print("Your Age: ");
        int age = scan.nextInt();

        System.out.print("Your Admission Year: ");
        int admissionYear = scan.nextInt();

        System.out.print("Your Contact: ");
        String contact = scan.next();

        System.out.print("Your Address: ");
        String address = scan.next();

        DPIStudentForm std = new DPIStudentForm(id, name, dept, age, admissionYear, contact);
        std.setAddress(address);

        return std;
    }
}