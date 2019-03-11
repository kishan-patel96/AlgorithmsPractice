//LC #66
public class PlusOne
{
    public static int[] plusOne(int[] digits)
    {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] d = new int[digits.length + 1];
        d[0] = 1;
        return d;
    }
}
