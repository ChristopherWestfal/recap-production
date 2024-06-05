package org.example;

import org.example.order.OrderListRepo;
import org.example.order.OrderMapRepo;
import org.example.shop.ShopService;

import java.util.Scanner;

public class Input {
    String choice;
    Scanner scanner = new Scanner(System.in);
    ShopService shopService;

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

    public Input(){
        startGui();
    }

    private void startGui(){
        System.out.println("-------------------------------------------");
        System.out.println("|       Welcome to your ShopService       |");
        System.out.println("-------------------------------------------");
        System.out.println("|    OrderRepo with List or with Map?     |");
        System.out.println("|    (1) List                             |");
        System.out.println("|    (2) Map                              |");
        System.out.println("|    (3) Exit                             |");
        System.out.println("-------------------------------------------");
        do {
            System.out.print("     Enter your choice: ");
            choice = scanner.nextLine();
            if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                System.out.println(RED + "     Invalid choice! Try again." + RESET);
            }
        }
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
        System.out.println("-------------------------------------------");
        switch (choice){
            case "1":
                System.out.println("|    OrderListRepo created                |");
                System.out.println("-------------------------------------------");
                createOrderListRepo();
                shopGui();
                break;
            case "2":
                System.out.println("|    OrderMapRepo created                 |");
                System.out.println("-------------------------------------------");
                createMapRepo();
                shopGui();
                break;
            case "3":
                System.out.println("|    Application shutdown                 |");
                System.out.println("-------------------------------------------");
                break;
        }
    }

    private void createOrderListRepo(){
        shopService =  new ShopService(new OrderListRepo());
    }

    private void createMapRepo(){
        shopService = new ShopService(new OrderMapRepo());
    }

    private void shopGui(){
        while(!choice.equals("3")) {
            System.out.println("-------------------------------------------");
            System.out.println("|          Welcome to your Shop           |");
            System.out.println("-------------------------------------------");
            System.out.println("|    (1) Place Order                      |");
            System.out.println("|    (2) Check Product existence          |");
            System.out.println("|    (3) Exit                             |");
            System.out.println("-------------------------------------------");
            do {
                System.out.print("     Enter your choice: ");
                choice = scanner.nextLine();
                if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                    System.out.println(RED + "     Invalid choice! Try again." + RESET);
                }
            }
            while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
            System.out.println("-------------------------------------------");
            switch (choice) {
                case "1":

                    break;
                case "2":
                    checkProductExistence();
                    break;
                case "3":
                    System.out.println("|    Application shutdown                 |");
                    System.out.println("-------------------------------------------");
                    break;
            }
        }

    }

    private void checkProductExistence(){
        System.out.print("     Enter the Productname: ");
        String name = scanner.nextLine();
        System.out.println("-------------------------------------------");
        shopService.checkProductExistence(name);
    }

    private void placeOrder(){

    }
}
