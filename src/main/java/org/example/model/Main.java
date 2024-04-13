package org.example.model;

import org.example.util.AdminPanelUtil;
import org.example.util.AllCustomerUtil;
import org.example.util.CartUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdminPanelUtil.logIn();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    DataBase.printCustomer();
                    break;
                case 2:
                    AllCustomerUtil.operationCustomer();

                    break;
                case 3:
                    CartUtil.deleteCart();
                    break;
                case 4:
                    AllCustomerUtil.newCart();
                    break;
                case 5:
                    System.out.println("Sistemden chixildi...");
                    System.exit(0);
                default:
                    System.out.println("Daxil etdiyiniz reqem menyuda yoxdur...");
            }
            Menu.menu();
        }
    }

}