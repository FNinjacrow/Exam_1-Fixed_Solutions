
/**
 * Write a description of class Driver_Age here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;
    private int age;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int age(int birthYear)
    {
        age = currentYear-birthYear;
        if(age<16){ //the inferior symbol has to be place before the equals // Mixed up the positions of the print statements // get rid of the equal
            System.out.println("You'll need to wait " + (16-age) + " more year(s) before you can drive."); //Missing paranthesis
        }
        else{
            System.out.println("Your age is: " + age + " , so you can drive");    
        }
        return age; //you can't use a return statement with void so use int instead
        // The return statement should be at the bottom
    }
}
