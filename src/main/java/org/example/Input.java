package org.example;

import org.example.order.OrderListRepo;
import org.example.order.OrderMapRepo;
import org.example.shop.ShopService;

import java.util.Scanner;

public class Input {

    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    Scanner scanner = new Scanner(System.in);

    public Input(){
        gui();
    }

    private void gui(){
        String choice = "";

        System.out.println("-------------------------------------------");
        System.out.println("|       Welcome to your ShopService       |");
        System.out.println("-------------------------------------------");
        System.out.println("|    OrderRepo with List or with Map?     |");
        System.out.println("|    List (l)                             |");
        System.out.println("|    Map (m)                              |");
        System.out.println("|    Exit (e)                             |");
        System.out.println("-------------------------------------------");
        do {
            System.out.print("     Enter your choice: ");
            choice = scanner.nextLine();
            if(!choice.equalsIgnoreCase("l") && !choice.equalsIgnoreCase("m") && !choice.equalsIgnoreCase("e")) {
                System.out.println(RED + "     Invalid choice! Try again." + RESET);
            }
        }
        while (!choice.equalsIgnoreCase("l") && !choice.equalsIgnoreCase("m") && !choice.equalsIgnoreCase("e"));
        System.out.println("-------------------------------------------");
        switch (choice){
            case "l":
            case "L":
                System.out.println("|    OrderListRepo created                |");
                System.out.println("-------------------------------------------");
                createOrderListRepo();
                break;
            case "m":
            case "M":
                System.out.println("|    OrderMapRepo created                 |");
                System.out.println("-------------------------------------------");
                createMapRepo();
                break;
            case "e":
            case "E":
                System.out.println("|    Application shutdown                 |");
                System.out.println("-------------------------------------------");
                break;
        }
    }

    private void createOrderListRepo(){
        ShopService shopService =  new ShopService(new OrderListRepo());
    }

    private void createMapRepo(){
        ShopService shopService = new ShopService(new OrderMapRepo());
    }
}
