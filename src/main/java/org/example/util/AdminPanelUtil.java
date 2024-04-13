package org.example.util;

import org.example.model.Menu;

import java.util.Scanner;

public class AdminPanelUtil {
    public static void logIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Console Admin Panel");
        for (int i = 0; i < 3; i++) {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();


            if (username.equals("turkane") && password.equals("turkane09")) {
                System.out.println("Login successful!");
                Menu.menu();
                break;
            }
            else {
                System.out.println("INCORRECT!!!");
                if (i < 2) {
                    System.out.println("Try again:");
                } else {

                    System.out.println("Incorrect username or password. Access denied.");
                    System.exit(0);
                }
            }
        }
    }
}
