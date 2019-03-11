//LC #9
public class PalindromeNumber
{
    public static boolean isPalindrome(int x)
    {
        if(x < 0)
        {
            return false;
        }

        int n = 0;
        int x2 = x;
        while(x2 != 0)
        {
            n = n*10 + x2%10;
            x2 /= 10;
        }
        if(n == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
