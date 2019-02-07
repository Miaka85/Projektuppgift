import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);  //reads in input from the console

    CustomerRegistration cr = new CustomerRegistration(); //object by the class CustomerRegistration

    ShoppingCart sc = new ShoppingCart();

    public static void main(String[] args) {
        Main mainObject = new Main();  //Object that enable to reach methods outside the main-method

        while (true) {
            System.out.println("1. Registrera ny kund");
            System.out.println("2. Registrera ny vara"); //ett till case som skriver ut varulista innan denna/eller i
            System.out.println("3. Sök kund"); //getId metod som användaren får ange ett id och söker kund
            System.out.println("4. Skriv ut Lista över kunder"); //genom en metod i main som innehåller en for loop
            System.out.println("0. Avsluta");

            switch (getNumber()) {
                case 0:
                    return;  //Ends the Switch statement
                case 1:
                    mainObject.addCustomer(); //points at the method addCustomers
                    break;
                case 2:
                    mainObject.addProduct();//Product registration metod läsa in varor ();
                    break;
                case 3:
                     //customer registration?se bild tavlan kopplat samman. sök id, metod getId()(vill visa kund och vara);
                    break;
                case 4:
                    mainObject.customerList(); //en metod i main som gör en for loop och pekar på arrayen inuti..gitHub();
                    break;
                default:
                    System.out.println("Ej giltigt val"); //If the user chose a invalid number
            }
        }
    }


    public void addCustomer() {                  //A method that read in and store "name" and "city" from the user.
                                                 //It points at the object "cr" of the class CustomerRegistration
        System.out.println("Enter your Name: "); // and store the input in the customer arrayList
        String name = input.nextLine();
        System.out.println("Enter your City: ");
        String city = input.nextLine();

        cr.addCustomer(new Customer(name,city));
    }

    public void customerList() {
        for (int i = 0; i < cr.customers.size(); i++)  //For loop that list and print all the registrated customers
            System.out.println(cr.customers.get(i));  // /n? för att få list format
                                                      //ska den andra listan ut här med varor och kunder kopplade?
    }

    private void addProduct() {

        System.out.println("Ange en vara: ");
        String name  =input.nextLine();
        System.out.println("Ange varans kategori: ");
        String type  =input.nextLine();
        System.out.println("Ange varans pris: ");
        int price =input.nextInt();
        System.out.println("Ange varans enhet: ");
        String unit =input.nextLine();

    sc.products.add(new Product(name, type, price, unit));

       }

       public void addProductToCustomer()  //lägg till i menyn i svitch satsen!
       {
           //Fråga användaren efter vilket kundid som ska köpa varor
           System.out.println("Ange kund id");
           int chosenId =input.nextInt();

           int id = chosenId;
           Customer customer = cr.getCustomer(id);
           if(customer != null){
               //loopa listan med registrerade produkter här
               //Fråga användaren efter vilken vara som ska köpas och koppla till här under??
               Product product = ??
               customer.products.add(product);

               //läs in detta till arrayen i customers.. färdigt.
           }
           }





    public static int getNumber() {   //denna metod används för att kunna välja rätt siffra i menyvalen i switchsatsen
        int temp = 0;
        boolean validinput = false;  //om användaren skriver in annat än de nummerval som finns
        do {
            try {
                temp = input.nextInt();
                input.nextLine();                      //Även texten (string) som anges i switchsatsen
                validinput = true;
            } catch (InputMismatchException e) {    //Hanterar fel här som om man skriver in bokstav exempelvis

                System.out.println("Error, försök igen.");
                input.next();
            }
        } while (!validinput);
        return temp;
    }
}











