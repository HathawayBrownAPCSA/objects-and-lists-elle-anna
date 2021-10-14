
/**
 * test the class
 *
 * @Anna Buchner
 * @2021-09-20
 */

import java.util.Scanner;

public class tester
{
    public static void main ( String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        
        Invoice myList = new Invoice();
        
        for (int i = 0; i < 3; i++)
        {
            
        System.out.println("enter dog's information");
        
        // read the info 
        System.out.println("Owner's name:   ");
        String owner = kbd.nextLine();
        
        System.out.println("Dog name:    ");
        String name = kbd.nextLine();
        
        System.out.println("Dog breed:    ");
        String breed = kbd.nextLine();
        
        System.out.println("Dog weight:   ");
        double weight = kbd.nextDouble();
        
        System.out.println("Dog age:   ");
        int age = kbd.nextInt();
        
        String dummy = kbd.nextLine();
        
        myList.addDog(new Dog (weight, name, breed, age, owner));
        
        
        }
        
        myList.printInvoice();
        System.out.println("total weight of the dogs is ..." + myList.getTotalWeight());
        System.out.println("here is the list of dog names ..." + myList.getDogNames());
        
        kbd.close();
    }
    

    
}
