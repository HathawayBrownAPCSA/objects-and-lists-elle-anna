
/**
 * 
 *
 * @author Elle Wearsch
 * @version 9-21-20
 */
import java.util.Scanner;

public class Tester
{
   public static void main (String[] args)
   {
       Scanner kbd = new Scanner(System.in);
       Invoice myList = new Invoice();
       
       //determines the amount of times the contructor should run
       System.out.println("How many dogs are you inputting information for?: ");
       int dogAmount = kbd.nextInt();
       String dummmy = kbd.nextLine();
       
       for (int i = 0; i < dogAmount; i++)
       {
           //Read info
           System.out.print("Dog name: ");
           String dogName = kbd.nextLine();
           
           System.out.print("Dog breed: ");
           String dogBreed = kbd.nextLine();
           
           System.out.print("Dog weight(lbs): ");
           double dogWeight = kbd.nextDouble();
           
           System.out.print("Dog age: ");
           int dogAge = kbd.nextInt();
           
           String dummy = kbd.nextLine(); //clears input line
           
           //construct new item
           myList.addDog(new Dog (dogName, dogBreed, dogWeight, dogAge));
        }
        myList.printInvoice();
        
        //prints total weight of dogs in the list
        double totalWeight = myList.getTotalWeight();
        System.out.println("The total weight of the dog(s) is " + totalWeight + " lbs.");
        
        //prints total age of dogs in the list
        int totalAge = myList.getTotalAge();
        System.out.println("The total age of the dog(s) is " + totalAge + " lbs.");
        
       kbd.close();
    }
}