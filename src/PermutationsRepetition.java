public class PermutationsRepetition
{
    public static void printPermutations(char[] chars, int length)
    {
        permute(chars, "", length);
    }

    private static void permute(char[] chars, String s, int length)
    {
        if(length == 0)
        {
            System.out.println(s);
        }
        else
        {
            for(int i = 0; i < chars.length; i++)
            {
                permute(chars, s + chars[i], length - 1);
            }
        }
    }
}
