import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {                       //The Main Class

    static Scanner input = new Scanner(System.in);  //reads in input from the console
    CustomerRegistration cr = new CustomerRegistration(); //object by the class CustomerRegistration
    ShoppingCart sc = new ShoppingCart();  //object by the class ShoppingCart

    public static void main(String[] args) throws Exception{    //the main method
        Main mainObject = new Main();  //Object that enable to reach methods outside the static main-method
        mainObject.load();             //points at the method load and the refer to the object mainObject

        while (true) {     //While loop
            System.out.println("1. Registrera ny kund");  //Print out a menu for the customer to chose from by a number.
            System.out.println("2. Registrera ny vara");   //Depending on the customers choice of number the same case runs
            System.out.println("3. Handla varor");         //in the switch statement. The cases in the switch statement
            System.out.println("4. Kundlista");            //points at different methods.
            System.out.println("5. Sök kund och varukorg");
            System.out.println("0. Avsluta");

            switch (getNumber()) {         //switch statement that runs if getNumber method is true
                case 0:
                    return;                 //Ends the Switch statement
                case 1:
                    mainObject.addCustomer();  //points at the method addCustomers that register customers.
                    break;                     //"break" ends the case when it´s finished
                case 2:
                    mainObject.addProduct();  //points at the method addProducts that reads in products
                    break;
                case 3:
                    mainObject.addProductToCustomer(); //points at the method that adds product to customer
                    break;
                case 4:
                    mainObject.customerList(); //points at the method that print a list with all registered customers
                    break;
                case 5:
                    mainObject.seekCustomer(); //point at the method where you can seek a customer id and se it´s products
                    break;
                default:
                    System.out.println("Ej giltigt val"); //If the user chose a invalid number
            }
            mainObject.save();  //refer to the method "save" and the object mainObject
        }
    }

    public void addCustomer() {                  //A method that read in and store "name" and "city" from the user.
                                                 //It points at the object "cr" of the class CustomerRegistration -
        System.out.println("Enter your Name: "); // and store the input in the customer arrayList
        String name = input.nextLine();
        name = firstLetterToUpperCase(name);      // Points at the method "firstLetterToUpperCase" that changes the first -
        System.out.println("Enter your City: ");   //letter in input "name" to uppercase, if the console writes in lowercase
        String city = input.nextLine();
        city = firstLetterToUpperCase(city);

        cr.addCustomer(new Customer(name, city));  // Sends the new values of name and city to addCustomer in the class CustomerRegistration
    }


    public void customerList() {
        for (int i = 0; i < cr.customers.size(); i++)  //For loop that list and print all the registered customers
            System.out.println(cr.customers.get(i));   //The for loop points at the object in main that refer to the array-
    }                                                  //list for all customers

    private void addProduct() {     //method that adds products.

        System.out.println("Ange en vara: ");        //Output asks the console for input
        String name = input.nextLine();              //Console respond with input that set the value to "name"
        System.out.println("Ange varans kategori: ");
        String type = input.nextLine();
        System.out.println("Ange varans pris: ");
        double price = input.nextDouble();
        System.out.println("Ange varans enhet: ");  //output and input. Input sets values to name, type, price and unit
        String unit = input.nextLine();
        input.nextLine();

        sc.addProduct(new Product(name, type, price, unit)); // The new registered products are added to the ShoppingCart-
    }                                                        //array for products

    public static String firstLetterToUpperCase(String input){ //A method that changes first letter in the registered
                                                               // name and city to uppercase
        String first = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1).toLowerCase();

        return first + rest;
    }

    public void addProductToCustomer() {          //This method adds products to customers
        System.out.println("Ange kund id");
        int chosenId = input.nextInt();

        int id = chosenId;                          //gives the consoles input as the value to "id".
        Customer customer = cr.getCustomer(id);   //Sends id to method getCustomer i CustomerRegistration Class.
        if (customer != null) {                  //if the chosenId match a registered customer the if-statement runs the following:

            for (int i = 0; i < sc.products.size(); i++)  //a for-loop that print all the registered products from
                System.out.println(sc.products.get(i));    //the product-arrayList so the customer can select a product to shop

            System.out.println("Välj vara");
            int chosenProduct = input.nextInt();  //The customer is asked to select a product by it´s productID

            int idProduct = chosenProduct;        //idProduct Reads in the chosen products id
            Product product = sc.getProduct(idProduct);
            customer.customerCart.add(product);
            System.out.println(customer);
            System.out.println(customer.customerCart.toString());

        }
    }

    public void seekCustomer() {  //This method seek a customer by it´s ID. It then print the chosen customer, its shoppingBag -
                                  // and the total price of the shoppingBag
        System.out.println("Ange kund id");
        int chosenId = input.nextInt();
        int id = chosenId;
        Customer customer = cr.getCustomer(id);
        System.out.println(customer);                            //print customers
        System.out.println(customer.customerCart.toString());    //prints the products and totalPrice fom the arrayList customerCart

        double totalPrice = 0;    //declares totalPrice as a dataType float och give it a startValue of 0

        for (Product product : customer.customerCart) { // for each loop that adds each customers product-price to a -
            totalPrice += product.getPrice();       // totalValue and the store the value in the arrayList customerCart.

        }
        System.out.println("Total pris: " + totalPrice + "Kr");
    }


    public static int getNumber() {
        int t = 0;                      //This method is pointed to in the switsh statement in the main-method,
        boolean validinput = false;     // it catches if the console asks for a invalid choice in the switsh-statement
        do {                            //for exampel a letter
            try {
                t = input.nextInt();
                input.nextLine();
                validinput = true;
            } catch (InputMismatchException e) {         //Handles mistakes and instead of crash the program it outprint:
                                                         //"ogiltligt val, försök igen"
                System.out.println("ogiltligt val, försök igen");
                input.next();
            }
        } while (!validinput);
        return t;
    }

    public void save() {      //Save object to file

        File file = new File("projektet.bin");
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            out.writeObject(sc.products);
            out.writeObject(cr.customers);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void load() throws Exception {             //loads the object the next start
            File file = new File("projektet.bin");
            try (ObjectInputStream in =
                         new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
              sc.products=(ArrayList<Product>) in.readObject();
              cr.customers=(ArrayList<Customer>) in.readObject();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}









