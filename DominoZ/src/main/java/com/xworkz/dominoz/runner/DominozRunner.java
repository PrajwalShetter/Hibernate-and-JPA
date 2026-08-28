package com.xworkz.dominoz.runner;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Gender;
import com.xworkz.dominoz.constants.Size;
import com.xworkz.dominoz.controller.EmployeeController;
import com.xworkz.dominoz.controller.PizzaController;
import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.dto.PizzaDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DominozRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PizzaController pizzaController = new PizzaController();
        EmployeeController employeeController = new EmployeeController();

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
                        System.out.println("5. Get All Pizza");
                        System.out.println("6. Get all Pizza Names");
                        System.out.println("8. Get PizzaData By Name");
                        System.out.println("9. Get PizzaBy Prize");
                        System.out.println("10. Add Employee");
                        System.out.println("11. Get All Employee");
                        System.out.println("12. Get Employees By Phone");
                        System.out.println("13. Get Employees By age");
                        System.out.println("7. Back");
                        System.out.print("Enter Your Choice: ");

                        int pizzaChoice = sc.nextInt();
                        sc.nextLine();

                        switch (pizzaChoice) {

                            case 11:
                                List<EmployeeDto> employeeDtos= employeeController.getEmployees();
                                employeeDtos.forEach(e-> System.out.println(e));
                                break;

                            case 10 :
                                System.out.println("\n --------ADD EMPLOYEE ------");
                                System.out.print("Id :");
                                int empId = sc.nextInt();

                                System.out.print("Name :");
                                String empName=sc.nextLine();
                                sc.next();

                                System.out.print("Gender :");
                                Gender empGender = Gender.valueOf(sc.next().toUpperCase());
                                sc.nextLine();

                                System.out.print("Age :");
                                int empAge=sc.nextInt();
                                sc.nextLine();

                                System.out.print("Email :");
                                String empEmail = sc.nextLine();

                                System.out.print("Phone :");
                                long empPhone = sc.nextLong();
                                sc.nextLine();

                                System.out.print("Salary :");
                                BigDecimal empSalary = sc.nextBigDecimal();
                                sc.nextLine();

                                System.out.print("Password :");
                                String empPassword = sc.nextLine();

                                EmployeeDto employeeDto = new EmployeeDto();
                                employeeDto.setId(empId);
                                employeeDto.setName(empName);
                                employeeDto.setSalary(empSalary);
                                employeeDto.setPhone(empPhone);
                                employeeDto.setGender(empGender);
                                employeeDto.setAge(empAge);
                                employeeDto.setEmail(empEmail);
                                employeeDto.setPassword(empPassword);

                                employeeController.saveEmployee(employeeDto);

                                break;


                            case 9:
                                System.out.println("\n ------- get PizzaBy Prize ------");
                                System.out.print("Enter the prize :");
                                double prize = sc.nextDouble();
                                List<PizzaDto> pizzaDtos = pizzaController.getPizzaByPrize(prize);
                                pizzaDtos.stream().forEach(w-> System.out.println(w));
                                break;

                            case 8:
                                System.out.println("\n ------get PizzaData By Name --------");
                                System.out.print("Enter pizza name :");
                                String pizzaName=sc.nextLine();
                                PizzaDto pizzaDto2 = pizzaController.getPizzaDataByName(pizzaName);
                                System.out.println(pizzaDto2);
                                break;

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
                                System.out.println("\n --- Get All Pizza----");

                                List<PizzaDto> pizzas = pizzaController.getAllPizza();

                                for (PizzaDto pizza : pizzas){
                                    System.out.println("Id :"+pizza.getId());
                                    System.out.println("Name :"+pizza.getName());
                                    System.out.println("size :"+pizza.getSize());
                                    System.out.println("Category :"+pizza.getCategory());
                                    System.out.println("Prize :"+pizza.getPrice());
                                    System.out.println("===================");
                                }

                                break;

                            case 6:
                                System.out.println("\n --------Names of all Pizza---------");
                                List<String> names = pizzaController.getPizzaNames();
                                for (String pizzaNames : names){
                                    System.out.println(pizzaNames);
                                }
                                break;

                            case 12:
                                System.out.println("\n ------ Get Employees BY phone ----------");
                                System.out.print("Enter the phoneNo :");
                                long phone = sc.nextLong();
                                sc.nextLine();
                                EmployeeDto employeeDto1 = employeeController.getEmployeeByPhone(phone);
                                System.out.println(employeeDto1);

                                break;

                            case 13:
                                System.out.println("\n ----------Get Employees BY Age ---------");
                                System.out.print("Enter the Age :");
                                int age = sc.nextInt();
                                sc.nextLine();
                                List<EmployeeDto> employeeDtos1 = employeeController.getEmployeeByAge(age);
                                employeeDtos1.forEach(t-> System.out.println(t));

                                break;


                            case 7:

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