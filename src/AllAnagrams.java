import java.util.ArrayList;
import java.util.List;

//LC 438
public class AllAnagrams
{
    public static List<Integer> findAllAnagrams(String s, String p)
    {
        List<Integer> res = new ArrayList<>();
        if(p.length() > s.length())
        {
            return res;
        }

        int[] chars = new int[26];
        for(char c : p.toCharArray())
        {
            chars[c - 'a']++;
        }

        for(int left = 0, right = 0, count = p.length(); right < s.length(); )
        {
            if(chars[s.charAt(right++) - 'a']-- > 0)
            {
                count--;
            }
            if(count == 0)
            {
                res.add(left);
            }
            if(right - left == p.length() && chars[s.charAt(left++) - 'a']++ >= 0)
            {
                count++;
            }
        }

        return res;
    }
}
