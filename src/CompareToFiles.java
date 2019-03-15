public class CompareToFiles
{
    public static int compareTo(String s1, String s2)
    {
        int len = (s1.length() > s2.length()) ? s2.length():s1.length();

        for(int i = 0; i < len; )
        {
            if(s1.charAt(i) != '.')
            {
                String part1 = s1.substring(i, s1.indexOf(".", i) == -1 ? s1.length():s1.indexOf(".", i));
                String part2 = s2.substring(i, s2.indexOf(".", i) == -1 ? s2.length():s2.indexOf(".", i));

                if(Integer.parseInt(part1) > Integer.parseInt(part2))
                {
                    return 1;
                }
                else if(Integer.parseInt(part1) < Integer.parseInt(part2))
                {
                    return -1;
                }

                i += part1.length();
            }
            else
            {
                i++;
            }
        }

        if(s1.length() > s2.length())
        {
            return 1;
        }
        else if(s1.length() < s2.length())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
