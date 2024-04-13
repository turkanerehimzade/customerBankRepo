package org.example.util;

import org.example.model.DataBase;

import java.util.Scanner;

public class CustomerUtil {
    public static void deleteCustomer(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Customer'id which want to delete:");
            int i = scanner.nextInt();
            if (DataBase.customers[i] != null) {
                if (DataBase.customers[i].getIsActive() == true) {
                    System.out.println("The customer who owns this id delete..");
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
}}
