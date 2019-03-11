public class LengthOfLastWord
{
    public static int lengthOfLastWord(String s)
    {
        s = s.trim();
        int idx = s.length() - 1;
        while(idx >= 0 && s.charAt(idx) != ' ')
        {
            idx--;
        }
        return s.length() - idx - 1;
    }
}
