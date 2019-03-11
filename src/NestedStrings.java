public class NestedStrings
{
    private static String s;

    public static String printNestedString(String s)
    {
        NestedStrings.s = s;
        expandString(0, null, null);
        return NestedStrings.s;
    }

    private static void expandString(int currIdx, Integer leftBound, Integer rightBound)
    {
        System.out.println(s);
        if(currIdx == 0)
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == '(')
                {
                    expandString(i + 1, i, null);
                }
                else if(Character.isDigit(s.charAt(i)) && s.charAt(i + 1) != '(')
                {
                    StringBuilder sub = new StringBuilder();
                    for(int j = 0; j < s.charAt(i) - '0'; j++)
                    {
                        sub.append(s.charAt(i + 1));
                    }
                    s = s.substring(0, i) + new String(sub) + ((i + 2 < s.length()) ? s.substring(i + 2, s.length()):"");
                }
            }
        }
        else if(rightBound == null)
        {
            for(int i = currIdx; i < s.length(); i++)
            {
                if(s.charAt(i) == '(')
                {
                    expandString(i + 1, i, null);
                }
                else if(s.charAt(i) == ')')
                {
                    expandString(i + 1, leftBound, i);
                    return;
                }
                else if(Character.isDigit(s.charAt(i)) && s.charAt(i + 1) != '(')
                {
                    StringBuilder sub = new StringBuilder();
                    for(int j = 0; j < s.charAt(i) - '0'; j++)
                    {
                        sub.append(s.charAt(i + 1));
                    }
                    s = s.substring(0, i) + new String(sub) + ((i + 2 < s.length()) ? s.substring(i + 2, s.length()):"");
                }
            }
        }
        else
        {
            String currString = s.substring(leftBound + 1, rightBound);
            StringBuilder sub = new StringBuilder();
            for(int i = 0; i < s.charAt(leftBound - 1) - '0'; i++)
            {
                sub.append(currString);
            }
            s = s.substring(0, leftBound - 1) + new String(sub) + ((currIdx < s.length()) ? s.substring(currIdx, s.length()):"");
        }
    }
}
