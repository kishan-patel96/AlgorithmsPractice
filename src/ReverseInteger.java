//LC #7
public class ReverseInteger
{
    public static int reverse(int x)
    {
        long output = 0;
        while(x != 0)
        {
            output = output * 10 + (x % 10);
            x /= 10;
            if(output < Integer.MIN_VALUE || output > Integer.MAX_VALUE)
            {
                return 0;
            }
        }
        return (int)output;
    }
}
