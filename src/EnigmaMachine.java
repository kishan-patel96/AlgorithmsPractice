public class EnigmaMachine
{
    public static int permuations(int len)
    {
        //return perms(len, 0) + 5;
        return bottomUp(len) + 5;
    }

    public static int perms(int len, int count)
    {
        if(len == 0)
        {
            return (++count) % (int)Math.pow(10, 9);
        }
        for(int i = 0; i < 2; i++)
        {
            count =  perms(len - 1, count);
        }
        return count;
    }

    public static int bottomUp(int len)
    {
        int retval = 2;
        for(int i = 1; i < len; i++)
        {
            retval = (retval * 2) % (int)Math.pow(10, 9);
        }
        return retval;
    }
}
