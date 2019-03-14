//LC 242
public class IsPermutation
{
    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        int[] a = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            a[(int)s.charAt(i) - (int)'a']++;
        }
        for(int i = 0; i < t.length(); i++)
        {
            if(--a[(int)t.charAt(i) - (int)'a'] == -1)
            {
                return false;
            }
        }

        return true;
    }
}
