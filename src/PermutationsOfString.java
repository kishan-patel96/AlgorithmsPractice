public class PermutationsOfString
{
    public static void printPermutations(String s)
    {
        permute(s, 0);
    }

    private static void permute(String s, int x)
    {
        if(x == s.length())
        {
            System.out.println(s);
        }
        else
        {
            for(int i = x; i < s.length(); i++)
            {
                char[] a = s.toCharArray();
                a[i] = (char)((int)a[i] ^ (int)a[x] ^ (int)(a[x] = a[i]));
                permute(new String(a), x + 1);
            }
        }
    }
}
