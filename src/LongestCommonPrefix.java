//LC #14
public class LongestCommonPrefix
{
    public static String longestCommonPrefix(String[] strs)
    {
        if(strs == null || strs.length == 0)
        {
            return "";
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++)
        {
            for(int j = 1; j < strs.length; j++)
            {
                if(i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
                {
                    return new String(s);
                }
            }
            s.append(strs[0].charAt(i));
        }
        return new String(s);
    }
}
