
/**
 * Write a description of class Subclass2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Subclass2 extends AbstractClass
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Subclass2
     */
    public Subclass2()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void abstractMethod()
    {
        System.out.println("I am abstract!");
    }
}
