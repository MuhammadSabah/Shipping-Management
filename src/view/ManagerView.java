package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagerView {
    public static void start() {
        Scanner input = new Scanner(System.in);
        int scanner;
        while (true) {
            System.out.println("*********************************************");
            System.out.printf("******** WELCOME %-20s *******\n", 1000);
            //1000 is placeholder for Admins First Name
            System.out.println("*********************************************");
            System.out.println("*** [1] Add Employee  ***********************");
            System.out.println("*** [2] Search Employee, order,container ****");
            System.out.println("*** [3] Show Employee, order, container *****");
            System.out.println("*** [4] Remove Employee *********************");
            System.out.println("*** [5] System Exit *************************");

            try {
                scanner = input.nextInt();
                if (scanner == 1) {
                    while (true) {
                        System.out.println("Enter EID for employee");
                        //placeholder
                        System.out.println("Enter Full name");
                        //placeholder
                        System.out.println("Enter Address");
                        //placeholder
                        System.out.println("Placeholder for other info");
                        System.out.println("for Confirming Enter 1, otherwise for resetting");
                        scanner = input.nextInt();
                        try {
                            if (scanner == 1) {
                                System.out.println("Confirmed");
                                break;
                            } else {
                                System.out.println("Reset");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("invalid input please try again");
                            input.next();
                        }
                    }
                } else if (scanner == 2) {
                } else if (scanner == 3) {
                } else if (scanner == 4) {
                } else if (scanner == 5) {
                    break;
                } else {
                    System.out.println("invalid input, Re-Enter");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Enter a number not a text");
                input.next(); //Resetting input
            }
        }
        input.close();
    }
}
