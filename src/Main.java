import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    CustomerRegistration customerList = new CustomerRegistration(); //objekt customerList av klassen customerregistration

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean control = true;

        while (control) {
            System.out.println("1. Registrera ny kund");
            System.out.println("2. Registrera ny vara");
            System.out.println("3. Sök kund");
            System.out.println("0. Avsluta");

            switch (getNumber()) {
                case 0:
                    return;  //Lämnar main metoden och därmed avslutas applikationen.
                case 1:
                    //customerRegistration customerList?(); //hur hämtar jag metoden ifrån annan klass? inte genom objekt?
                    break;
                case 2:
                    //Product registration metod läsa in varor ();
                    break;
                case 3:
                    //customer registration?se bild tavlan kopplat samman();
                    break;
                default:
                    System.out.println("Ej giltigt val"); //om användaren väljer ett tal som ej finns med
            }
        }


    }


    public void addCustomer() {

        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Enter your City: ");
        String city = input.nextLine();

        customerList.customers.add(new Customer(name, city));  //läser in och lagrar "city och name" från användaren.
                                                               //pekar till referens variabeln customerList i objektet i main,
                                                               //och in i arrayen i CustomerRegistration.
    }





    public static int getNumber() {   //denna metod används för att kunna välja rätt siffra i menyvalen i switchsatsen
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        boolean validinput = false;  //om användaren skriver in annat än de nummerval som finns
        do {
            try {
                temp = sc.nextInt();
                validinput = true;
            } catch (InputMismatchException e) {
                                                                  //Hanterar fel här som om man skriver in bokstav exempelvis
                System.out.println(" Ingen siffra. försök igen.");
                sc.next();
            }
        } while (!validinput);
        return temp;
    }



}











