package Week4.Task7.Operations;

/**
 * Created by Oggy Osbourne on 26.12.2017.
 */
class OperDivide implements Operation {
    public double exec(double valueOne, double valueTwo ) throws IllegalArgumentException {
        if (valueTwo == 0)
        {
            throw new IllegalArgumentException("Так нельзя делить");
        }
        return (valueOne / valueTwo);
    }
}
