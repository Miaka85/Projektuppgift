import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    static Scanner input = new Scanner(System.in);  //reads in input from the console


    CustomerRegistration cr = new CustomerRegistration(); //object by the class CustomerRegistration

    ShoppingCart sc = new ShoppingCart();  //object by the class ShoppingCart



    public static void main(String[] args) throws Exception{
        Main mainObject = new Main();  //Object that enable to reach methods outside the main-method
        mainObject.load();

        while (true) {     //While loop
            System.out.println("1. Registrera ny kund");
            System.out.println("2. Registrera ny vara");
            System.out.println("3. Handla varor");
            System.out.println("4. Kundlista");
            System.out.println("5. Sök kund och varukorg");
            System.out.println("0. Avsluta");

            switch (getNumber()) {
                case 0:
                    return;  //Ends the Switch statement
                case 1:
                    mainObject.addCustomer();//points at the method addCustomers
                    break;
                case 2:
                    mainObject.addProduct();//points at the method addProducts that reads in products
                    break;
                case 3:
                    mainObject.addProductToCustomer();//points at the method that adds product to customer
                    break;
                case 4:
                    mainObject.customerList();//points at the method that print a list with all registrated customers
                    break;
                case 5:
                    mainObject.seekCustomer();//point at the method where you can seek a customer id and se it´s products
                    break;
                default:
                    System.out.println("Ej giltigt val"); //If the user chose a invalid number
            }
            mainObject.save();
        }
    }


    public void addCustomer() {                  //A method that read in and store "name" and "city" from the user.
                                                 //It points at the object "cr" of the class CustomerRegistration
        System.out.println("Enter your Name: "); // and store the input in the customer arrayList
        String name = input.nextLine();
        name = firstLetterToUpperCase(name);
        System.out.println("Enter your City: ");
        String city = input.nextLine();
        city = firstLetterToUpperCase(city);

        cr.addCustomer(new Customer(name, city));
    }

    public void customerList() {
        for (int i = 0; i < cr.customers.size(); i++)  //For loop that list and print all the registrated customers
            System.out.println(cr.customers.get(i));

    }

    private void addProduct() {

        System.out.println("Ange en vara: ");
        String name = input.nextLine();
        System.out.println("Ange varans kategori: ");
        String type = input.nextLine();
        System.out.println("Ange varans pris: ");
        int price = input.nextInt();
        System.out.println("Ange varans enhet: ");  //output and input. Sends the new values of name, type, price and unit
        String unit = input.nextLine();             // to the class shooppingCart

        sc.addProduct(new Product(name, type, price, unit));

    }

    public static String firstLetterToUpperCase(String input){

        String first = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1).toLowerCase();

        return first + rest;
    }

    public void addProductToCustomer() {
        System.out.println("Ange kund id");
        int chosenId = input.nextInt();

        int id = chosenId;           //gives the input value to id
        Customer customer = cr.getCustomer(id);
        if (customer != null) {

            for (int i = 0; i < sc.products.size(); i++)  //a for-loop that outprint all the registrated products from
                System.out.println(sc.products.get(i));    //the product arraylist

            System.out.println("Välj vara");
            int chosenProduct = input.nextInt();  //

            int idproduct = chosenProduct;      //Idproduct Reads in the new value
            Product product = sc.getProduct(idproduct);
            customer.customerCart.add(product);
            System.out.println(customer);
            System.out.println(customer.customerCart.toString());


        }
    }

    public void seekCustomer() {

        System.out.println("Ange kund id");
        int chosenId = input.nextInt();
        int id = chosenId;
        Customer customer = cr.getCustomer(id);
        System.out.println(customer);
        System.out.println(customer.customerCart.toString());

        float totalPrice = 0;

        for (Product product : customer.customerCart) { // for each loop som plussar på varje kunds
            totalPrice += product.getPrice();       // produkt pris till det totala värdet i varukorgen

        }
        System.out.println("Total pris: " + totalPrice);
    }


    public static int getNumber() {   //denna metod används för att kunna välja rätt siffra i menyvalen i switchsatsen
        int t = 0;
        boolean validinput = false;  //om användaren skriver in annat än de nummerval som finns
        do {
            try {
                t = input.nextInt();
                input.nextLine();                      //Även texten (string) som anges i switchsatsen
                validinput = true;
            } catch (InputMismatchException e) {    //Hanterar fel här som om man skriver in bokstav exempelvis

                System.out.println("Error, försök igen.");
                input.next();
            }
        } while (!validinput);
        return t;
    }

    public void save() {//Save object to file

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

        public void load() {
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









