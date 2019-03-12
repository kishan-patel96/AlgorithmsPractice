import java.util.Arrays;

public class PythagoreanTriplet
{
    public static boolean isTriplet(int[] a)
    {
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
        {
            a[i] *= a[i];
        }

        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = a.length - 1; j > i + 1; j--)
            {
                if(a[i] + a[i + 1] == a[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
