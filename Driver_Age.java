
/**
 * Write a description of class Driver_Age here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver_Age
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;
    private int age;

    /**
     * Constructor for objects of class Driver_Age
     */
    public Driver_Age()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void age(int birthYear)
    {
        age = currentYear-birthYear;
        //return age; //you can't use a return statement with void so use int instead
        //if(age=<16){ //the inferior symbol has to be place before the equals
            System.out.println("Your age is: " + age + " , so you can drive");    
        //}
        //else{
            //System.out.println("You'll need to wait " + (16-age) + " more years before you can drive."; //Missing paranthesis
        //}
    }
}
