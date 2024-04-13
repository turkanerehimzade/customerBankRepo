package org.example.model;

public class Menu {
    public static void menu(){
        String list="\n1.To see the list of customers and their cards"+
                "\n 2.Add and remove customers"+
                "\n 3.Blocking and unblocking the customer's card"+
                "\n 4.Create a new card for the customer"+
                "\n 5.Log out";
        System.out.println(list);
    }
}
