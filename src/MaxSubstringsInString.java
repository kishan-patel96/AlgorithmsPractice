import java.util.*;

public class MaxSubstringsInString
{
    private static String s;
    private static int minLength;
    private static int maxLength;
    private static int maxUnique;

    public static int maxSubstringOccurrence(String s, int minLength, int maxLength, int maxUnique)
    {
        MaxSubstringsInString.s = s;
        MaxSubstringsInString.minLength = minLength;
        MaxSubstringsInString.maxLength = maxLength;
        MaxSubstringsInString.maxUnique = maxUnique;

        return getMaxOcc();
    }

    private static int getMaxOcc()
    {
        Map<String, Integer> m = new HashMap<>();
        for(int i = 0; i <= s.length() - minLength; i++)
        {
            for(int j = i + minLength; j <= s.length() && (j - i) <= maxLength; j++)
            {
                String sub = getSubstring(i, j);
                if(sub != null)
                {
                    System.out.println(sub);
                    if(!m.containsKey(sub))
                    {
                        m.put(sub, 1);
                    }
                    else
                    {
                        m.put(sub, m.get(sub) + 1);
                    }
                }
            }
        }
        return getMaxValue(m);
    }

    private static String getSubstring(int lbnd, int rbnd)
    {
        StringBuilder ss = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(int i = lbnd; i < rbnd; i++)
        {
            ss.append(s.charAt(i));
            set.add(s.charAt(i));
            if(set.size() > maxUnique)
            {
                return null;
            }
        }
        return new String(ss);
    }

    private static int getMaxValue(Map<String, Integer> m)
    {
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : m.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxEntry.getValue();
    }
}
