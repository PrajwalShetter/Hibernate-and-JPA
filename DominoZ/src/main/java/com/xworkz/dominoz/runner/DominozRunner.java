package com.xworkz.dominoz.runner;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Size;
import com.xworkz.dominoz.controller.PizzaController;
import com.xworkz.dominoz.dto.PizzaDto;

import java.util.Scanner;

public class DominozRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PizzaController pizzaController = new PizzaController();

        System.out.println("Hi, Welcome to Dominoz");

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("\nPlease Authenticate Who You Are");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // ================= ADMIN =================
                case 1:

                    boolean isAdmin = true;

                    while (isAdmin) {

                        System.out.println("\nWhat Would You Like To Do?");
                        System.out.println("1. Add Pizza");
                        System.out.println("2. Get Pizza");
                        System.out.println("3. Update Price By Id");
                        System.out.println("4. Delete Pizza By Id");
                        System.out.println("5. Back");
                        System.out.print("Enter Your Choice: ");

                        int pizzaChoice = sc.nextInt();
                        sc.nextLine();

                        switch (pizzaChoice) {

                            case 1:

                                System.out.println("\n--- Add Pizza ---");

                                PizzaDto pizzaDto = new PizzaDto();

                                System.out.print("Id: ");
                                pizzaDto.setId(sc.nextInt());
                                sc.nextLine();

                                System.out.print("Name: ");
                                pizzaDto.setName(sc.nextLine());

                                System.out.print("Size (Small, Medium, Large): ");
                                pizzaDto.setSize(Size.valueOf(sc.next().toUpperCase()));
                                System.out.print("Category (Veg, NonVeg): ");
                                pizzaDto.setCategory(Category.valueOf(sc.next().toUpperCase()));
                                System.out.print("Price: ");
                                pizzaDto.setPrice(sc.nextDouble());
                                sc.nextLine();
                                pizzaController.savePizza(pizzaDto);
                                break;

                            case 2:

                                System.out.println("\n--- Get Pizza ---");
                                System.out.print("Enter the Pizza Id: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                PizzaDto pizzaDto1 =pizzaController.getPizza(id);
                                System.out.println(pizzaDto1);
                                break;

                            case 3:

                                System.out.println("\n--- Update Price By Id ---");
                                System.out.print("Enter Pizza Id: ");
                                int id1 = sc.nextInt();
                                System.out.print("Enter the New Price: ");
                                double price = sc.nextDouble();
                                sc.nextLine();
                                boolean done = pizzaController.updatePriceById(id1, price);
                                System.out.println("Update Status: " + done);
                                break;

                            case 4:

                                System.out.println("\n--- Delete Pizza ---");
                                System.out.print("Enter your Pizza Id: ");
                                int id2 = sc.nextInt();
                                sc.nextLine();
                                boolean delete = pizzaController.deletePizzaById(id2);
                                System.out.println("Delete Status: " + delete);
                                break;

                            case 5:

                                System.out.println("Returning to Main Menu...");
                                isAdmin = false;
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter 1 to 5.");
                        }
                    }
                    break;


                // ================= USER =================
                case 2:

                    System.out.println("\n--- User ---");
                    System.out.println("User functionality coming soon.");
                    break;


                // ================= EXIT =================
                case 3:

                    System.out.println("Thank you for visiting Dominoz!");
                    isRunning = false;
                    break;


                // ================= INVALID MAIN MENU =================
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }

        sc.close();
    }
}