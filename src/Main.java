import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    CustomerRegistration customerList = new CustomerRegistration(); //objekt customerList av klassen customerregistration

    public static void main(String[] args) {
        Main mainObject = new Main();

        boolean control = true;

        while (control) {
            System.out.println("1. Registrera ny kund");
            System.out.println("2. Registrera ny vara");
            System.out.println("3. Sök kund");
            System.out.println("0. Avsluta");

            switch (getNumber()) {
                case 0:
                    return;  //Avslutat switch satsen
                case 1:
                    mainObject.addCustomer(); //hur hämtar jag metoden ifrån annan klass? inte genom objekt?
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
        //Scanner input = new Scanner(System.in);  //vad ska referensvariablen i scanner vara om den ska ligga i classen
        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Enter your City: ");
        String city = input.nextLine();

        customerList.customers.add(new Customer(name, city));  //läser in och lagrar "city och name" från användaren.
                                                               //pekar till referens variabeln customerList i objektet i main,
                                                               //och in i arrayen i CustomerRegistration.
    }





    public static int getNumber() {   //denna metod används för att kunna välja rätt siffra i menyvalen i switchsatsen
        int temp = 0;
        boolean validinput = false;  //om användaren skriver in annat än de nummerval som finns
        do {
            try {
                temp = input.nextInt();
                input.nextLine();                      //Även texten (string) som anges i switchsatsen
                validinput = true;
            } catch (InputMismatchException e) {
                                                                  //Hanterar fel här som om man skriver in bokstav exempelvis
                System.out.println(" Ingen siffra. försök igen.");
                input.next();
            }
        } while (!validinput);
        return temp;
    }



}











