import java.util.*;

public class IncreasingOrder
{
    public static List<String> increasingOrder(int digits)
    {
        List<String> output = new ArrayList<>();
        fillList(digits, 0, "", output);
        return output;
    }

    private static void fillList(int digits, int startingDigit, String s, List<String> output)
    {
        if(digits == 0)
        {
            output.add(s);
            return;
        }
        for(int i = startingDigit; i < 10; i++)
        {
            fillList(digits - 1, i + 1, s + i, output);
        }
    }
}
