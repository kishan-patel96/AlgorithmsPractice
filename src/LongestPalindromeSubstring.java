public class LongestPalindromeSubstring
{
    //O(n^2)
    public static String getPalindrome(String s)
    {
        StringBuilder pipedString = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            pipedString.append('|');
            pipedString.append(s.charAt(i));
            if(i == s.length() - 1)
            {
                pipedString.append('|');
            }
        }
        s = new String(pipedString);

        String longestPali = "";
        for(int i = 1; i < s.length() - 1; i++)
        {
            String currString = (s.charAt(i) == '|') ? "":s.charAt(i) + "";
            for(int j = i - 1, k = i + 1; j >= 0 && k < s.length(); j--, k++)
            {
                if(s.charAt(j) == s.charAt(k))
                {
                    if(s.charAt(j) == '|' || s.charAt(k) == '|')
                    {
                        continue;
                    }
                    else
                    {
                        currString = s.charAt(j) + currString + s.charAt(k);
                    }
                }
                else
                {
                    break;
                }
            }
            if(currString.length() > longestPali.length())
            {
                longestPali = currString;
            }
        }
        return longestPali;
    }

    //O(n^2)... but much faster; take note of checking for repeating characters!
    public static String getPalindrome2(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        if (s.length() == 1)
        {
            return s;
        }
        int min_start = 0, max_len = 1;
        for (int i = 0; i < s.length();)
        {
            if (s.length() - i <= max_len / 2)
            {
                break;
            }
            int j = i, k = i;
            while (k < s.length() - 1 && s.charAt(k + 1) == s.charAt(k))
            {
                ++k;
            }
            i = k+1;
            while (k < s.length() - 1 && j > 0 && s.charAt(k + 1) == s.charAt(j - 1))
            {
                ++k;
                --j;
            }
            int new_len = k - j + 1;
            if (new_len > max_len)
            {
                min_start = j;
                max_len = new_len;
            }
        }
        return s.substring(min_start, max_len + min_start);
    }
}
