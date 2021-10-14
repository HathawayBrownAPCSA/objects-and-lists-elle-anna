
/**
 * Constructor for dogs list
 *
 * @author Elle Wearsch
 * @version 9-21-20`
 */
public class Dog
{
    private String dogName;
    private String dogBreed;
    private double dogWeight;
    private int dogAge;
    
    /** The constructor initializes values for name, breed, weight, and age.
     * @param n the name of the dog
     * @param b the breed of the dog
     * @param w the weight of the dog
     * @param a the weight of the dog
     */
    
    public Dog (String n, String b, double w, int a)
    {
        dogName = n;
        dogBreed = b;
        dogWeight = w;
        dogAge = a;
    }
    
    /** Returns a string with all of the information abput the dog
     * @return all the information about the dog
     */
    public String toString()
    {
        return dogName + " is a " + dogBreed + " who is " + dogWeight + "lbs and " 
        + dogAge + " year(s) old.";
    }
    
    /** gets the weight of the dogs
     * @return weight
     */
    public double getWeight()
    {
        return dogWeight;
    }
    
    /** gets names of dogs
     * @return dog name
     */
    public String getName()
    {
        return dogName;
    }
    
     /** gets ages of dogs
     * @return dog age
     */
    public int getAge()
    {
        return dogAge;
    }
}
