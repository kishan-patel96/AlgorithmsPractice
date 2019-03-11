import java.util.HashMap;
import java.util.Map;

public class GreedyFlorist
{
    private static int p;
    private static int q;
    private static String pattern;
    public static Map<String, Integer> max;

    public static int maxProfit(int p, int q, String pattern)
    {
        GreedyFlorist.p = p;
        GreedyFlorist.q = q;
        GreedyFlorist.pattern = pattern;
        GreedyFlorist.max = new HashMap<>();

        return findMaxProfit(0, 0);
    }

    private static int findMaxProfit(int total, int startIdx)
    {
        if(startIdx == GreedyFlorist.pattern.length())
        {
            return total;
        }
        String s = GreedyFlorist.pattern.substring(startIdx, GreedyFlorist.pattern.length());
        if(GreedyFlorist.max.containsKey(s))
        {
            if(GreedyFlorist.max.get(s) > total)
            {
                return total;
            }
            else
            {
                GreedyFlorist.max.put(s, total);
            }
        }
        else
        {
            GreedyFlorist.max.put(s, total);
        }
        //System.out.println(s + ": " + total);

        int roses = 0;
        boolean cosmos = false;

        boolean type1 = false;
        boolean type2 = false;

        for(int i = startIdx; i < GreedyFlorist.pattern.length(); i++)
        {
            if(GreedyFlorist.pattern.charAt(i) == '0')
            {
                roses++;
                if(roses == 3)
                {
                    startIdx = i;
                    type1 = true;
                    break;
                }
                else if(cosmos)
                {
                    startIdx = i;
                    type2 = true;
                    break;
                }
            }
            else
            {
                cosmos = true;
                if(roses > 0)
                {
                    startIdx = i;
                    type2 = true;
                    break;
                }
            }
        }
        if(type1)
        {
            if(GreedyFlorist.pattern.length() - startIdx > 1 &&
                    GreedyFlorist.pattern.charAt(startIdx + 1) == '1' &&
                    GreedyFlorist.q > GreedyFlorist.p)
            {
                total = Math.max(findMaxProfit(total + GreedyFlorist.p, startIdx + 1), findMaxProfit(total, startIdx));
            }
            else
            {
                total = findMaxProfit(total + GreedyFlorist.p, startIdx + 1);
            }
        }
        else if(type2)
        {
            if(GreedyFlorist.pattern.charAt(startIdx) == '0' &&
                    GreedyFlorist.pattern.length() - startIdx > 1 &&
                    GreedyFlorist.p > GreedyFlorist.q)
            {
                total = Math.max(findMaxProfit(total + GreedyFlorist.q, startIdx + 1), findMaxProfit(total, startIdx));
            }
            else
            {
                total = findMaxProfit(total + GreedyFlorist.q, startIdx + 1);
            }
        }
        return total;
    }
}
