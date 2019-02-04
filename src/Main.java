import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    boolean control = true;

        while (true) {
            System.out.println("1. Registrera ny kund");
            System.out.println("2. Handla varor");
            System.out.println("3. Sök kund");
            System.out.println("0. Avsluta");

            switch (readANumber()) {
                case 0:
                    return;  //Lämnar main metoden och därmed avslutas applikationen.
                case 1:
                    guessTheNumber(); customerRegistration
                    break;
                case 2:
                    printWithLoop();
                    break;
                case 3:
                    manyNumbers();
                    break;
                default:
                    System.out.println("Ej giltigt val"); //om användaren väljer ett tal ex 4 som inte finns med//
            }
        }*/

    //private static void nyKund() {
                                               //Vad vill jag läsa in i ny kund? Ange: Namn (Stor bokstav), ange
     //   System.out.println("Name: ");           //vid inläsning godtas endast stor bokstav, vid inläsning tilldelas id.
       // System.out.println("City: ");


        //int[] numbers = new int[customerRegistration];

        //for (int i = 0; i < numberCount; i++) {
          //  System.out.println("Skriv en siffra:");
            //numbers[i] = readANumber();
        //}










    public static void main(String args[]) {            //meny switsh sats.. den som heter ny kund ska metoden ligga i main.
                                                          // alla ut och in skrifter ska ske i main.

        Scanner scan = new Scanner(System.in);

        Customer c1 = new Customer();             // i registrering påkallar jag med objekt den. i metoden i main tar jag
                                                             /* gettern och kallar det jag behöver i customer */
        Customer c2 = new Customer();

        System.out.println("Name: ");
        x = scan.nextInt();



        c1.name = "Robin";
        c1.city = "Göteborg";
        c1.id = 5;


        c2.name = "Mia";
        c2.city = "Ljungskile";
        c2.id = 9;


        System.out.println(c1.name + " " + c1.city + " " + c1.id);
        System.out.println(c2.name + " " + c2.city + " " + c1.id);
    }


    //Public void customerlist(String name, String )
    //  array kund till varor id namn mm


    //ArrayList<customer> customers = new ArrayList<>();{


    }//



