import java.util.*;

public class CondenseConsecutive
{
    public static List<String> increasingOrder(List<Integer> input)
    {
        if(input == null || input.size() == 0)
        {
            return null;
        }
        List<String> output = new ArrayList<>();
        boolean consec = false;
        Integer min = null;
        for(int i = 0; i < input.size(); i++)
        {
            if(i != input.size() - 1 && input.get(i) + 1 == input.get(i + 1))
            {
                if(min == null)
                {
                    min = input.get(i);
                }
                consec = true;
            }
            else
            {
                if(consec)
                {
                    output.add(min + "->" + input.get(i));
                    min = null;
                    consec = false;
                    continue;
                }
                output.add(input.get(i) + "");
            }
        }
        return output;
    }
}
