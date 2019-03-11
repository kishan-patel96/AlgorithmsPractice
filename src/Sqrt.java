//LC #69
public class Sqrt
{
    public static int mySqrt(int x)
    {
        long r = x;
        while(r*r > x)
        {
            r = (r + x/r) / 2;
        }
        return (int) r;
    }
}
