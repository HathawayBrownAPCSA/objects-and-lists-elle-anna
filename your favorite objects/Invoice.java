
/**
 * Makes a list of dogs 
 *
 * @author Anna Buchner 
 * @version 2021-09-23
 */

import java.util.ArrayList;

public class Invoice
{
    
    ArrayList<Dog> dogList;
    
    /** 
     * constructor for objects of class invoice
     */
    
    public Invoice()
    {
        dogList = new ArrayList<Dog>();
    }

    public void addDog (Dog i)
    {
        dogList.add(i);
    }
    
    public double getTotalWeight()
    {
        double weight = 0.0; 
        for (Dog d : dogList )
        {
            weight += d.getWeight();
        }
        return weight;
    }
    
    public String getDogNames()
    {
        String nameList; 
        nameList = ""; 
        for (Dog bubba : dogList) 
        {
              nameList += bubba.getName() + " " ;
            
        }
        return nameList;
    }

    public void printInvoice()
    {
        System.out.println(dogList);
    
        
        for (Dog bubba : dogList) 
        {
            System.out.println(bubba); 
            
        }
        
    }
    
}

