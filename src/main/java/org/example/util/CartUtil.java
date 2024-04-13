package org.example.util;

import org.example.model.DataBase;

import java.util.Scanner;

public class CartUtil {
    public static void deleteCart() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the id of customer the card you want to delete:");
            int i = scanner.nextInt();
            //ERROR
            if (DataBase.customers[i]!= null) {
                if (DataBase.customers[i].getCart().status.equals("unblock")) {
                    System.out.println("The cart with this id is block");
                    break;
                } else {
                    System.out.println("Not find");
                    break;
                }

            } else {
                System.out.println("No customer found with this ID");
                break;
            }
        }
    }
}
