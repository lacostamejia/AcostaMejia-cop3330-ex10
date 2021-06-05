/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */


import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared

        //Variables used
        String item_1;
        String item_2;
        String item_3;

        String quantity_1;
        String quantity_2;
        String quantity_3;

        double tax;
        double sub_total;
        double total;

        //Item 1
        System.out.print("Enter the price of item 1: ");
        item_1 = in.next();
        int item_11 = Integer.parseInt(item_1); //Converting string to numerical value

        System.out.print("Enter the quantity of item 1: ");
        quantity_1 = in.next();
        int quantity_11 = Integer.parseInt(quantity_1); //Converting string to numerical value

        //Item 2
        System.out.print("Enter the price of item 2: ");
        item_2 = in.next();
        int item_22 = Integer.parseInt(item_2); //Converting string to numerical value

        System.out.print("Enter the quantity of item 2: ");
        quantity_2 = in.next();
        int quantity_22 = Integer.parseInt(quantity_2); //Converting string to numerical value

        //Item 3
        System.out.print("Enter the price of item 3: ");
        item_3 = in.next();
        int item_33 = Integer.parseInt(item_3); //Converting string to numerical value

        System.out.print("Enter the quantity of item 3: ");
        quantity_3 = in.next();
        int quantity_33 = Integer.parseInt(quantity_3); //Converting string to numerical value

        sub_total = ((item_11 * quantity_11) + (item_22 * quantity_22) + (item_33 * quantity_33)); //Here we are calculating the subtotal
        tax = (0.055 * sub_total); //Here we are calculating the total taxes from the subtotal
        total = tax + sub_total; //Here we are adding the taxes and the subtotal to get the final total price.

        //Here we are printing the results
        System.out.printf("Subtotal: $%.2f",sub_total);
        System.out.println("");
        System.out.printf("Tax: $%.2f",tax);
        System.out.println("");
        System.out.printf("Total: $%.2f",total);

    }
}
