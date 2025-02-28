
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    // instance variables - replace the example below with your own
    private int netPay;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double netPay(int salary)
    {
        double deduction = salary * 0.3; //needs to be converted from int to double
        double netPay = salary - deduction; //needs to be converted from int to double
        return netPay;
    }
}
