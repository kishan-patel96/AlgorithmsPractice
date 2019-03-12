public class EnigmaMachine
{
    public static int permuations(int len)
    {
        return perms(len, 0) - 2;
    }

    private static int perms(int len, int count)
    {
        if(len == 0)
        {
            return (++count) % (int)Math.pow(10, 9) + 7;
        }
        for(int i = 0; i < 2; i++)
        {
            count =  perms(len - 1, count);
        }
        return count;
    }
}
