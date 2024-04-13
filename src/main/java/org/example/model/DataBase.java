package org.example.model;

import java.util.Arrays;

public class DataBase {
    public static Customer[] customers=new Customer[10];
    private static Cart[] carts= new Cart[10];
    public static int customerInndex=0;
    public static void addCustomer(Customer customer){
//        Customer[] Customer = new Customer[0];
        customers[customerInndex++]=customer;
    }
    public static Customer printCustomer(){
        for(Customer customer:customers){
            if(customer!=null){
                System.out.println(customer.getID()+")"+customer.getName()+" "+customer.getSurname()+"--->"+ customer.getCart().getCartNumber());
            }else{
                System.out.println("this list is null");
                break;
            }
        }
        return null;
    }
    public static boolean customerList(){
        for(Customer customer:customers){
            return customer.getIsActive();
        }
        return false;
    }

}
