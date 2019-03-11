import java.util.*;

//LC #3
public class LongestSubStrNoRep
{
    public static int lengthOfLongestSubstring(String s)
    {
        int max = 0;
        int currMax = 0;
        int idx = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(!map.containsKey(s.charAt(i)) || idx > map.get(s.charAt(i)))
            {
                currMax++;
            }
            else
            {
                max = Math.max(currMax, max);
                idx = map.get(s.charAt(i));
                currMax = i - map.get(s.charAt(i));
            }
            map.put(s.charAt(i), i);
        }
        return Math.max(currMax, max);
    }
}
