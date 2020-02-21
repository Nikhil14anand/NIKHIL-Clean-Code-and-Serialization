package interest;

public class SimpleInterest {
    public static double calculate(double principal, double time, double rate)
    {
        double ans = Double.parseDouble ( String.format ( "%.2f" , principal * time * rate / 100.0 ) );
        return ans;
    }
}
