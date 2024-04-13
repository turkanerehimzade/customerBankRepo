package org.example.util;

import org.example.model.Cart;
import org.example.model.Customer;
import org.example.model.DataBase;

import java.util.Scanner;

public class AllCustomerUtil {
    public static Customer createCustom(Cart cart){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter customer's name:");
        String name= scanner.next();
        System.out.println("Enter customer's surname:");
        String surname= scanner.next();
        Customer customer=new Customer((long) DataBase.customerInndex,name,surname,cart);
        DataBase.addCustomer(customer);
        DataBase.printCustomer();
        System.out.println("Customer add successfully");
        return customer;
    }
    public static Cart createCart(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter cart's cartNumber");
        String  cartNumber= scanner.next();
        System.out.println("Enter carts expriDate:");
        String expriyDate= scanner.next();
        System.out.println("Enter cart's cvv");
        String cvv= scanner.next();
        Cart cart=new Cart(cartNumber,expriyDate,cvv);
        return cart;
    }
    public static Cart newCart(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Customer's id which want to create new cart:");
        int a=scanner.nextInt();
        if(DataBase.customers[a]!=null){
            Cart b=createCart();
        Customer customer=new Customer(DataBase.customers[a].getName(),DataBase.customers[a].getSurname(),b);
        DataBase.printCustomer();
        return customer.getCart();
    }

        return not();
    }
    public static Cart not(){
        System.out.println( "There is no customer with this ID");
        return null;
    }
    public static void operationCustomer(){
        Scanner scanner=new Scanner(System.in);
        String list2="1.want to add"+
                  "\n 2.want to delete";
        System.out.println(list2);
        int a=scanner.nextInt();
        switch (a){
            case 1: AllCustomerUtil.createCustom(createCart());
            break;
            case 2: CustomerUtil.deleteCustomer();
            break;
        }
    }

}
