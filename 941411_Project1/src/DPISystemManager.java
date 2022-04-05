import java.util.Scanner;
import java.util.ArrayList;

import DPICalculatorSystem.DPIAdvancedCalculator;
import DPIStudentSystem.DPIStudentForm;
import Service.DPIPrepareForm;
import Service.DPICalculatorServiceMsg;
import Service.DPIStudentServiceMsg;
import Service.DPICRUDServices;
import Service.DPISystemServices;


public class DPISystemManager {
    // main function
    public static void main(String[] args) {

        ArrayList<DPIStudentForm> Database = new ArrayList<>();
        int option;
        int operation;

        DPISystemServices ss;
        ss = new DPIStudentServiceMsg();

        DPISystemServices cs;
        cs = new DPICalculatorServiceMsg();

        while(true)
        {
            System.out.println("\n\nWelcome to our DPI Management System !!!\n");
            System.out.println("Press 1 for DPI Student Services.");
            System.out.println("Press 2 for DPI Calculator Services.");
            System.out.println("Press 0 for Exit.\n");

            Scanner scan = new Scanner(System.in);

            System.out.print("Press Option: ");
            option = scan.nextInt();

            if (option == 0)
                break;

            if (option == 1)
            {
                ss.greeting_message();
                while (true)
                {
                    ss.service_information();
                    System.out.print("Set Operation: ");
                    operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    // create | read | update | delete
                    switch (operation)
                    {
                        case 1:
                        { // create
                            DPIStudentForm std = DPIPrepareForm.fillUp();
                            DPICRUDServices.create(std, Database);
                            break;
                        }
                        case 2:
                        { // read
                            System.out.print("Search by your Id: ");
                            int search_id = scan.nextInt();
                            DPICRUDServices.filterById(search_id, Database);
                            break;
                        }
                        case 3:
                        { // update
                            System.out.print("Update through id: ");
                            DPIStudentForm update_std = DPIPrepareForm.fillUp();
                            DPICRUDServices.update(update_std, Database);
                            break;
                        }
                        case 4:
                        { // delete
                            System.out.print("Delete Id: ");
                            int delete_id = scan.nextInt();
                            DPICRUDServices.delete(delete_id, Database);
                            break;
                        }
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                ss.terminate_message();
            }
            else if (option == 2)
            {
                cs.greeting_message();
                while (true)
                {
                    double num1, num2;
                    int a, b, c;

                    cs.service_information();
                    System.out.print("Enter Operation: ");
                    operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    // addition | subtraction | multiplication | division
                    switch (operation)
                    {
                        case 1:
                        { // addition
                            System.out.print("Enter your 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            b = scan.nextInt();
                            System.out.print("Enter your 3rd value: ");
                            c = scan.nextInt();
                            DPIAdvancedCalculator.add(a, b, c);
                            break;
                        }
                        case 2:
                        { // subtraction
                            System.out.print("Enter your 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            b = scan.nextInt();
                            DPIAdvancedCalculator.sub(a, b);
                            break;
                        }
                        case 3:
                        { // multiplication
                            System.out.print("Enter your 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            b = scan.nextInt();
                            DPIAdvancedCalculator.multiply(a, b);
                            break;
                        }
                        case 4:
                        { // division
                            System.out.print("Enter your 1st value: ");
                            num1 = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            num2 = scan.nextInt();
                            DPIAdvancedCalculator.div(num1, num2);
                            break;
                        }
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                cs.terminate_message();
            }
            else {
                System.out.println("Invalid Options");
            }
        }
    }
}