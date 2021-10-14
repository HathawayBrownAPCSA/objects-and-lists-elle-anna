
/**
 * Represents dogs 
 *
 * @Anna Buchner 
 * @2021-09-20 
 */

public class Dog 
{
    // instance variables - replace the example below with your own

    private double weight;
    private String name; 
    private String breed; 
    private int age;
    private String owner;
    private int years;

    /** the contructor initializes values for weight, name, breed, age, owner, and calculates
     * the age in dog years 
     * @param w The weight of the dog 
     * @param n The name of the dog 
     * @param b The breed of the dog 
     * @param a The age of the dog 
     * @param o The Owner of the dog 
     * 
     */ 
    
    public Dog(double w, String n, String b, int a, String o)
    {
        // initialise instance variables
        weight = w;
        name = n; 
        breed = b;
        age = a;
        owner = o;
        years = a * 7;
    }
    
    /** Returns a string with all of the information about the dog
     * @return all the information about the dog 
     */
    
    public String toString()
    {
        return owner + "'s dog is named " + name + " and weights " + weight 
            + " lbs. The dog is a " + breed + " and is " + age + " years old";
                
    }

    
    /** Returns the initial age multiplied by 7 to give the age in dog years 
     * @return the initial age multiplied by 7 
     */
    
    public int getDogYears()
    {
        return years;
    }
    
    
    /** updates the age of the dog 
     * @pararm newAge  The updated age of the dog 
     */
    
    public void setAge(int newAge)
    {
        age = newAge;
    }
    
    
    /** gets the weights of the dogs 
     * @return weight 
     */
    public double getWeight()
    {
        return weight;
    }
    
    
    /** gets names of dogs 
     * @return dog name
     */
    public String getName()
    {
        return name;
    }
}
