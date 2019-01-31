import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);                   //Vart ska scanner in och varför? ta in från tangentbordet.


    public static void main(String args[]) {

        Customer c1 = new Customer();
        Customer c2 = new Customer();

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
}
  /*
   ArrayList<customer> customers = new ArrayList<>();//
   public static void guessTheNumber() {
   int secretNumber = (int) (Math.random() * 50) + 1; //formeln: x=random()*(max-min+1)+min. *0,99999 sedan klippa av decimalerna//
   int yourGuess = 0;
   int id = (int) (math.random() ?  //random för att få random id till nya kunder (i klassen customer
   */
  //int random;
//random = (int) (Math.random()*100?);
//id (random)